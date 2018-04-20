/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author Nicolas Oliva
 */
public class Auto 
{
    private int idAuto;
    private Marca marca;
    private Modelo modelo;
    private TipoMotor tipoMotor;

    public boolean Doblar(int velocidad){
        boolean doblar;
        if (velocidad >= 60){
           doblar = false;
        }
           else {
           doblar = true;
        }
        return doblar;
        
         }
    
    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }   
    
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    public void frenar(){
        int speed = 100;
        System.out.println("Frenando");
        while(speed!=0){
            speed-=1;
        }
        System.out.println("Frenado");    
    }
        
    
    public void acelerar()
    {
        int speed=0;
        System.out.println("Acelerando");
        while (speed<=60)
        {
            System.out.println("Velocidad: " + speed + " Km/h");
            speed = speed + 10;
        }
    }
    
}
