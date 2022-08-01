package com.example.robib;

public class PersoanaModel {
    String Nume;
    String Despre;
    String image;

    public PersoanaModel() {
    }

    public PersoanaModel(String nume, String despre, String image) {
        Nume = nume;
        Despre = despre;
        this.image = image;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getDespre() {
        return Despre;
    }

    public void setDespre(String despre) {
        Despre = despre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
