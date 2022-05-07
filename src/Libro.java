public class Libro implements Comparable<Libro>{
    private String titulo;
    private int nroPaginas;
    private double precio;

    public Libro(String titulo, int nroPaginas, double precio) {
        this.titulo = titulo;
        this.nroPaginas = nroPaginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Libro l) {
        int n = l.getTitulo().compareTo(titulo);
        if (n > 0) {
            return -1;
        } else if (n < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
