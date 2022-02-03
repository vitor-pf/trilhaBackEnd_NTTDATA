package trilha.back.financys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dtos.ChartDTO;
import trilha.back.financys.dtos.LancamentoRequestDTO;
import trilha.back.financys.dtos.LancamentoResponseDTO;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.services.LancamentoInterface;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/entry", produces="application/json")
public class LancamentoController {
    @Autowired
    private LancamentoInterface lancamentoService;
    @PostMapping
    public ResponseEntity<LancamentoResponseDTO> create(@RequestBody @Valid LancamentoRequestDTO body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoService.create(body));
    }
    @GetMapping
    public ResponseEntity<List<LancamentoResponseDTO>> readAll(@RequestParam(required = false, defaultValue = "") String paid) {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.readAll(paid));
    }
    @GetMapping("/{id}")
    public ResponseEntity<LancamentoResponseDTO> readById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.readById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<LancamentoResponseDTO> update(@PathVariable Long id, @RequestBody @Valid LancamentoRequestDTO body){
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.update(id, body));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        lancamentoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/grafico")
    public ResponseEntity <List<ChartDTO>> grafico() {
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.grafico());
    }
    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y){
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoService.calculaMedia(x,y));
    }
    @GetMapping("/filter")
    public ResponseEntity<List<LancamentoEntity>> getLancamentosDependentes(
            @RequestParam(value = "data_lancamento", required = false) String dataLancamento,
            @RequestParam(value = "amount", required = false) String amount,
            @RequestParam(value = "paid", required = false, defaultValue = "0") boolean paid
    ){
        return ResponseEntity.status(HttpStatus.OK).body(
                lancamentoService.getLancamentosDependentes(dataLancamento,amount,paid));
    }
}

