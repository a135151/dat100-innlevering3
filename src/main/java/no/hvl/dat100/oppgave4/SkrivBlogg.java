package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {
            PrintWriter writer = new PrintWriter(mappe + "/" + filnavn);

            writer.print(samling.toString());

            writer.close();


            return true;
        } catch (FileNotFoundException e) {

            System.out.println("Fil ikke funnet eller tilgang nektet: " + filnavn);
            return false;
        }
    }
}