package no.hvl.dat102.klient;
import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Tekstgrensesnitt {
    // lese opplysningene om en FILM fra tastatur
    public Film lesFilm(){
        Scanner scanner = new Scanner(System.in);
        Film film = new Film(scanner.nextInt(), scanner.next(),scanner.next(), scanner.nextInt(), Sjanger.finnSjanger(scanner.next()),scanner.next());
        scanner.close();
        return film;
    }

    // vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void visFilm(Film film) {

        System.out.println(film.getTittel());
        System.out.println(film.getSjanger());
        System.out.println(film.getLanseringsAar());


        // TODO
    }

    // Skrive ut alle Filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,
                                            String delstreng) {

        System.out.println(Arrays.toString(filma.soekTittel(delstreng)));

        // TODO
    }

    // Skriver ut alle Filmer av en produsent / en gruppe
    public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {

        for (int i = 0; i < filma.antall()-1; i++) {

            if(filma.finnFilm(i).getFilmskaper().equals(delstreng)){
                System.out.println(filma.finnFilm(i).getTittel());
            }



        }
        // TODO
    }

    // Skrive ut en enkel statistikk som inneholder antall Filmer totalt
    // og hvor mange det er i hver sjanger
    public void skrivUtStatistikk(FilmarkivADT filma) {

        System.out.println(filma.antall());
        System.out.println(filma.antall(Sjanger.SCIFI));
        System.out.println(filma.antall(Sjanger.ACTION));
        System.out.println(filma.antall(Sjanger.DRAMA));
        System.out.println(filma.antall(Sjanger.HISTORY));




        // TODO
    }
    // ... Ev. andre metoder

}
