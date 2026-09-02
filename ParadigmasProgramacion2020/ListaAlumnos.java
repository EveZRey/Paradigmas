import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Collections;

class Alumno {
    String nombre;
    String apellido;
    int boleta;
    int calificacion;

    public Alumno(String nombre, String apellido, int boleta, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.boleta = boleta;
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getCalificacion() {
        return calificacion;
    }
    
    public int getBoleta() {
        return boleta;
    }

    @Override
    public String toString() {
        return "Alumno[" + nombre + "," + apellido + "," + boleta + "," + calificacion + "]";
    }

    
}

public class ListaAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>(Arrays.asList(
            new Alumno("Pedro", "Sanchez", 3, 7),
            new Alumno("Jose", "Juarez", 1, 8)
        ));
        
        alumnos.add(new Alumno("Jorge", "Aguilar", 2, 6));
        alumnos.add(new Alumno("Andre", "Aguirre", 6, 9));
        
        System.out.println(alumnos);
        
        List<Alumno> mayorCalificacion = alumnos.stream()
            .filter(a -> a.getCalificacion() == 8)
            .collect(Collectors.toList());
        
        System.out.println();
        System.out.println(mayorCalificacion);
        
        List<Alumno> saltoLista = alumnos.stream()
            .skip(2)
            .collect(Collectors.toList());
            
        System.out.println();
        System.out.println(saltoLista);
        
        List<Alumno> limiteLista = alumnos.stream()
            .limit(2)
            .collect(Collectors.toList());
            
        System.out.println();
        System.out.println(limiteLista);
        
        List<Alumno> selNombre = alumnos.stream()
            .filter(a -> a.getNombre() == "Jorge")
            .collect(Collectors.toList());
            
        System.out.println();
        System.out.println(selNombre);
        
        List<Integer> descuento = alumnos.stream()
            .map(a -> a.getCalificacion() + 1)
            .collect(Collectors.toList());
            
        System.out.println();
        System.out.println(descuento);
        
        Comparator<Alumno> compAlumno = Comparator.comparing(Alumno::getBoleta);
        
        alumnos.sort(compAlumno);
        
        System.out.println();
        alumnos.forEach(System.out::println);
        
    }
}
