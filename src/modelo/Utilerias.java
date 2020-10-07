/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.sun.javafx.util.Utils.split;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * clase Utilerias utilizada para realizar cosas comunes o reutilizables
 * @author q669YS4G
 */
public class Utilerias {
    
    
    /**
     * devuelve el nombre de la clase
     * @param nombre
     * @return string
     */
    public static String getNombreClase(Class nombre)
    {
        
        String temp = nombre.getSimpleName().toString();
        
        return temp;
        
    }
    /**
     * meoto getModena de vuelve la moneta en el formtao es GT
     * @param valor
     * @return string
     */
    public static String getMoneda(int valor)
    {
        
        Locale locale = new Locale("es", "GT");      
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        //System.out.println(currencyFormatter.format(valor));
        
        String temp = currencyFormatter.format(valor);
        
        return temp;
    }
    
}
