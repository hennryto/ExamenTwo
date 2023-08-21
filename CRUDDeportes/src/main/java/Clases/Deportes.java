/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 50683
 */
public class Deportes {
    private String nombreDeporte;
    private String tipo;
    private int cantidadJugadores;
    private String fechaCreacion;
    private String Pais;

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public Deportes() {
    }

    public Deportes(String nombreDeporte, String tipo, int cantidadJugadores, String fechaCreacion, String Pais) {
        this.nombreDeporte = nombreDeporte;
        this.tipo = tipo;
        this.cantidadJugadores = cantidadJugadores;
        this.fechaCreacion = fechaCreacion;
        this.Pais = Pais;
    }
    
    
}
