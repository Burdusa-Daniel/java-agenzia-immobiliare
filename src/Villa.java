class Villa extends Abitazione {
    private int superficieGiardino;

    public Villa(String codice, String indirizzo, String cap, String città, int superficie, int numeroVani, int numeroBagni, int superficieGiardino) {
        super(codice, indirizzo, cap, città, superficie, numeroVani, numeroBagni);
        this.superficieGiardino = superficieGiardino;
    }

    public void reimpostaSuperfici(int nuovaSuperficie) {
        setSuperficie(nuovaSuperficie);
    }

    public void reimpostaSuperfici(int nuovaSuperficie, int nuovaSuperficieGiardino) {
        setSuperficie(nuovaSuperficie);
        this.superficieGiardino = nuovaSuperficieGiardino;
    }

    @Override
    public String toString() {
        return super.toString() + ", Superficie giardino: " + superficieGiardino;
    }
}
