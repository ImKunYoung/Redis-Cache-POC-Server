package com.poc.redis.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ShoppingCart entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {}
