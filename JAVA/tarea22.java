/*
Nombre: Jose Hernan Pardes Sandoval Matricula: 1968666 Hora clase: N1 

Programa que realiza la multiplicacion de dos matrices 
*/
import java.util.Scanner;
public class tarea22 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int i,j,n,m,m2,n2;
        int [][] a ;
        int [][] b ;
        int [][] c ;
        do{
       
        System.out.println("Ingrese la cantidad de filas de la primera matriz:");
        n = lec.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la primera matriz:");
        m = lec.nextInt();
        System.out.println("Ingrese la cantidad de filas de la segunda matriz:");
        n2 = lec.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la segunda matriz:");
        m2 = lec.nextInt();
        a = new int[n][m];
        b = new int[n2][m2];
        c = new int[n][m2];
            if(m != n2){
                System.out.println(" \n\t¡¡Los rangos de las matrices son incorrectos!!\n");
            }
        }while(m != n2);
     
        System.out.print("\nPRIMERA MATRIZ\n");

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("A[ " + (i+1) +"]" + "["+ (j+1) + "] = " );
                a[i][j] = lec.nextInt();
            }
        }

        System.out.print("\nSEGUNDA MATRIZ\n");

        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                System.out.print("A[ " + (i+1) +"]" + "["+ (j+1) + "] = " );
                b[i][j] = lec.nextInt();
            }
        }

        for( i=0;i<n;i++){
            for( j=0;j<m2;j++){
                for(int h=0;h<m;h++){
                    c[i][j]+=a[i][h]*b[h][j];
                }
            }
        }

        //Impresion 1
        System.out.print("\nA = " );
        for(i=0;i<n;i++){
            System.out.print("  [ " );
            for(j=0;j<m;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.print("]\n    ");
        }
        //Impresion 2
        System.out.print("\nB = " );
        for(i=0;i<n2;i++){
            System.out.print("  [ " );
            for(j=0;j<m2;j++){
               System.out.print(b[i][j]+" ");
            }
            System.out.print("]\n    ");
        }
            //Impresion 3
        System.out.print("\nA * B = " );
        for(i=0;i<n;i++){
            System.out.print("  [ " );
            for(j=0;j<m2;j++){
               System.out.print(c[i][j]+" ");
            }
            System.out.print("]\n        ");
        }
        


       
        
        
        
        
       
        
        
        lec.close();
    }
}
