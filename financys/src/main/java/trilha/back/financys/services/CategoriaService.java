package trilha.back.financys.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.repositories.CategoriaRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public long idCategoryByName(String nameCategory) {
        ArrayList<CategoriaEntity> result = categoriaRepository.findByName(nameCategory);
        return result.isEmpty() ? 0 : result.get(0).getId();
    }
    public void save(CategoriaEntity categoriaEntity){
        categoriaRepository.save(categoriaEntity);
    }
    public List<CategoriaEntity> findAll(){
        List<CategoriaEntity> categoriaEntity =categoriaRepository.findAll();
        return categoriaEntity;
    }
    public CategoriaEntity findById(long id){
        return categoriaRepository.findById(id).get();
    }
    public void deleteById(long id){
        categoriaRepository.deleteById(id);
    }


}