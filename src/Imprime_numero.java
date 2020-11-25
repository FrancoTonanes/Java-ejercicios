import java.util.Scanner;

public class Imprime_numero{
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un número:\t");
        int x = ingreso.nextInt();
        int i = 1;
        String enteros = "";
        
		while(i <= x){
            enteros = enteros + String.valueOf(i);
            i++;
            
            for(int a = 0; a < enteros.length(); a++){
                char c = enteros.charAt(a);
                System.out.print(c);
                
            }
            System.out.println();
            ingreso.close();
        }
        
    }
}