package tsaicruz.proyecto2.proyecto2.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import tsaicruz.proyecto2.proyecto2.entities.Auto;
import tsaicruz.proyecto2.proyecto2.entities.Moto;
import tsaicruz.proyecto2.proyecto2.entities.Vehiculo;

public class Concesionaria {

    private static List<Vehiculo> list = new ArrayList<>();

    public static void main(String[] args) {


        colvehiculos();
        separador();


        ordennatural();
        separador();

    
        preciomax();
        separador();


        preciomin();
        separador();


        conletray();
        separador();


        ordenadomaxmin();
        separador();


        ordennaturalmmp();
        separador();

    }

    private static void preciomax() {
        double max = 
                    list
                        .stream()
                        .max(Comparator.comparing(Vehiculo::getPrecio))
                        .get()
                        .getPrecio();

                    list
                        .stream()
                        .filter(a -> a.getPrecio() == max)
                        .forEach(a -> System.out.println(a.getMarca() + " " + a.getModelo()));
    }

    private static void ordennaturalmmp() {
        list
                .stream()
                .sorted(Comparator
                        .comparing(Vehiculo::getMarca)
                        .thenComparing(Vehiculo::getModelo)
                        .thenComparingDouble(Vehiculo::getPrecio))
                .forEach(System.out::println);
    }

    private static void ordenadomaxmin() {
        list
                .stream()
                .sorted(Comparator
                        .comparingDouble(Vehiculo::getPrecio)
                        .reversed()
                        .thenComparing(Vehiculo::getMarca))
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));

    }

    private static void preciomin() {
        double min = list.stream().min(Comparator.comparing(Vehiculo::getPrecio)).get().getPrecio();

        list.stream().filter(a -> a.getPrecio() == min)
                .forEach(a -> System.out.println(a.getMarca() + " " + a.getModelo()));
    }

    private static void conletray() {
        list
                .stream()
                .filter(l -> l.getModelo().toLowerCase().contains("y"))
                .forEach(l -> System.out.println(l.getMarca() + " " + l.getModelo() + " " + "$" + l.getPrecio()));

    }

    private static void colvehiculos() {
        list.add(new Auto("Peugeot", "206", 4, 200000));
        list.add(new Moto("Honda", "Titan", 125, 60000));
        list.add(new Auto("Peugeot", "208", 5, 250000));
        list.add(new Moto("Yamaha", "YBR", 160, 80500.50));
    }

    private static void ordennatural() {

        list.stream().forEach(System.out::println);

    }

    private static void separador() {
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

    }
}
