package clases.basico;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Carro carroMateo = new Audi();
        Carro carroJuan = new Mazda();
        Carro carroFabian = new Nissa();
        List<Carro> carros = new ArrayList<>();
        carros.add(carroJuan);
        carros.add(carroFabian);
        carros.add(carroMateo);
        verPrecioCarro(carros);
    }

    /*
    //Open Closed : UD TIENE QUE SER ABIERTO A EXTENSION Y cerrado a modificacion
    public static void verPrecioCarro(List<Carro> carros) {
        for (Carro carro : carros) {
            //UN SWITCH ES LA MISMA VAINA QUE UN IF, SOLO Q MAS BONITO, PERO ES LO MISMO
            if ("Audi".equals(carro.getMarca())) {
                //Constante contra variable
                System.out.println("20000");
            } else if (carro.getMarca().equals("BMW")) {
                System.out.println("30000");
            } else if (carro.getMarca().equals("Chevrolet")) {
                System.out.println("5000");
            }
        }
    }
     */

    public static void verPrecioCarro(List<Carro> carros) {
        for (Carro carro : carros) {
            System.out.println(carro.verPrecio());
        }
    }

    public static void puertas(Carro carro) {
        //Lisvok MUY relacionado con el polimorfismo
        //TODO EL PRINCIPIO DE LISVOK HABLA DE POLIMORFISMO, PERO NO TODO EL POLIMORFISMO HABLA DE LISKOV
        carro.numeroPuertas();
    }

}
