package programa;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declarar variables
        double[][] ventas = new double[4][4];
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[0].length; c++) {
                System.out.print("Ingrese las ventas:");
                ventas[f][c] = lectura.nextDouble();
            }
        }
        
        // Calcular el total de ventas
        double totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[0].length; j++) {
                totalVentas += ventas[i][j];
            }
        }
        
        // salida de datos
        System.out.println("Total de Ventas: " + totalVentas);
    }      
}