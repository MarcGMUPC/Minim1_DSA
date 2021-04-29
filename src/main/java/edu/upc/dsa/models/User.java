package edu.upc.dsa.models;

public class User {
    //Atributs
    String iduser, vacunes, fecha, estat;


    //Métodes
    public User(String iduser, String vacunes, String fecha, String estat) {
        this.setIduser(iduser);
        this.setVacunes(vacunes);
        this.setFecha(fecha);
        this.setEstat(estat);
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getIduser() {
        return iduser;
    }

    public void setVacunes(String vacunes) {
        this.vacunes = vacunes;
    }

    public String getVacunes() {
        return vacunes;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String getEstat() {
        return estat;
    }

    @Override
    public String toString() {
        return "User [iduser="+iduser+", vacunes=" + vacunes + ", fecha=" + fecha +", estat=" + estat+"]";
    }

}
