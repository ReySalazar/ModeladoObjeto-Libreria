public class Infantil extends Libro {
    private String rangoEdad;

    public Infantil(String titulo, int nroPaginas, double precio) {
        super(titulo, nroPaginas, precio);
        setRangoEdad("para menores entre 9 y 12 años");
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    @Override
    public String toString() {
        return "INFANTIL: " +
                super.getTitulo() +
                ", $" +
                super.getPrecio() +
                " " +
                getRangoEdad();
    }

}
