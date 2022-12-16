package io.github.danielkhalils.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.danielkhalils.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
