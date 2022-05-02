package tsaicruz.proyecto2.proyecto2.entities;


public class Moto extends Vehiculo {

    private int cilindrada;


    public Moto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;      
    }

    @Override
    public String toString() {      
        return super.toString() + "cilindrada : " + cilindrada + "c  // " + " Precio : $" + super.getPrecioFormat();
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
