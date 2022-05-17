/*
Nombre: Jose Hernan Pardes Sandoval Matricula: 1968666 Hora clase: N1 
Programa que calcule N numeros de la serie 1 , 8 , 243 , 16384 , 1953125
*/

import java.util.Scanner;
public class tarea18 {
    public static void main (String[] args){
        Scanner lec = new Scanner(System.in);
        int i,n,t;
        System.out.print("\t\tDIGITE LA CANTIDAD DE NUMEROS A IMPRIMIR DE LA SERIE:");
        n = lec.nextInt(); 
        System.out.println("Serie:");
        for(i=1 ; i<=n ; i++){
            t = i+(i-1);
            double a =Math.pow((double)i,(double)t); 
            System.out.print( "\t"+(int) a +",");
            lec.close();
        }
    }
}
