public class Persona1 {
    String nombre;
    int edad;
    char genero;

    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int e) {
        edad = e;
    }

    char getGenero() {
        return genero;
    }

    void setGenero(char g) {
        genero = g;
    }

    public static void main(String[] args) {
        Persona op = new Persona();

        op.setNombre("Juan");
        System.out.println(op.getNombre() + " es un estudiante que esta cursando Paradigmas.");

        Estudiante oe = new Estudiante();

        oe.setNombre("Pedro");
        System.out.println(oe.getNombre());

        Estudiante oe1 = new Estudiante();

        oe1.setNombre("Julio");
        System.out.println(oe1.getNombre());

        Trabajador ot = new Trabajador();

        ot.setNombre("Pablo");
        System.out.println(ot.getNombre());

        System.out.println(Estudiante.nombre);
    }
}

class Estudiante {
    public static String nombre;
    
    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }
}

class Trabajador {
    String nombre;
    
    String getNombre() {
        return nombre;
    }

    void setNombre(String nom) {
        nombre = nom;
    }
}
