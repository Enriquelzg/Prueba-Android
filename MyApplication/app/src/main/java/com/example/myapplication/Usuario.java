package com.example.myapplication;
import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre, apellidos, numero;
    public Usuario(){

    }
    public Usuario(String nom, String apell, String num){
        nombre= nom;
        apellidos= apell;
        numero = num;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getNumero(){
        return numero;
    }
}
