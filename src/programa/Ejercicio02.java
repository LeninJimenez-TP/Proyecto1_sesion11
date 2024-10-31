package programa;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        int numero=0,c,f,cem;
        double promedio=0.0,suma=0.0;
        int [][] mnumero=new int [4][4];
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        for (f=0;f<mnumero.length;f++){
            for(c=0;c<mnumero[0].length;c++){
                System.out.print("Ingrese un numero:");
                numero=lectura.nextInt();
                mnumero[f][c]=numero;
            }
        }
        //proceso de datos
        suma=0.0;
        for (f=0;f<mnumero.length;f++){
            for(c=0;c<mnumero[0].length;c++){
                suma+=mnumero [f][c];
            }
        }
        cem=mnumero.length*mnumero[0].length;
        promedio=suma/cem;
        //salida de datos
        System.out.println("La suma del total de compras es:"+suma);
        System.out.println("El promedio de las compras es:"+promedio);   
    }
}