package com.example.formulario;

public class estudianteModelo {
    private String codigo, nombre , carrera;


    public estudianteModelo (String codigo, String nombre ,String carrera){

        this.codigo =codigo;
        this.carrera = carrera;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}