package patika.demo.repo;

import patika.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u FROM User u Where u.creditScore=?1")
    User findByScore(int creditScore);
}
