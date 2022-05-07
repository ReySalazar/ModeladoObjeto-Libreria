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

    /*@Override
    public int compareTo(Libro l) {
        int n = l.getTitulo().compareTo(super.getTitulo());
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }*/

}
