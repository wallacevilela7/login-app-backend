package wvsdev.loginauthapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wvsdev.loginauthapi.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String login);
}