/*
Nombre: Jose Hernan Pardes Sandoval Matricula: 1968666 Hora clase: N1 

Programa que realiza la suma de dos matrices 
*/
import java.util.Scanner;
public class tarea21 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int i,j,n,m;
        boolean t;
        System.out.print("\n\t¡¡La cantidad de filas debe ser igual a la cantidad de columnas y los numeros deben ser enteros!!\n\n");
       do{
            System.out.print("Ingrese la cantidad de filas:");
            n = lec.nextInt();
            System.out.print("Ingrese la cantidad de columnas:");
            m = lec.nextInt();
            if(n != m){
                System.out.print("\n\t¡¡La cantidad de filas debe ser igual a la cantidad de columnas y los numeros deben ser enteros!!\n\n");
                t = false;
            }
            else{
                t = true;
            }
       }while(t != true);
        int [][] a = new int[n][m];
        int [][] b = new int[n][m];
        int [][] c = new int[n][m];
        //Captura 1
        System.out.print("\nPRIMERA MATRIZ\n\n");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("A[ " + (i+1) +"]" + "["+ (j+1) + "] = " );
                a[i][j] = lec.nextInt();
            }
        }
        System.out.print("\nSEGUNDA MATRIZ\n\n");
        //Captura 2
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("A[ " + (i+1) +"]" + "["+ (j+1) + "] = " );
                b[i][j] = lec.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                c[i][j] = a[i][j]+ b[i][j];
            }
        }
        
        //Impresion
        System.out.print("\nA = " );
        for(i=0;i<n;i++){
            System.out.print("  [ " );
            for(j=0;j<m;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("]\n    ");
        }
        
        System.out.print("\nB = " );
        for(i=0;i<n;i++){
            System.out.print("  [ " );
            for(j=0;j<m;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("]\n    ");
        }
        System.out.print("\nA + B = " );
        for(i=0;i<n;i++){
            System.out.print("  [ " );
            for(j=0;j<m;j++){
               System.out.print(c[i][j]+" ");
            }
            System.out.print("]\n        ");
        }
        
        
        lec.close();
    }
}




