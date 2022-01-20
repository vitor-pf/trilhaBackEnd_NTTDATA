package trilha.back.financys.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dtos.LancamentoRequestDTO;
import trilha.back.financys.dtos.LancamentoResponseDTO;
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
    public ResponseEntity <?> grafico() {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.grafico());
    }
    @PostMapping("/save")
    public ResponseEntity<LancamentoResponseDTO> create(@RequestBody @Valid LancamentoRequestDTO body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoService.create(body));
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<LancamentoResponseDTO>> readAll(@RequestParam(required = false, defaultValue = "") String paid) {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.readAll(paid));
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<LancamentoResponseDTO> readById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.readById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<LancamentoResponseDTO> update(@PathVariable Long id, @RequestBody @Valid LancamentoRequestDTO body){
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.update(id, body));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        lancamentoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y){
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.calculaMedia(x,y));
    }
}