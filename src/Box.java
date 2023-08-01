class Box extends Immobile {
    private int numeroPostiAuto;

    public Box(String codice, String indirizzo, String cap, String città, int superficie, int numeroPostiAuto) {
        super(codice, indirizzo, cap, città, superficie);
        this.numeroPostiAuto = numeroPostiAuto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero posti auto: " + numeroPostiAuto;
    }
}
