package repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.springproject.entity.Etudiant;

public interface repository extends JpaRepository<Etudiant, Long>  {
}
