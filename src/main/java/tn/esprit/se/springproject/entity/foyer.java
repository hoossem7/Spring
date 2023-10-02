package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class foyer {
    @Id
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne (mappedBy="foyer")
    private universite universite;

    public foyer() {
    }

    public foyer(long idFoyer, String nomFoyer, long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    public tn.esprit.se.springproject.entity.universite getUniversite() {
        return universite;
    }

    public void setUniversite(tn.esprit.se.springproject.entity.universite universite) {
        this.universite = universite;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<bloc> bloc;

    public Set<tn.esprit.se.springproject.entity.bloc> getBloc() {
        return bloc;
    }

    public void setBloc(Set<tn.esprit.se.springproject.entity.bloc> bloc) {
        this.bloc = bloc;
    }
}