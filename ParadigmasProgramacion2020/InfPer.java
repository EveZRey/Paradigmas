public class InformacionPersona {
    private Persona nombre;
    private Fecha bDia;
    private int personaID;
    
    public InformacionPersona() {
        nombre = new Persona();
        bDia = new Fecha();
        personaID = 0;
    }
    
    public InformacionPersona(String primero, String ultimo, in mes, int dia, int anio) {
        nombre = new Persona(primero, ultimo);
        bDia = new Fecha(mes,dia,anio);
        PersonaID = ID;
    }
    
    public void setInformacionPersona(String primero, String ultimo, in mes, int dia, int anio, int ID) {
        nombre.setNombre(primero, ultimo);
        bDia.setFecha(mes, dia, anio);
        personaID = ID;
    }
    
    public String toString() {
        return ("Nombre: " + nombre.toString() + "\n" + "Fecha de cumpleaños: " + bDia.toString() + "\n" + "ID de la persona: " + personaID);
    }
}

public class Fecha {
    private int mes;
    private int dia;
    private int anio;
    
    public Fecha() {
        mes = 1;
        dia = 1;
        anio = 1900;
    }
    
    public Fecha(int mes, int dia, int anio) {
     Mes = mes;
     Dia = dia;
     Anio = anio;
    }
    
    public void setFecha(int mes, int dia, int anio) {
        Mes = mes;
        Dia = dia;
        Anio = anio;
    }
    
    public int getMes() {
        return Mes;
    }
    
    public int getDia() {
        return Dia;
    }
    
    public int getAnio() {
        return Anio;
    }
    
    public String toString() {
        return (Mes + "_" + Dia + "_" + Anio);
    }
}

public class Persona {
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

        Trabajador ot = new Trabajador();

        ot.setNombre("Pablo");
        System.out.println(ot.getNombre());
    }
}
