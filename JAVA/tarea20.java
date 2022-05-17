/*
Nombre: Jose Hernan Pardes Sandoval Matricula: 1968666 Hora clase: N1 

Programa que encuentra un cuentas veces aparece un numero seleccionado 
por el usuario dentro de una matriz para despues imprimir las veces que lo encontro
asi como el vector
*/

import java.util.Scanner;
public class tarea20 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int i,j,n,m,conta=0,b;
        int [][] a;
        System.out.print("Ingrese la cantidad de filas:");
        n = lec.nextInt();
        System.out.print("Ingrese la cantidad de columnas:");
        m = lec.nextInt();
        a = new int[n][m];
        System.out.print("Ingrese el numero a buscar:");
        b = lec.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("A[ " + (i+1) +"]" + "["+ (j+1) + "] = " );
                a[i][j] = lec.nextInt();
            }
        }

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if (a[i][j] == b){
                    conta += 1;
                }
            }
        }
    
        if(n == 1 && conta != 0 || conta == 1){
            System.out.println("\nEl numero  "+b+"  aparece "+conta+" vez en el vector:");
        }
        else{
            System.out.println("\nEl numero  "+b+"  aparece "+conta+" veces en el vector:");
        }
        System.out.print("\nA = " );
        for(i=0;i<n;i++){
            System.out.print("  [ " );
            for(j=0;j<m;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("]\n    ");
        }
        
        lec.close();
    }
}
