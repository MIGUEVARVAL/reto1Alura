package RetoConversor;

import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {
        String[] opciones1 = {"Convertir Moneda Colombiana", "Convertir Temperatura (K)"};
        String[] opciones2 = {"Convertir a Dolar","Convertir a Euro","Convertir a Libras","Convertir a Won","Convertir a Yen"};
        String[] opciones3 = {"Celcius a Farenheit","Celcius a Kelvin","Farenheit a Celcius","Kelvin a Celcius","Kelvin a Farenheit"};
        boolean val=true;
        while(val){
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú Desplegable",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones1,
                    opciones1[0] // Opción por defecto seleccionada
            );

            if (seleccion.equals(opciones1[0])){
                String moneda = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                String seleccion2 = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú Desplegable",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones2,
                    opciones2[0] // Opción por defecto seleccionada
                );
                ConvertirMonedas valorConversion= new ConvertirMonedas();
                if(seleccion2.equals(opciones2[0])){
                    valorConversion.ConvertirPesosADolares(Double.parseDouble(moneda));
                }else if(seleccion2.equals(opciones2[1])){
                    valorConversion.ConvertirPesosAEuros(Double.parseDouble(moneda));
                }else if(seleccion2.equals(opciones2[2])){
                    valorConversion.ConvertirPesosALibras(Double.parseDouble(moneda));
                }else if(seleccion2.equals(opciones2[3])){
                    valorConversion.ConvertirPesosAWon(Double.parseDouble(moneda));
                }else if(seleccion2.equals(opciones2[4])){
                    valorConversion.ConvertirPesosAYen(Double.parseDouble(moneda));
                }
            }else{

                String seleccion2 = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú Desplegable",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones3,
                    opciones3[0] // Opción por defecto seleccionada
                );
                String temperatura = JOptionPane.showInputDialog("Ingresa el valor de la temperatura a convertir: ");
                ConvertirTemperatura valorConversion= new ConvertirTemperatura();
                if(seleccion2.equals(opciones2[0])){
                    valorConversion.ConvertirCelciusAFarenheit(Double.parseDouble(temperatura));
                }else if(seleccion2.equals(opciones2[1])){
                    valorConversion.ConvertirCelciusAKelvin(Double.parseDouble(temperatura));
                }else if(seleccion2.equals(opciones2[2])){
                    valorConversion.ConvertirFarenheitACelcius(Double.parseDouble(temperatura));
                }else if(seleccion2.equals(opciones2[3])){
                    valorConversion.ConvertirKelvinACelcius(Double.parseDouble(temperatura));
                }else if(seleccion2.equals(opciones2[4])){
                    valorConversion.ConvertirKelvinAFarenheit(Double.parseDouble(temperatura));
                }
            }
            String validar = JOptionPane.showInputDialog("Desea continuar? (0:No, 1: Si)");
            if(Integer.parseInt(validar)==0){
                val=false;
            }
        }
    }
}
