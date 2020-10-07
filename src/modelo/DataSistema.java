/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * clase data sitemas almacena valores iniciales en memoria
 * @author q669YS4G
 */
public class DataSistema {
    
    //3 arrays estaticos para almacenar la informacion de carga/inicio
    public static Cliente clientes [];
    public static Producto productos [];
    public static Orden ordenes [];

    /**
     * metoto statico gerOrdenes devulve un array de tamanio n de ordenes
     * @return array
     */
    public static Orden[] getOrdenes() {
        return ordenes;
    }
/**
 * metodo setOrdenes recive un array de n tamanio del tipo ordenes
 * @param ordenes ordenes
 */
    public static void setOrdenes(Orden[] ordenes) {
        DataSistema.ordenes = ordenes;
    }
    
    /**
     * constructo vacio necesario para el programador
     * @param s recive un string para indicarle que lo usara
     */
    
    public DataSistema(String s)
    {
        
    }
    
/**
 * constructo iniica los valores del array de clientes
 */
    public DataSistema() {
        
        Cliente.idSiguiente=1;
        clientes = new Cliente[8];
        clientes[0]=new Individual("2245965555512","Michell","Alcantara","Individual");
        clientes[1]=new Individual("1212456784545","Anna","Ventura","Individual");
        clientes[2]=new Individual("45451234567878","Roxana","Booss","Individual");
        clientes[3]=new Individual("2245789451111","Jose","Perez","Individual");
        clientes[4]= new Empresa("Sara Lebia",3,"Seguros GYT", "", "Empresa");
        clientes[5]= new Empresa("Roberto Gomez",2,"Seguros Roble", "", "Empresa");
        clientes[6]= new Empresa("Anai poca",3,"Importadora AC", "", "Empresa");
        clientes[7]= new Empresa("Leonel Garcia",3,"AutoVentas", "", "Empresa");
        
    }
    /**
     * constructo 2 inicia los valores de producto
     * @param var true
     */
     public DataSistema(boolean var) {
         
        Producto.idSiguientep=2000;
        productos = new Producto[8];
        productos[0] = new Producto("Alternados", 750, "Toyota");
        productos[1] = new Producto("Cargador de motor", 250, "Mazda");
        productos[2] = new Producto("Bomba de Agua", 350, "Toyota");
        productos[3] = new Producto("Bomba Acite", 450, "Kia");
        productos[4] = new Producto("Retenedor", 100, "Toyota");
        productos[5] = new Producto("Bobina", 120, "Kia");
        productos[6] = new Producto("Cojinete", 200, "Toyota");
        productos[7] = new Producto("Shock", 800, "Mazda");
 
    }
     //metodos auxiliares para busca un cliente existente]
     /**
      * metodo getCliente de vuelve un cliente inicial segun index
      * @param index indice
      * @return Cliente
      */
     public Cliente getCliente(int index)
     {
         
        
        Cliente.idSiguiente=1;
        clientes = new Cliente[8];
        clientes[0]=new Individual("2245965555512","Michell","Alcantara","Individual");
        clientes[1]=new Individual("1212456784545","Anna","Ventura","Individual");
        clientes[2]=new Individual("45451234567878","Roxana","Booss","Individual");
        clientes[3]=new Individual("2245789451111","Jose","Perez","Individual");
        clientes[4]= new Empresa("Sara Lebia",3,"Seguros GYT", "", "Empresa");
        clientes[5]= new Empresa("Roberto Gomez",2,"Seguros Roble", "", "Empresa");
        clientes[6]= new Empresa("Anai poca",3,"Importadora AC", "", "Empresa");
        clientes[7]= new Empresa("Leonel Garcia",3,"AutoVentas", "", "Empresa");
        for(int k=0; k< clientes.length; k++)
        {
            if(index==k)
            {
                return clientes[k];
            }
        }
        
        return null;
        
        
    }
     
     
     /**
      * meoto getproducto devuelve un Producto
      * @param index indeice
      * @return Producto
      */
     
      public Producto getProducto(int index) {
         
        Producto.idSiguientep=2000;
        productos = new Producto[8];
        productos[0] = new Producto("Alternados", 750, "Toyota");
        productos[1] = new Producto("Cargador de motor", 250, "Mazda");
        productos[2] = new Producto("Bomba de Agua", 350, "Toyota");
        productos[3] = new Producto("Bomba Acite", 450, "Kia");
        productos[4] = new Producto("Retenedor", 100, "Toyota");
        productos[5] = new Producto("Bobina", 120, "Kia");
        productos[6] = new Producto("Cojinete", 200, "Toyota");
        productos[7] = new Producto("Shock", 800, "Mazda");
        
        for(int k=0; k< productos.length; k++)
        {
            if(index==k)
            {
                return productos[k];
            }
        }
        
        return null;
    }
      
      /**
       * metood auxiliar void
       */
     
    public void cargarOrdenes()
    {
        Orden.idSigOrden=1;
        ordenes = new Orden[8];
        ItemOrden tempItem1 = new ItemOrden(1, 2, getProducto(0));
        ItemOrden tempItem2 = new ItemOrden(2, 2, getProducto(1));
        
       ArrayList<ItemOrden> compra1 = new ArrayList<ItemOrden>();
        
       compra1.add(tempItem1);
       compra1.add(tempItem2);
       
       
       
        ordenes[0] = new Orden(getCliente(0), compra1, 50, "Normal", "Cancelado", 3);
        ordenes[1] = new Orden(getCliente(1), compra1, 75, "Gold", "Cancelado", 2);
        
        
    }
    
    /**
     * devuleve array de clientes
     * @return array
     */
    public static Cliente[] getClientes() {
        return clientes;
    }
/**
 * recive un array de clientes
 * @param clientes array
 */
    public static void setClientes(Cliente[] clientes) {
        DataSistema.clientes = clientes;
    }
    /**
     * devuelve un array de producto
     * @return array
     */
    
     public static Producto[] getProductos() {
        return productos;
    }
     /**
      * recive un array de productos
      * @param productos array
      */

    public static void setProductos(Producto[] productos) {
        DataSistema.productos = productos;
    }

    
}
