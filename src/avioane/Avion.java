package avioane;

import descrieri.Descriptiv;
import vehicule.VehiculZburator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Avion extends VehiculZburator implements Descriptiv {

    public Avion(String model, int viteza) {
        super(model, viteza);
    }

    public Avion() {
    }

    @Override
    public void setViteza() {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Setati viteza");

        try {
            int input = scanner.nextInt();
            scanner.nextLine();
            this.viteza = input;
        }catch (InputMismatchException e){
            System.out.println("Tip de date incorect");
        }
        System.out.println("Viteza este: " + this.viteza);
    }

    @Override
    public String toString() {
        return this.model + " viteza: " + this.viteza;
    }
    @Override
    public void afisareDate(List<Avion> avion) throws IOException {

        FileWriter writer = new FileWriter("output.txt");
            for(Avion a : avion){

            writer.write(a.toString() + System.lineSeparator());
        }
            writer.close();

    }


}
