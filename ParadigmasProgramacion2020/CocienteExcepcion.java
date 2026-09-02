import java.util.Scanner;

public class CocienteExcepcion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe dos enteros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        try {
            if(num2 == 0)
                throw new AritmeticException("El divisor no puede ser 0 ");
        
                System.out.println(num1 + " / " + num2 + " es " + (num1/num2));
        }
        catch(AritmeticException ex) {
            System.out.println("Excepción: un entero " + "no puede ser dividido por cero ");
        }
        System.out.println("La ejecución continua ... ");
    }
}
