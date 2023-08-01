
class Immobile {
    private String codice;
    private String indirizzo;
    private String cap;
    private String città;
    private int superficie;
    private int personeInteressate;

    public Immobile(String codice, String indirizzo, String cap, String città, int superficie) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.città = città;
        this.superficie = superficie;
        this.personeInteressate = 0;
    }

    public int getPersoneInteressate() {
        return personeInteressate;
    }

    public String getCodice() {
        return codice;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public String getCittà() {
        return città;
    }
    public void incrementaPersoneInteressate() {
        personeInteressate++;
    }

    public void reimpostaSuperfici(int nuovaSuperficie) {
        this.superficie = nuovaSuperficie;
    }

    @Override
    public String toString() {
        return "Codice: " + codice +
                ", Indirizzo: " + indirizzo +
                ", CAP: " + cap +
                ", Città: " + città +
                ", Superficie: " + superficie +
                ", Persone interessate: " + personeInteressate;
    }
}

