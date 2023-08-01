import java.util.ArrayList;
class AgenziaImmobiliare {
    private ArrayList<Immobile> immobili;

    public AgenziaImmobiliare() {
        this.immobili = new ArrayList<>();
    }

    public void aggiungiImmobile(Immobile immobile) {
        immobili.add(immobile);
    }

    public Immobile cercaImmobile(String codice) {
        for (Immobile immobile : immobili) {
            if (immobile.getCodice().equals(codice)) {
                return immobile;
            }
        }
        return null;
    }

    public Immobile immobileConPiuLike() {
        int maxPersoneInteressate = -1;
        Immobile immobileMax = null;

        for (Immobile immobile : immobili) {
            int personeInteressate = immobile.getPersoneInteressate();
            if (personeInteressate > maxPersoneInteressate) {
                maxPersoneInteressate = personeInteressate;
                immobileMax = immobile;
            }
        }

        return immobileMax;
    }
}