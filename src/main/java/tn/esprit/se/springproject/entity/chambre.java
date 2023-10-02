package tn.esprit.se.springproject.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    public chambre() {
    }

    public chambre(long idChambre, long numeroChambre, TypeChambre typeC) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.typeC = typeC;
    }

    public long getIdChambre() {
        return idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
    @ManyToOne
    bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<reservation> reservation;

    public Set<tn.esprit.se.springproject.entity.reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Set<tn.esprit.se.springproject.entity.reservation> reservation) {
        this.reservation = reservation;
    }
}