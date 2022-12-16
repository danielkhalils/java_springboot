package io.github.danielkhalils.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.danielkhalils.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
