package trilha.back.financys.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.services.CategoriaService;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/categorias", produces="application/json")
@CrossOrigin(origins = "*")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/save")
    public ResponseEntity<CategoriaEntity> categoriaSalva(@RequestBody CategoriaEntity body) {
        if(categoriaService.idCategoryByName(body.getName()) == 0){
            categoriaService.save(body);
            return ResponseEntity.status(HttpStatus.CREATED).body(body);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<CategoriaEntity>> categoriaLista() {
        List categoria = categoriaService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(categoria);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<CategoriaEntity> categoriaUnica(@PathVariable Long id) {
        CategoriaEntity categoriaEntity = categoriaService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(categoriaEntity);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CategoriaEntity> categoriaAlterar(@PathVariable Long id, @RequestBody CategoriaEntity body){
        CategoriaEntity aux = categoriaService.findById(id);
        BeanUtils.copyProperties(body,aux,"id");
        categoriaService.save(aux);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> categoriaDeletar(@PathVariable Long id){
        categoriaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}