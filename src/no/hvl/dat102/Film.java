package no.hvl.dat102;

import java.util.Objects;

public class Film {
    private int filmnr;
    private String filmskaper;
    private String tittel;
    private int lanseringsAar;
    private Sjanger sjanger;
    private String filmselskap;

    public Film() {
    }

    public Film(int filmnr, String filmskaper, String tittel, int lanseringsAar, Sjanger sjanger, String filmselskap) {
        this.filmnr = filmnr;
        this.filmskaper = filmskaper;
        this.tittel = tittel;
        this.lanseringsAar = lanseringsAar;
        this.sjanger = sjanger;
        this.filmselskap = filmselskap;
    }

    public int getFilmnr() {
        return filmnr;
    }

    public void setFilmnr(int filmnr) {
        this.filmnr = filmnr;
    }

    public String getFilmskaper() {
        return filmskaper;
    }

    public void setFilmskaper(String filmskaper) {
        this.filmskaper = filmskaper;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getLanseringsAar() {
        return lanseringsAar;
    }

    public void setLanseringsAar(int lanseringsAar) {
        this.lanseringsAar = lanseringsAar;
    }

    public Sjanger getSjanger() {
        return sjanger;
    }

    public void setSjanger(Sjanger sjanger) {
        this.sjanger = sjanger;
    }

    public String getFilmselskap() {
        return filmselskap;
    }

    public void setFilmselskap(String filmselskap) {
        this.filmselskap = filmselskap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return getFilmnr() == film.getFilmnr();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFilmnr());
    }

}
