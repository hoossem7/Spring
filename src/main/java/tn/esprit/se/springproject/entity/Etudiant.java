
package tn.esprit.se.springproject.entity;
        import jakarta.persistence.*;

        import java.io.Serializable;
        import java.sql.Date;
        import java.util.Set;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<reservation> reservation;


    public Etudiant(String nomEt, String prenomEt, Long cin, String ecole, Date dateNaissance) {

        this.idEtudiant = idEtudiant;
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.cin = cin;
        this.ecole = ecole;
        this.dateNaissance = dateNaissance;
    }


// Constructeur et accesseurs (getters) et mutateurs (setters)
    public Long getidEtudiant () {
        return idEtudiant;
    }
    public void setidEtudiant (Long idEtudiant){
        this.idEtudiant = idEtudiant;
    }
    public String getnomEt () {
        return nomEt;
    }
    public void setnomEt (String nomEt){
        this.nomEt = nomEt;
    }
    /*public String getprenomEt () {
        return nomEt;
    }
    public void setprenomEt (String prenomEt){
        this.prenomEt = prenomEt;
    }*/
    public String getprenomEt() {
        return prenomEt;
    }

    public void setprenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }
    public Long getcin () {
        return cin;
    }
    public void setcin (Long cin){
        this.cin = cin;
    }
    public String getecole() {
        return ecole;
    }
    public void setecole (String ecole){
        this.ecole = ecole;
    }
    public Date getdateNaissance () {
        return dateNaissance;
    }
    public void setdateNaissance (Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    /*@Override
    public String toString() {
        return "Etudiant [idEtudiant=" + idEtudiant + ",nomEt=" + nomEt + ",prenomEt=" + prenomEt + " ,cin=" + cin+ ", ecole=" + ecole + ",dateNaissance=" + dateNaissance + "]";
    }
    @Override
    public String toString() {
        return "Etudiant [idEtudiant=" + idEtudiant + ", nomEt=" + nomEt + ", prenomEt=" + prenomEt + ", cin=" + cin + ", ecole=" + ecole + ", dateNaissance=" + dateNaissance + "]";
    }*/

    public Set<tn.esprit.se.springproject.entity.reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Set<tn.esprit.se.springproject.entity.reservation> reservation) {
        this.reservation = reservation;
    }
}




