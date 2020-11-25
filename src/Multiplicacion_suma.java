public class Multiplicacion_suma {
    static int suma_sucesiva(int x, int y){
        int suma = 0;
        for(int i=1; i <= y;i++){
            suma = suma + x;
        }
        return suma;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int resultado = suma_sucesiva(x, y);
        System.out.println(resultado);
    }
}
