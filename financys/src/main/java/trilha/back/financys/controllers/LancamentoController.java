package trilha.back.financys.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dtos.LancamentoDTO;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.services.LancamentoService;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/lancamentos", produces="application/json")
@CrossOrigin(origins = "*")
public class LancamentoController {
    @Autowired
    private LancamentoService lancamentoService;

    @GetMapping("/grafico")
    public ResponseEntity<?> grafico() {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.grafico());
    }
    @PostMapping("/save")
    public ResponseEntity<LancamentoDTO> create(@RequestBody @Valid LancamentoEntity body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoService.create(body));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<LancamentoDTO>> readAll() {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.readAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<LancamentoDTO> readById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.readById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<LancamentoDTO> update(@PathVariable Long id, @RequestBody @Valid LancamentoEntity body){
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.update(id, body));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        lancamentoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}