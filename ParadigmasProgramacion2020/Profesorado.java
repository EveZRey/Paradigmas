public class Profesorado {
    Public static void main(String[] args) {
        Profesorado jose = new Profesorado();
        new Profesorado();
    }

    public Profesorado() {
        System.out.println("(4) realizar las tareas del profesorado");
    }
}

class Empleado extends Persona [
    public Empleado() {
        this("(2) invoca al constructor sobrecargado Empleado");
        System.out.println("(4) realizar las tareas del empleado");
    }

    public Empleado(String s) {
        System.out.println(s);
    } 
}

class Persona [
    public Persona() {
        System.out.println("(1) realizar las tareas de la persona");
    }
]
