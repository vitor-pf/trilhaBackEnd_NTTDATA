package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.entities.CategoriaEntity;

import java.util.ArrayList;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

    ArrayList<CategoriaEntity> findByNameCategoria(String nameCategoria);
}

