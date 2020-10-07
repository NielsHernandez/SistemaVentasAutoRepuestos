/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * clase orden permite la creacion o instanciacion de objectos aparti de esta esta clase
 * @author q669YS4G
 */
public class Orden {
    
    /**
     * nombre de las variables requeridas
     */
    private int idOrden;
    static int idSigOrden=1;
    private Cliente cliente;
    private Date fechaOrder;
    private ArrayList<ItemOrden> articulos;
    private double precioEnvio;
    private double total;
    private String tipoEnvio;
    private String estado;
    private int diasEnvio;
    
   
    /**
     * constructor por defecto inicializa los valores del id, total, fecha
     */
    
    public Orden(){
        
        idOrden=idSigOrden;
        total = 0.0;
        fechaOrder = new Date();
        idSigOrden++;
    }
/**
 * constructor recive multiple parametros que hacen posible la creacion de una orden, llama al constructor por defecto por medio de this()
 * @param cliente objeto cliente
 * @param articulos array de articulo productos
 * @param precioEnvio precio de envio
 * @param tipoEnvio tipo del envio
 * @param estado estado del envio
 * @param diasEnvio  dias del envio
 */
    public Orden(Cliente cliente,ArrayList<ItemOrden> articulos, double precioEnvio, String tipoEnvio, String estado, int diasEnvio) {
        
        this();
        this.cliente = cliente;
        this.articulos = articulos;
        this.precioEnvio = precioEnvio;
        this.tipoEnvio = tipoEnvio;
        this.estado = estado;
        this.diasEnvio = diasEnvio;
        
        for(ItemOrden item: articulos)
        {
          this.total +=  item.getTotalItem();
        }
        
        this.total+=precioEnvio;
        
    }
    
    
   
    
   
/**
 * devuleve el id
 * @return  int
 */
    public int getIdOrden() {
        return idOrden;
    }
    /**
     * recive un id de ser  necesario
     * @param idOrden int
     */

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
/**
 * devuelve el objeto cliente que conforma esta orden
 * @return Object
 */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * recive un objeto Cliente de ser necesario
     * @param cliente Object
     */

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
/**
 * devuelve la fecha de la orden
 * @return string
 */
    public Date getFechaOrder() {
        return fechaOrder;
    }
    /**
     * recive la fecha Date
     * @param fechaOrder Date
     */

    public void setFechaOrder(Date fechaOrder) {
        this.fechaOrder = fechaOrder;
    }
/**
 * devulve un array de los articulos a conformar la orden
 * @return aray
 */
    public ArrayList<ItemOrden> getArticulos() {
        return articulos;
    }
/**
 * recive un array de los articulos a conformar la orden
 */
    public void setArticulos(ArrayList<ItemOrden> articulos) {
        this.articulos = articulos;
    }
    
    /**
     * devuelve el precio de envio
     * @return double
     */

    public double getPrecioEnvio() {
        return precioEnvio;
    }
/**
 * recive el precio de envio
 * @param precioEnvio double
 */
    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }
/**
 * devuelve el total de la orde incluyendo el envio
 * @return 
 */
    public double getTotal() {
        return total;
    }
    /**
     * devulve el tipo de envio
     * @return string
     */

    public String getTipoEnvio() {
        return tipoEnvio;
    }

/**
 * devuelve el estado del envio
 * @return string
 */

    public String getEstado() {
        return estado;
    }

    /**
     * devuleve los dias de envio
     * @return int
     */

    public int getDiasEnvio() {
        return diasEnvio;
    }


 /**
  * metodo sobre escrito toString
  * @return string
  */

    @Override
    public String toString() {
        return Utilerias.getNombreClase(Orden.class)+ "{" + "idOrden=" + idOrden + ", cliente=" + cliente + ", fechaOrder=" + fechaOrder + ", articulos=" + articulos + ", precioEnvio=" + precioEnvio + ", total=" + total + ", tipoEnvio=" + tipoEnvio + ", estado=" + estado + ", diasEnvio=" + diasEnvio + '}';
    }
    
    
    
    
}
