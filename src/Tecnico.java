public class Tecnico extends Libro{
    private boolean materialExtra;

    public Tecnico(String titulo, int nroPaginas, double precio, boolean materialExtra) {
        super(titulo, nroPaginas, precio);
        this.materialExtra = materialExtra;
    }

    public boolean isMaterialExtra() {
        return materialExtra;
    }

    public void setMaterialExtra(boolean materialExtra) {
        this.materialExtra = materialExtra;
    }

    @Override
    public String toString() {
        return "TÉCNICO: " +
                super.getTitulo() +
                ", $" +
                super.getPrecio();
    }
}
