package tsaicruz.proyecto2.proyecto2.entities;

public class Auto extends Vehiculo {

    private int puertas;


    public Auto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);

    }

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
      
    }

    @Override
    public String toString() {        
        return super.toString() + " Puertas : " + puertas + " //  Precio : $" + super.getPrecioFormat();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}
