package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;


import java.util.Arrays;

public class Filmarkiv implements FilmarkivADT {

    private Film[] filmArkiv;
    private int antall;


    public Filmarkiv(int antall) {
        Film[] filmArkiv = new Film[antall];
        this.antall = 0;
    }

    private Film[] utvid(Film[] tmp) {


        return Arrays.copyOf(tmp, tmp.length * 2);

    }

    @Override
    public Film finnFilm(int nr) {

        for (Film film : filmArkiv) {
            if (film.getFilmnr() == nr) System.out.println(film); return film;
        }
        return null;



    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        if (antall - 1 == filmArkiv.length) {
            filmArkiv = utvid(filmArkiv);
        }
        filmArkiv[antall] = nyFilm;
        antall++;

    }

    @Override
    public boolean slettFilm(int filmnr) {
        boolean flag = false;
        for (int i = 0; i < antall; i++) {
            if (filmArkiv[i].getFilmnr() == filmnr) {
                flag = true;
                for (int j = i; j < filmArkiv.length; j++) {
                    filmArkiv[j] = filmArkiv[j + 1];
                }
            }

        }
        if (flag) {
            filmArkiv[antall] = null;
            antall--;
        }
        return flag;

    }

    @Override
    public Film[] soekTittel(String delstreng) {

        Film[] search = new Film [antall];

        for (int i = 0; i < antall-1; i++) {

            if (filmArkiv[i].getTittel().contains(delstreng)){
                search[i] = filmArkiv[i];
            }

        }
        return search;

    }

    @Override
    public int antall(Sjanger sjanger) {
        int tmp = 0;
        for (int i = 0; i < filmArkiv.length; i++) {

            if(filmArkiv[i].getSjanger().equals(sjanger)){
                tmp++;
            }

        }
        return tmp;

    }

    @Override
    public int antall() {
        return antall;
    }
    private Film[] trimTab(Film[] tab, int n) {
        // n er antall elementer
        Film[] nytab = new Film[n];
        int i = 0;
        while (i < n) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }
}
