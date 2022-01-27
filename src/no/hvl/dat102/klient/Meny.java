package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {
    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;

    public Meny(FilmarkivADT filmarkiv){
        tekstgr = new Tekstgrensesnitt();
        this.filmarkiv = filmarkiv;
    }

    public void start(){


        filmarkiv.leggTilFilm(tekstgr.lesFilm());
        filmarkiv.leggTilFilm(tekstgr.lesFilm());
        filmarkiv.leggTilFilm(tekstgr.lesFilm());
        filmarkiv.leggTilFilm(tekstgr.lesFilm());



    }

}
