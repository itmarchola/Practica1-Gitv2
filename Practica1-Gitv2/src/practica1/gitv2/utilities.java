package practica1.gitv2;

/**
 *
 * @author itmar
 */
public class utilities {
    public static void imprimirMenu(){
        System.out.println("\nOperaciones disponibles:\n"+
        "1. Sumar (+)\n"+
        "2. Restar (-)\n"+
        "3. Multiplicar (x)\n"+
        "4. Dividir (/)\n"+
        "5. Elevar el primer número al segundo número (*)\n"+
        "6. Calcular el residuo (%)\n");
    }
    
    public static double suma(double a, double b){
        return a + b;
    }
    
    public static double resta(double a, double b){
        return a - b;
    }
    
    public static double multiplicacion(double a, double b){
        return a * b;
    }
    
    public static double division(double a, double b){
        return a / b;
    }
    
    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public static double residuo(double a, double b){
        return a % b;
    }
}