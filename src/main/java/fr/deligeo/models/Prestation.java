package fr.deligeo.models;

import java.time.YearMonth;

public class Prestation {

    /**
     * Date de la prestation avec simplement le mois et l'année
     */
    private YearMonth date;

    /**
     * Durée en heure de la prestation
     */
    private int duree;

    /**
     * Prix de la prestation en euros par heure
     */
    private int prixHoraire;

    public Prestation() {}

    public Prestation(YearMonth date, int duree, int prixHoraire) {
        this.date = date;
        this.duree = duree;
        this.prixHoraire = prixHoraire;
    }

    public YearMonth getDate() {
        return date;
    }

    public void setDate(YearMonth date) {
        this.date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getPrixHoraire() {
        return prixHoraire;
    }

    public void setPrixHoraire(int prixHoraire) {
        this.prixHoraire = prixHoraire;
    }

    @Override
    public String toString() {
        return "Prestation{" +
                "date=" + date +
                ", duree=" + duree +
                ", prixHoraire=" + prixHoraire +
                '}';
    }
}
