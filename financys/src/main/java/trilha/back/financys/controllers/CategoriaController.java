package trilha.back.financys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dtos.CategoriaRequestDTO;
import trilha.back.financys.dtos.CategoriaResponseDTO;
import trilha.back.financys.services.CategoriaInterface;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/category", produces="application/json")
public class CategoriaController {
    @Autowired
    private CategoriaInterface categoriaService;
    @PostMapping
    public ResponseEntity<CategoriaResponseDTO> create(@RequestBody @Valid CategoriaRequestDTO body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.create(body));
    }
    @GetMapping
    public ResponseEntity<List<CategoriaResponseDTO>> readAll() {
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.readAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaResponseDTO> readById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.readById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaResponseDTO> update(@PathVariable Long id, @RequestBody @Valid CategoriaRequestDTO body){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.update(id, body));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        categoriaService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}