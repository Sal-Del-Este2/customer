package cl.duoc.ms_product_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.ms_product_db.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}