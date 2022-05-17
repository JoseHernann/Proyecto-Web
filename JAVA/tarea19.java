/*
Nombre: Jose Hernan Pardes Sandoval Matricula: 1968666 Hora clase: N1 

Programa que encuentra un cuentas veces aparece un numero seleccionado 
por el usuario dentro de un vector para despues imprimir las veces que lo encontro
asi como el vector
*/

import java.util.Scanner;
public class tarea19 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int i,n,b,conta=0;
        int a[];
        System.out.print("Ingrese la cantidad de numeros a capturar:");
        n = lec.nextInt();
        a = new int[n];
        System.out.print("Ingrese el numero a buscar:");
        b = lec.nextInt();
        for( i=0;i<n;i++){
            System.out.print("A[ " + (i+1) +"] = " );
            a[i] = lec.nextInt();        
            if (a[i] == b){
                conta += 1;
            }
        }
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(n == 1 && conta != 0){
            System.out.println("El numero  "+b+"  aparece "+conta+" vez en el vector:");
        }
        else{
            System.out.println("El numero  "+b+"  aparece "+conta+" veces en el vector:");
        }
        System.out.print("A =[ " );
        for( i=0;i<n;i++){
            
            System.out.print(a[i] + ",  "  );
        }
        System.out.print("] " );
        lec.close();
    }
}
