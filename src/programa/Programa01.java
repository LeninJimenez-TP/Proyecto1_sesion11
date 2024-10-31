
package programa;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //declarar variables
        int sp,ci,r,numero,c,f;
        int [][] mnumeros=new int [3][3];
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        for (f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                System.out.print("Ingrese un numero:");
                numero=lectura.nextInt();
                mnumeros [f][c]=numero;
                
            }
        }
        //proceso de datos
        sp=0;
        ci=0;        
        for (f=0;f<mnumeros.length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                r=mnumeros [f][c]%2;
                if(r==0){
                    sp+=mnumeros [f][c];      
                }else{
                    ci++;   
                }
            }
        }
        //salida de datos
        System.out.println("La suma de los numeros pares es:"+sp);
        System.out.println("La cantidad de los digitos imapres es:"+ci);
     }
}
        
        
            


    
