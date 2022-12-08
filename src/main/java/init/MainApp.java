package init;

import dao.DaoProdotti;
import model.Prodotto;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        DaoProdotti dao = new DaoProdotti();

        List<Prodotto> prodotti = dao.getProdotti();

        for(Prodotto p: prodotti) {
            System.out.println(p.toString());
        }
    }
}
