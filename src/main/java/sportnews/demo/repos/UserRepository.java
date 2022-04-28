package sportnews.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import sportnews.demo.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
