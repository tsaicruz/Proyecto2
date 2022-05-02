package tsaicruz.proyecto2.proyecto2.entities;

import java.text.DecimalFormat;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;


    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo:  " + modelo + " // ";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getPrecioFormat(){
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        return df.format(precio);
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

};