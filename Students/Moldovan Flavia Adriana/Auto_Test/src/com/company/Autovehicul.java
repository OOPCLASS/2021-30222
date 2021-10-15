package com.company;

public class Autovehicul {
    private static final int AN_DE_FABRICATIE = 2010;

    private String marca;
    private String culoare;
    private int vitezaCurenta;
    private int treaptaDeVitezaCurenta;
    private int vitezaMaxima;
    private int nrTrepteDisponibile;
    private Sofer sofer;
    private Rezervor rezervor;


    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public Sofer getSofer() {
        return sofer;
    }


    public Rezervor getRezervor() {
        return rezervor;
    }

    public void setRezervor(Rezervor rezervor) {
        this.rezervor = rezervor;
    }

    @Override
    public String toString() {
        return marca + '\'' +
               culoare + '\'' +
                vitezaCurenta +  '\''
                 + treaptaDeVitezaCurenta + '\''
               + vitezaMaxima + '\''
                + nrTrepteDisponibile
                ;
    }


    public Autovehicul (String marca, String culoare, int vitezaCurenta, int treaptaDeVitezaCurenta, int vitezaMaxima, int nrTrepteDisponibile){
        this.setMarca(marca);
        this.setCuloare(culoare);
        this.setVitezaCurenta(vitezaCurenta);
        this.setTreaptaDeVitezaCurenta(treaptaDeVitezaCurenta);
        this.setVitezaMaxima(vitezaMaxima);
        this.setNrTrepteDisponibile(nrTrepteDisponibile);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public void setTreaptaDeVitezaCurenta(int treaptaDeVitezaCurenta) {
        this.treaptaDeVitezaCurenta = treaptaDeVitezaCurenta;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public void setNrTrepteDisponibile(int nrTrepteDisponibile) {
        this.nrTrepteDisponibile = nrTrepteDisponibile;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public int getTreaptaDeVitezaCurenta() {
        return treaptaDeVitezaCurenta;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public int getNrTrepteDisponibile() {
        return nrTrepteDisponibile;
    }
}
