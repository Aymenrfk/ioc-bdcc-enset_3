package net.rafiky.bdccensetspringmvc3.repository;

import net.rafiky.bdccensetspringmvc3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
