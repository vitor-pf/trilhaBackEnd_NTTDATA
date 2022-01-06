package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.entities.LancamentoEntity;

@Repository
public interface LancamentoRepository extends JpaRepository<LancamentoEntity, Long> {

}
