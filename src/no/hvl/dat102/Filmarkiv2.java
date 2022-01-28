package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;


public class Filmarkiv2 implements FilmarkivADT{
    private int antall;
    private LinearNode<Film> start;



    public Filmarkiv2() {

        this.antall = 0;
    }




    @Override
    public Film finnFilm(int nr) {
        LinearNode<Film> tmp=start;



        for (int i = 0; i < antall(); i++) {
            Film tmpFilm = tmp.getElement();

            if (tmpFilm.getFilmnr()==nr)return tmpFilm;

            tmp=tmp.getNeste();

        }
        return null;

    }

    @Override
    public void leggTilFilm(Film nyFilm) {

        LinearNode<Film> nyNode = new LinearNode<>(nyFilm);

        nyNode.setNeste(start);
        start=nyNode;

        antall++;

    }

    @Override
    public boolean slettFilm(int filmnr) {

        if (finnFilm(filmnr) != null) {

            LinearNode<Film> slettes = new LinearNode<>(finnFilm(filmnr));

            slettes.setElement(start.getElement());

            start = start.getNeste();

            antall--;

            return true;
        }
        return false;

    }

    @Override
    public Film[] soekTittel(String delstreng) {
        Film[] search = new Film [antall()];
        int antallsok = 0;

        LinearNode<Film> node = start;

        for (int i = 0; i < antall(); i++) {

            if (node.getElement().getTittel().contains(delstreng)){

                search[antallsok] = node.getElement();
                antallsok++;

            }
            node = node.getNeste();
        }

        return search;


    }

    @Override
    public int antall(Sjanger sjanger) {

        LinearNode<Film> node = start;
        int antall = 0;

        for (int i = 0; i<antall(); i++){


            if (node.getElement().getSjanger() == sjanger){
                antall++;
            }
            node = node.getNeste();
        }
        return antall;


    }

    @Override
    public int antall() {
        return antall;
    }

}
