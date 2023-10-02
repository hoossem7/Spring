package tn.esprit.se.springproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class universite {
    @Id
    private long idUniversite;
    private String nomUniversite;
    private String adresse;

    public universite() {
    }

    public universite(long idUniversite, String nomUniversite, String adresse) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
    }

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    @OneToOne
    private foyer foyer;

    public tn.esprit.se.springproject.entity.foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(tn.esprit.se.springproject.entity.foyer foyer) {
        this.foyer = foyer;
    }
}