package carinventory.itc.cargarageinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carinventory.itc.cargarageinventory.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);

}
