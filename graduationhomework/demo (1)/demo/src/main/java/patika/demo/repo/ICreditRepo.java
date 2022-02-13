package patika.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import patika.demo.bean.Credit;

public interface ICreditRepo extends JpaRepository<Credit, Long> {
    @Query(value = "SELECT c FROM Credit c WHERE c.id=?1")
    Credit findByid(Long id);
}
