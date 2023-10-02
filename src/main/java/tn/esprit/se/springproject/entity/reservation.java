package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class reservation {
    @Id

    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToMany(mappedBy="reservation", cascade = CascadeType.ALL)
    private Set<Etudiant>Etudiant ;
    public reservation() {
    }

    public reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

    public Set<tn.esprit.se.springproject.entity.Etudiant> getEtudiant() {
        return Etudiant;
    }

    public void setEtudiant(Set<tn.esprit.se.springproject.entity.Etudiant> etudiant) {
        Etudiant = etudiant;
    }
}