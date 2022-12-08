package model;

public class Prodotto {

    private  int id;
    private String marca;
    private String prezzo;
    private String modello;

    public Prodotto(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Prodotto(int id, String marca, String prezzo, String modello) {
        this.id = id;
        this.marca = marca;
        this.prezzo = prezzo;
        this.modello = modello;
    }

    public Prodotto(String marca, String prezzo,String modello) {
        this.marca = marca;
        this.prezzo = prezzo;
        this.modello = modello;
    }

    @Override
    public String toString() {
        return id +
                ", " + marca +
                ", " + prezzo +
                ", " + modello;
    }
}
