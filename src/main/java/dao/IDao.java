package dao;

import model.Prodotto;

import java.util.List;

public interface IDao {


    public final static String DBADDRESS = "jdbc:mysql://localhost:3306/prodotti?serverTimezone=UTC";
    public final static String USER = "root";
    public final static String PWD = "1379";

    public List<Prodotto> getProdotti();


}
