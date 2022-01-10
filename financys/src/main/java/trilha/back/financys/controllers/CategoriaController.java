package trilha.back.financys.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dtos.CategoriaDTO;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.services.CategoriaService;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/categorias", produces="application/json")
@CrossOrigin(origins = "*")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @PostMapping("/save")
    public ResponseEntity<CategoriaDTO> create(@RequestBody @Valid CategoriaEntity body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.create(body));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<CategoriaDTO>> readAll() {
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.readAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<CategoriaDTO> readById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.readById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CategoriaDTO> update(@PathVariable Long id, @RequestBody CategoriaEntity body){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.update(id, body));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        categoriaService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}