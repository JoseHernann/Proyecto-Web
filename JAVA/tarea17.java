/*
Nombre: Jose Hernan Paredes Sandoval Matricula:1968666 Hora clase: N1
Programa que convierte de pesos a dolar, euro , yen(japones) y dolar de Hong Kong
*/
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class tarea17 {
    public static void main(String[] args) {
   
        String [] options = {"Salir" , "Dólar" , "Euro" , "Yen" , "Dólar de Hong Kong"};
        int o =JOptionPane.showOptionDialog(null,
        "Seleccione a que tipo moneda desea hacer el cambio" ,
        "opcion",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options [0]);
        String peso = "";
        Float vpeso;
        peso = JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir");
        vpeso = Float.parseFloat(peso);
        DecimalFormat df = new DecimalFormat("#.##");
        switch(o){
    
            case 1:
                
                Double conversion = vpeso *  0.048506753;  //fecha 10/11/2021 
                JOptionPane.showMessageDialog(null, df.format(conversion) + " dólar estadounidense");
            break;
            case 2:
                
                Double conversion2 = vpeso * .0422546 ; //fecha : 10/11/2021
                JOptionPane.showMessageDialog(null, df.format(conversion2)+ " euros");
            break;
            case 3:
                
                Double conversion3 = vpeso * 5.52910 ; //fecha : 10/11/2021
                JOptionPane.showMessageDialog(null, df.format(conversion3) + " Yen japonés");
            break;
            case 4:
                
                Double conversion4 = vpeso * .377737 ; //fecha : 10/11/2021
                JOptionPane.showMessageDialog(null, df.format(conversion4) + " dólar de Hong Kong ");
            break;
           
            default:
            
            break;
            
        }
            
        }
}
