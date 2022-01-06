package trilha.back.financys.controllers;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.repositories.CategoriaRepository;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/v1/categorias", produces="application/json")
@CrossOrigin(origins = "*")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/save")
    public ResponseEntity<CategoriaEntity> categoriaSalva(@RequestBody CategoriaEntity body) {

        categoriaRepository.save(body);
        return ResponseEntity.ok(body);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<CategoriaEntity>> categoriaLista() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<CategoriaEntity>> categoriaUnica(@PathVariable Long id) {
        return ResponseEntity.ok(categoriaRepository.findById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CategoriaEntity> categoriaAlterar(@PathVariable Long id, @RequestBody CategoriaEntity body){
        var aux = categoriaRepository.findById(id).get();
        BeanUtils.copyProperties(body,aux,"id");
        categoriaRepository.save(aux);
        return ResponseEntity.ok(body);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> categoriaDeletar(@PathVariable Long id){
        categoriaRepository.deleteById(id);
        return new ResponseEntity<> (HttpStatus.OK);
    }
}