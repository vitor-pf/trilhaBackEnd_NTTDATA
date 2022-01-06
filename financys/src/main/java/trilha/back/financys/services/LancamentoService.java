package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.repositories.LancamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LancamentoService {
    @Autowired
    private LancamentoRepository lancamentoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    public boolean validateCategoryById(long idCategory) {
        Optional<CategoriaEntity> result = categoriaRepository.findById(idCategory);
        if(result.isEmpty()){
            return false;
        }
        return true;
    }
    public void save(LancamentoEntity lancamentoEntity){
        lancamentoRepository.save(lancamentoEntity);
    }
    public List<LancamentoEntity> findAll(){
        List<LancamentoEntity> lancamentoEntity = lancamentoRepository.findAll();
        return lancamentoEntity;
    }
    public LancamentoEntity findById(long id){
        return lancamentoRepository.findById(id).get();
    }
    public void deleteById(long id){
        lancamentoRepository.deleteById(id);
    }


}