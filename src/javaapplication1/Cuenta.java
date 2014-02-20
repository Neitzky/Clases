/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author T107
 */
public class Cuenta {

   private int id;
    private String nombre;
    private float saldo;
    
    public void setId (int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    //Hagan los demas
    
    
    //Encapsulamiento Nombre
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //Encapsulamiento Saldo
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //Aquí estan los metodos.
    
    public void crearCuenta(){
        System.out.println("Cuenta creada con exito");
    }
}
