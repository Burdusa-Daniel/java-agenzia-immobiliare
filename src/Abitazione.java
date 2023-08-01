class Abitazione extends Immobile {
    private int numeroVani;
    private int numeroBagni;

    public Abitazione(String codice, String indirizzo, String cap, String città, int superficie, int numeroVani, int numeroBagni) {
        super(codice, indirizzo, cap, città, superficie);
        this.numeroVani = numeroVani;
        this.numeroBagni = numeroBagni;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero vani: " + numeroVani + ", Numero bagni: " + numeroBagni;
    }
}
