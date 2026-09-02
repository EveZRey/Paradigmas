import java.util.ArrayList;

class Concesionario {
    private String compania;
    private Gerente gerente;
    private ArrayList<PersonaVentas>gente = new ArrayList<PersonaVentas>();
    private ArrayList<Coche>coches = new ArrayList<Coche>();

    public Concesionario(String compania, Gerente gerente){
        this.compania = compania;
        this.gerente = gerente;
    }

    public void addPersona(PersonaVentas persona) {
        gente.add(persona);
    }

    public void addCoche(Coche coche) {
        coches.add(coche);
    }

    public void imprimirEstado() {
        System.out.println(compania + "\t" + gerente.getNombre());
        for(PersonaVentas persona: gente)
            System.out.println(persona.getNombre());
        for(Coche coche: coches)
            System.out.println(coche.getModelo());
    }
}

class Coche {
    private String modelo;

    public Coche(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

class Gerente {
    private String nombre;

    public Gerente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class PersonaVentas {
    private String nombre;
    private double salario = 0.0;

    public PersonaVentas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class VentasCoches {
    public static void main(String[] args) {
        Gerente genaro = new Gerente("Andrés");
        PersonaVentas Nicolas = new PersonaVentas("Nicolás");
        PersonaVentas Vicente = new PersonaVentas("Vicente");
        Concesionario c = new Concesionario("Coches usados Lo mejor", genaro);

        c.addPersona(Nicolas);
        c.addPersona(Vicente);

        c.addCoche(new Coche("VW"));
        c.addCoche(new Coche("GMC"));
        c.addCoche(new Coche("Dodge"));

        c.imprimirEstado();
    }
}
