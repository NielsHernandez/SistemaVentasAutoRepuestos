/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * clase ItemOrden crea objetos para agregar a una orden
 * @author q669YS4G
 */
public class ItemOrden {
    
    private int noLinea;
    private int cantidad;
    Producto producto;
    
    /**
     * constructor por defecto
     */
    
    public ItemOrden()
    {
        
    }
   
/**
 * constructor recive noLinea, cantidad, producto como parametro
 * @param noLinea no linea
 * @param cantidad cantidad
 * @param producto producto
 */
    public ItemOrden(int noLinea, int cantidad, Producto producto) {
        this.noLinea = noLinea;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    /**
     * devuelve la posicion del articulo
     * @return string
     */
    public int getNoLinea() {
        return noLinea;
    }
    
    /**
     * recive el valor de la linea de ser necesario
     * @param noLinea linea
     */

    public void setNoLinea(int noLinea) {
        this.noLinea = noLinea;
    }
    /**
     * devuelve la cantidad 
     * @return string
     */

    public int getCantidad() {
        return cantidad;
    }
/**
 * devuelve el objeto producto del el itemOrden
 * @return string
 */

    public Producto getProducto() {
        return producto;
    }
    
    /**
     * recive un objeto tipo Producto
     * @param producto Object
     */

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
/**
 * metodo sobre escrito toString
 * @return string
 */
    @Override
    public String toString() {
        return  Utilerias.getNombreClase(ItemOrden.class)+"{" + "noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    /**
     * devuelve el total del item orden
     * @return int
     */
    
    public int getTotalItem(){
        
        return producto.getPrecioUnidad() *  cantidad;
               
    }
    
    
     
     
}
