package io.github.danielkhalils.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.danielkhalils.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
