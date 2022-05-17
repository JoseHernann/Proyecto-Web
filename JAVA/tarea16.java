/*
Nombre: Jose Hernan Paredes Sandoval Matricula:1968666 Hora clase: N1
Programa que convierte de grados C -> F o F-> C usando showOptionDialog()
*/

import javax.swing.JOptionPane;
public class tarea16 {
    public static void main(String[] args) {

    String [] options = {"Salir" , "°C -> °F" , "°F -> °C"};
    int o =JOptionPane.showOptionDialog(null,
    "Selecciona si desea convertir de Celsius a Farenheit (°C -> °F) o de Farenheit a Celsius (°F -> °C)" ,
    "opcion",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options [0]);
    switch(o){

        case 1:
            String centi = "";
            Float vcenti;
            centi = JOptionPane.showInputDialog("Ingrese los grados Celsius a convetir");
            vcenti = Float.parseFloat(centi);
            float conversion = (vcenti * (float) 1.8) + 32;
            JOptionPane.showMessageDialog(null, conversion + "  °F");
        break;
        case 2:
            String far = "";
            Float vfar;
            far = JOptionPane.showInputDialog("Ingrese los grados Farenheit a convetir");
            vfar = Float.parseFloat(far);
            float conversionf = (vfar - 32) / (float)1.8;
            JOptionPane.showMessageDialog(null, conversionf + "  °C");    
        break;

        default:

        break;

    }

    }
}
