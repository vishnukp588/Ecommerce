package ecommerce.app.e.packup.repositary;

import ecommerce.app.e.packup.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositary extends JpaRepository<ProductModel,Long> {
}
