package avioane;

import descrieri.Descriptiv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zboruri {
    public static void main(String[] args) throws IOException {
        Avion av1 = new Avion();
        Avion av2 = new Avion("Boeing",500);
        Avion av3 = new Avion();

        List<Avion> listaAv = new ArrayList<>();
        listaAv.add(av1);
        listaAv.add(av2);
        listaAv.add(av3);

        av1.setViteza();
        av3.setModel("airlines");
        av1.setModel("s");

        Descriptiv date = new Avion();
        date.afisareDate(listaAv);
    }
}
