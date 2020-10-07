/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * clase individual hereda de cliente
 * @author q669YS4G
 */

//clase individual hereda de la clase cliente
public class Individual extends Cliente{
    
    private String DPI;

    /**
     * constructor inicial recive un parametro DPI
     * @param DPI strng
     */
    public Individual(String DPI) {
        this.DPI = DPI;
    }
    /**
     * constructo recive DPI, nombre, apellido, tipo como String
     * @param DPI string
     * @param nombre string
     * @param apellido string
     * @param tipo string
     */

    public Individual(String DPI, String nombre, String apellido, String tipo) {
        super(nombre, apellido, tipo);
        this.DPI = DPI;
    }
    /**
     * devuleve el valor del DPI
     * @return string
     */

    public String getDPI() {
        return DPI;
    }
    /**
     * recive el valor del DPI como string
     * @param DPI string
     */

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }
/**
 * metoto sobre escrito toString 
 * @return string
 */
    @Override
    public String toString() {
        return "Individual{" + "DPI=" + DPI + '}';
    }
    
    
    
}
