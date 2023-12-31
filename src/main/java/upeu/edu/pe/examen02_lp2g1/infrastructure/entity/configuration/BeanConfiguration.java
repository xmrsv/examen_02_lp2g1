package upeu.edu.pe.examen02_lp2g1.infrastructure.entity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.examen02_lp2g1.app.repository.ProductRepository;
import upeu.edu.pe.examen02_lp2g1.app.repository.StockRepository;
import upeu.edu.pe.examen02_lp2g1.app.service.ProductService;
import upeu.edu.pe.examen02_lp2g1.app.service.StockService;
import upeu.edu.pe.examen02_lp2g1.app.service.UploadFile;

/**
 * Configuración de beans para la aplicación.
 */
@Configuration
public class BeanConfiguration {

    /**
     * Define un bean para ProductService, que gestiona los servicios
     * relacionados con los productos.
     *
     * @param productRepository Repositorio de productos.
     * @param uploadFile Servicio de carga de archivos asociados a productos.
     * @return Instancia de ProductService.
     */
    @Bean
    public ProductService productService(ProductRepository productRepository, UploadFile uploadFile) {
        return new ProductService(productRepository, uploadFile);
    }

    /**
     * Define un bean para StockService, que gestiona los servicios relacionados
     * con el inventario.
     *
     * @param stockRepository Repositorio de inventario.
     * @return Instancia de StockService.
     */
    @Bean
    public StockService stockService(StockRepository stockRepository) {
        return new StockService(stockRepository);
    }

    /**
     * Define un bean para UploadFile, que proporciona servicios de carga de
     * archivos.
     *
     * @return Instancia de UploadFile.
     */
    @Bean
    public UploadFile uploadFile() {
        return new UploadFile();
    }
}
