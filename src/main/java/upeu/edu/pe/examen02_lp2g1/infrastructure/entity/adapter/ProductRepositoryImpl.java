package upeu.edu.pe.examen02_lp2g1.infrastructure.entity.adapter;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.examen02_lp2g1.app.repository.ProductRepository;
import upeu.edu.pe.examen02_lp2g1.infrastructure.entity.ProductEntity;
import upeu.edu.pe.examen02_lp2g1.infrastructure.entity.UserEntity;

/**
 * Implementación del repositorio de productos utilizando Spring Data JPA.
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductCrudRepository productCrudRepository;

    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository) {
        this.productCrudRepository = productCrudRepository;
    }

    @Override
    public Iterable<ProductEntity> getProducts() {
        // Método propio de Spring Data JPA
        return productCrudRepository.findAll();
    }

    @Override
    public Iterable<ProductEntity> getProductsByUser(UserEntity user) {
        return productCrudRepository.findByUserEntity(user);
    }

    @Override
    public ProductEntity getProductById(Integer id) {
        return productCrudRepository.findById(id).get();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        return productCrudRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer id) {
        productCrudRepository.deleteById(id);
    }
}
