package carinventory.itc.cargarageinventory.repository;

import carinventory.itc.cargarageinventory.entity.UserEn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEn, Long> {
    Optional<UserEn> findByUsername(String username);

    boolean existsByUsername(String username);
}
