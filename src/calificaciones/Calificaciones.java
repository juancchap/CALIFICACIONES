
package calificaciones;
import java.util.Scanner;
public class Calificaciones {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float participacion,primerexa,segundoexa,exafin,notfinal;
        System.out.println("Ecribir partcipacion: ");
        participacion=entrada.nextFloat();
        System.out.println("Escribir primer nota");
        primerexa=entrada.nextFloat();
        System.out.println("Escribir segunda nota: ");
        segundoexa=entrada.nextFloat();
        System.out.println("Escribir Exa final: ");
        exafin=entrada.nextFloat();
        participacion*=0.10f; 
        primerexa*=0.25f;
        segundoexa*=0.25f;
        exafin*=0.40f;
        notfinal=participacion+primerexa+segundoexa+exafin;
        System.out.println("La calificacion final es : "+notfinal);
       
    }
    
}
