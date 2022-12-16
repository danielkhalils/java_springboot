package io.github.danielkhalils.cursospring.repositories;

import io.github.danielkhalils.cursospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
