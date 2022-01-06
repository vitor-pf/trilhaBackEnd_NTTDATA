package trilha.back.financys.controllers;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.repositories.LancamentoRepository;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/v1/lancamentos", produces="application/json")
@CrossOrigin(origins = "*")
public class LancamentoController {
    @Autowired
    private LancamentoRepository lancamentoRepository;

    @PostMapping("/save")
    public ResponseEntity<LancamentoEntity> lancamentoSalva(@RequestBody LancamentoEntity body) {
        var lancamento = new LancamentoEntity(
                body.getName(),body.getDescription(),body.getType(),
                body.getAmount(),body.getDate(),body.getPaid(),body.getCategoryId());
        lancamentoRepository.save(lancamento);
        System.out.println(body.getCategoryId());
        return ResponseEntity.ok(lancamento);
    }
    @GetMapping("/finfAll")
    public ResponseEntity<List<LancamentoEntity>> lancamentoLista() {
        return ResponseEntity.ok(lancamentoRepository.findAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<LancamentoEntity>> lancamentoUnica(@PathVariable Long id) {
        return ResponseEntity.ok(lancamentoRepository.findById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<LancamentoEntity> lancamentoAlterar(@PathVariable Long id, @RequestBody LancamentoEntity body){
        var aux = lancamentoRepository.findById(id).get();
        BeanUtils.copyProperties(body,aux,"id");
        lancamentoRepository.save(aux);
        return ResponseEntity.ok(body);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> lancamentoDeletar(@PathVariable Long id){
        lancamentoRepository.deleteById(id);
        return new ResponseEntity<> (HttpStatus.OK);
    }
}