import java.util.Scanner;

public class Factorial {
    static int factorial(int x){
        int factorial = 1;
        while(x != 0) {
            factorial=factorial*x;
            x--;
          }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un número:\t");
        int x = ingreso.nextInt();
        int resultado = factorial(x);
        System.out.println("El factorial de " + x +" es "+ resultado);
        ingreso.close();
    }
}
