package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

import java.util.Arrays;

public class Filmarkiv2 implements FilmarkivADT{
    private int antall;
    private LinearNode<Film> start;
    // Ingen referanse til siste, kun start
    ...
    /*  Klassen skal ha de samme operasjoner som for Filmarkiv i
        øving 2, men pass på at implementeringen av alle metoder
        blir tilpasset den nye strukturen. */





    public Filmarkiv2() {
        this.antall=0;

    }

    private Film[] utvid(Film[] tmp) {

    return null;

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
        if (antall==0) {

            start.setElement(nyFilm);
        }else{
            LinearNode<Film>neste = null;
            neste.setElement(nyFilm);
            start.setNeste(neste);
        }

        antall++;

    }

    @Override
    public boolean slettFilm(int filmnr) {


    }

    @Override
    public Film[] soekTittel(String delstreng) {


    }

    @Override
    public int antall(Sjanger sjanger) {


    }

    @Override
    public int antall() {
        return antall;
    }

}
