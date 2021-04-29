package edu.upc.dsa.models;

public class Marca {
    String marca;
    int vacunes;

    public Marca(String marca, int vacunes) {
        this.setMarca(marca);
        this.setVacunes(vacunes);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setVacunes(int vacunes) {
        this.vacunes = vacunes;
    }

    public int getVacunes() {
        return vacunes;
    }
}
