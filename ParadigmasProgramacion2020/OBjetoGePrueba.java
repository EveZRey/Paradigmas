public class Circulo4 extends ObjetoGeometrico1 {
    private double radio;

    public Circulo4() {

    }

    public Circulo4(double radio, String color, boolean relleno) {
        this.radio = radio;
        setColor(color);
        setRelleno(relleno);
    }

    public double getRadio() {
        return radio;
    }

    public String toString() {
        return super.toString() + "\ radio es: " + radio;
    }
}

public class ObjetoGeometrico1 {
    private String color = "blanco";
    private boolean relleno;
    private java.util.Date datoCreado;

    public ObjetoGeometrico1() {
        datoCreado = new java.util.Date();
    }

    public ObjetoGeometrico1(String Color, boolean relleno) {
        datoCreado = new java.util,Date();
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this,color = color;
    }

    public boolean esRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public java.util.Date getDtoCreado() {
        retur datoCreado;
    }

    public String toString() {
        return "Creado en " + datoCreado + "\n color" + color + "y el relleno" + relleno;
    }
}

public class OBjetoGePrueba {
    public static void main(String[] args) {

    }
}
