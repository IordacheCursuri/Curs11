package com.itFactory.serializare;

import java.io.Serializable;

public class Caine implements Serializable {

    private String nume;
    private String varsta;

    private transient int greutate;

    private static final long serialVersionUID = 1L;

    public Caine(String nume, String varsta, int greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "nume='" + nume + '\'' +
                ", varsta='" + varsta + '\'' +
                '}';
    }
}
