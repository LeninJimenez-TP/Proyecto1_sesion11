package programa;
import java.util.Random;
public class Ejercicio03 {
    public static void main(String[] args) {
        int[][] ventas = new int[4][4];
        
        // Llenar la matriz con ventas aleatorias entre 10 y 5000
        Random random = new Random();
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = random.nextInt(4991) + 10;
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
        }
        
        // Mostrar la matriz de ventas
        System.out.println("Matriz de Ventas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Mostrar la venta mayor y la venta menor
        System.out.println("Venta Mayor: " + ventaMayor);
        System.out.println("Venta Menor: " + ventaMenor);
    }
}