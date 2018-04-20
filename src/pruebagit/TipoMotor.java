/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author Mati
 */
public class TipoMotor {
    
    private int idtipoMotor;
    private String nombre, descripcion;

    public int getIdMotor() {
        return idtipoMotor;
        
    }

    public void setIdMotor(int idMotor) {
        this.idtipoMotor = idMotor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   
    
}
