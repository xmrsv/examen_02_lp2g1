package upeu.edu.pe.examen02_lp2g1.infrastructure.entity.adapter;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.examen02_lp2g1.infrastructure.entity.ProductEntity;
import upeu.edu.pe.examen02_lp2g1.infrastructure.entity.StockEntity;

/**
 * Interfaz que extiende CrudRepository para realizar operaciones CRUD en
 * StockEntity.
 */
@Repository
public interface StockCrudRepository extends CrudRepository<StockEntity, Integer> {

    List<StockEntity> getStockByProductEntity(ProductEntity productEntity);

}
