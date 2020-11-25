

public class Imprime_numero{
    public static void main(String[] args) {
        int i = 1;
        String enteros = "";
        
		while(i < 6){
            enteros = enteros + String.valueOf(i);
            i++;
            
            for(int a = 0; a < enteros.length(); a++){
                char c = enteros.charAt(a);
                System.out.print(c);
                
            }
            System.out.println();
        }
        
    }
}