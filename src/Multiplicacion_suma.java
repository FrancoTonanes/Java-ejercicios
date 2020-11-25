public class Multiplicacion_suma {
    static int suma_sucesiva(int x, int y){
        int suma = 0;
        for(int i=1; i < y;i++){
            suma = suma + x + x;
        }
        return suma;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int resultado = suma_sucesiva(x, y);
        System.out.println(resultado);
    }
}
