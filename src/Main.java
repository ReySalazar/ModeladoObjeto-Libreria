public class Main {
    public static void main(String[] args) {
        Libro infantil1 = new Infantil("El principito", 150, 1500.00);
        Libro infantil2 = new Infantil("Masha y el oso", 680, 2500.00);
        Libro infantil3 = new Infantil("Caperucita Roja", 345, 1800.00);
        Libro tecnico1 = new Tecnico("Java para principantes", 980, 5000.00, false);
        Libro tecnico2 = new Tecnico("POO en una semana", 240, 3200.00, true);
        Libro tecnico3 = new Tecnico("La biblia de Java", 1500, 6800.00, false);
        Libro tecnico4 = new Tecnico("Receta de Cocina", 20, 550.00, true);

        // Guardamos los libros usando el método estático guardarLibro()
        RegistroLibro.guardarLibro(infantil1);
        RegistroLibro.guardarLibro(infantil2);
        RegistroLibro.guardarLibro(infantil3);
        RegistroLibro.guardarLibro(tecnico1);
        RegistroLibro.guardarLibro(tecnico2);
        RegistroLibro.guardarLibro(tecnico3);
        RegistroLibro.guardarLibro(tecnico4);

        System.out.println("\n---------------------- LA LIBRERÍA DE PAPEL  ----------------------------\n");
        System.out.println("\n################ Libros ordenados alfabeticamente  #######################");
        RegistroLibro.mostrarLibros();

        System.out.println("\n######################## Libros Extensos   ##############################");
        RegistroLibro.mostrarLibrosExtensos();

        RegistroLibro.eliminarLibro(tecnico4);

        System.out.println("\n#################  Un libro eliminado de la lista  ######################");
        RegistroLibro.mostrarLibros();

    }

}