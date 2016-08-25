/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IIsemestre2014;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class busquedaLinealEnUnVectorOrdenado {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));
        // TODO code application logic here
         int v[]=new int[10];
 int i,y;
 i=0;
    while(i<5){
        i++;
          System.out.print("introduzca un valor para v["+i+"]:");
    v[i]= Integer.parseInt(dato.readLine());
    }
    i=0;
    while(i<5){
        i++;
          System.out.print(" "+v[i]);
    }
        System.out.println("");
    System.out.println("introduzca un valor para x: ");
    y= Integer.parseInt(dato.readLine());
    i=1;
        while((v[i]<y)&&(i<5)){
            i++;
           }
        if (v[i]==y){
        System.out.println("el elemento se encuentra en la posicion: "+i);   
        }
        else {
        System.out.println("El elemento no existe");
        }
    
    }
}
