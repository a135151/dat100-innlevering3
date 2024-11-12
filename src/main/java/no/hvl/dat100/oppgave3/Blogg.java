package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

    public Blogg() {
        this(20);
    }

    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (finnes(innlegg)) {
            return false;
        }

        if (ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
    	
        StringBuilder sb = new StringBuilder();
        
        sb.append(nesteledig).append("\n");

        for (int i = 0; i < nesteledig; i++) {
            sb.append(innleggtabell[i].toString());
        }

        return sb.toString();
    }

}
