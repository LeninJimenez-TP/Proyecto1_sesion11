package programa;
import java.util.Random;
public class Ejercicio04 {

    public static void main(String[] args) {
        int[][] matrizVentas = new int[3][3];
        Random random = new Random();

        // Proceso de llenado de la matriz con ventas aleatorias entre 1000 y 10000
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizVentas[i][j] = random.nextInt(9001) + 1000;
            }
        }

        // Cálculo del total de ventas
        int totalVentas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalVentas += matrizVentas[i][j];
            }
        }

        // Cálculo del promedio de las ventas
        double promedioVentas = (double) totalVentas / (3 * 3);

        // Salida de datos
        System.out.println("Matriz de Ventas:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizVentas[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Total de Ventas: " + totalVentas);
        System.out.println("Promedio de Ventas: " + promedioVentas);
    }
}