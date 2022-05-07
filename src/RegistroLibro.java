import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegistroLibro {
    private static List <Libro> libros = new ArrayList<>();

    public static void guardarLibro(Libro libro){
        if(libro.getTitulo() != null) {
            libros.add(libro);
            Collections.sort(libros);
        }else{
            System.out.println("ERROR!! No puede guardar un libro sin título");
        }
    }

    public static void mostrarLibros(){
        for (int i = 0; i < libros.size(); i++){
            Libro libroActual = libros.get(i);
            System.out.println(libroActual);
        }
    }

    public static void eliminarLibro(Libro libro){
        for(int i=0; i<libros.size(); i++){
            Libro libroActual = libros.get(i);
            if(libroActual.getTitulo().equals(libro.getTitulo())){
                libros.remove(i);
                break;
            }
        }
    }

    public static void mostrarLibrosExtensos(){
        for (int i = 0; i < libros.size(); i++){
            Libro libroActual = libros.get(i);
            if(libroActual.getNroPaginas() > 500) {
                System.out.println(libroActual + " con " + libroActual.getNroPaginas() + " páginas");
            }
        }
    }

}
