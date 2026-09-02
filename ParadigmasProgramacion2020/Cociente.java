import java.util.Scanner;

public class Cociente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe dos enteros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.println(num1 + " / " + num2 + " es " + (num1/num2));
    }
}
