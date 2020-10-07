/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * clase producto permite instancia para la creacion de objetos tipo producto
 * @author q669YS4G
 */
public class Producto {
    
    
    private int id;
    public static int idSiguientep =2000;
    private String producto;
    private int precioUnidad;
    private String marca;
    
    
    /**
     * constructor inicial, asigna un valor de id dinamico statico
     */
    public Producto(){
        
        id=idSiguientep;
        idSiguientep++;
    }
/**
 * constructor llama al primer constructor y asigna el resto de los valores
 * @param producto string
 * @param precioUnidad string
 * @param marca string
 */
    public Producto(String producto, int precioUnidad, String marca) {
        this();
        this.producto = producto;
        this.precioUnidad = precioUnidad;
        this.marca = marca;
    }
    
     /**
     * devuelve el id de ser necesario
     */


    public int getId() {
        return id;
    }
    /**
     * recive un id de ser necesario
     * @return 
     */

   
    public void setId(int id) {
        this.id = id;
    }
    /**
     * devulve el nombre producto
     * @return string
     */
    public String getProducto() {
        return producto;
    }
/**
 * recive el nombre de producto
 * @param producto string
 */
    public void setProducto(String producto) {
        this.producto = producto;
    }
/**
 * devuleve el precio unitario
 * @return int
 */
    public int getPrecioUnidad() {
        return precioUnidad;
    }
/**
 * recive el precio unitario
 * @param precioUnidad int
 */
    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
/**
 * devuelve el valor marca
 * @return string
 */
    public String getMarca() {
        return marca;
    }
/**
 * recive el valor marca
 * @param marca string
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * metodo sobre escrito toString
 * @return string
 */
    @Override
    public String toString() {
        return Utilerias.getNombreClase(Producto.class)+ "{" + "id=" + id + ", producto=" + producto + ", precioUnidad=" + precioUnidad + ", marca=" + marca + '}';
    }
    
    
    
    
    
    
}
