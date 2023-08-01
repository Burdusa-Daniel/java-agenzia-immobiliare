public class Main {
    public static void main(String[] args) {
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();

        Box box = new Box("BUI0", "Via PincoPallo", "0", "Roma", 1, 1);
        Abitazione abitazione = new Abitazione("SER3", "Via PalloPinco", "00", "Roma", 1, 1, 1);
        Villa villa = new Villa("VER0", "Via PincoPinco", "000", "Roma", 1, 1, 1, 1);
        agenzia.aggiungiImmobile(box);
        agenzia.aggiungiImmobile(abitazione);
        agenzia.aggiungiImmobile(villa);

        System.out.println("Descrizione Box: " + box.toString());
        System.out.println("Descrizione Abitazione: " + abitazione.toString());
        System.out.println("Descrizione Villa: " + villa.toString());

        System.out.println("Ricerca immobile, inserisci il codice :");
        Immobile immobileCercato = agenzia.cercaImmobile("BUI0");
        if (immobileCercato != null) {
            System.out.println(immobileCercato.toString());
        } else {
            System.out.println("Immobile non trovato.");
        }

        box.incrementaPersoneInteressate();
        abitazione.incrementaPersoneInteressate();
        villa.incrementaPersoneInteressate();
        villa.incrementaPersoneInteressate();
        System.out.println("Immobile con maggior numero di persone interessate:");
        Immobile piuBello = agenzia.immobileConPiuLike();
        if (piuBello != null) {
            System.out.println(piuBello.toString());
        } else {
            System.out.println("Nessun immobile presente.");
        }
    }
}