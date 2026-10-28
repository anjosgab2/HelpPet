package seduc2.help_Pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seduc2.help_Pet.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
