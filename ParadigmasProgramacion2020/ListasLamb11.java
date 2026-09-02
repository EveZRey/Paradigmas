import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre =" + " " + nombre + ", edad =" + " " + edad + "]";
    }
}

public class ListasLamb11 {
    public static void main(String[] args) {
        List<Persona> ciudadanos = Arrays.asList(
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Pedro",40),
            new Persona("Ana",20),
            new Persona("Lucas",35),
            new Persona("Jose",65)
        );

        double promedioEdad = ciudadanos.stream()
            .mapToInt(Persona::getEdad)
            .average()
            // .sum()
            // .min()
            // .max()
            // .sumaryStatistics()
            .orElse(0.0);
        System.out.println("El promedio de edad es:" + promedioEdad);

        List<Persona> ciudadanosOrdenados = ciudadanos.stream()
            .sorted(Comparator.comparing(Persona::getEdad))
            .collect(Collectors.toList());
        System.out.println(ciudadanosOrdenados);

        System.out.println();
        ciudadanosOrdenados.forEach(System.out::println);
    }
}
