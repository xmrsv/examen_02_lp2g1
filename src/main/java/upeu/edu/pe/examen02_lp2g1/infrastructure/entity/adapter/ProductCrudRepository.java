package upeu.edu.pe.examen02_lp2g1.infrastructure.entity.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.examen02_lp2g1.infrastructure.entity.ProductEntity;
import upeu.edu.pe.examen02_lp2g1.infrastructure.entity.UserEntity;

// Esta interfaz define un repositorio CRUD para la entidad ProductEntity
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {

    // Este método busca productos relacionados con un UserEntity específico
    Iterable<ProductEntity> findByUserEntity(UserEntity user);
}
