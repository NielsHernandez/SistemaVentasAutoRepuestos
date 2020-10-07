/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * clase usuario
 * @author q669YS4G
 */
public class Usuario {
    
    private String usuario;
    private String pass;
    /**
     * constructor vacio por defecto
     */
    public Usuario(){}
    /**
     * constructor inicia el objeto con un usuario y contrasena
     * @param usuario
     * @param pass 
     */
    public Usuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }
/**
 * devuelve el valor de usuario
 * @return string
 */
    public String getUsuario() {
        return usuario;
    }
    /**
     * recive el valor de usuario
     * @param usuario string
     */

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
/**
 * devuelve la contrasena
 * @return string
 */
    public String getPass() {
        return pass;
    }
    /**
     * recive un string
     * @param pass string
     */

    public void setPass(String pass) {
        this.pass = pass;
    }
    /**
     * metodo sobre escrito toString
     * @return string
     */

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    
}
