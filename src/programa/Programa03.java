package programa;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        //declarar variables
        int numero,f,c,dmy,dmn;
        int [][] mnumero=new int [3][3];
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
        dmy=0;
        dmn=99;
        for (f=0;f<mnumero.length;f++){
            for(c=0;c<mnumero[0].length;c++){
                if(mnumero[f][c]>dmy){
                    dmy=mnumero[f][c];
                }
                if (mnumero[f][c]<dmn){
                    dmn=mnumero[f][c];
                }
            }          
        }
        //salida de datos
        System.out.println("El digito mayor es:"+dmy);
        System.out.println("El digito menor es:"+dmn);
    }
}