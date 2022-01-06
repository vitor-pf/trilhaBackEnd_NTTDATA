package trilha.back.financys.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.services.LancamentoService;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/lancamentos", produces="application/json")
@CrossOrigin(origins = "*")
public class LancamentoController {
    @Autowired
    private LancamentoService lancamentoService;

    @PostMapping("/save")
    public ResponseEntity<LancamentoEntity> lancamentoSalva(@RequestBody LancamentoEntity body) {
        boolean statusCategoria = lancamentoService.validateCategoryById(body.getCategory().getId());
        if(statusCategoria == true) {
            lancamentoService.save(body);
            return ResponseEntity.status(HttpStatus.CREATED).body(body);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
    @GetMapping("/findAll")
    public ResponseEntity<List<LancamentoEntity>> lancamentoLista() {
        List<LancamentoEntity> lancamentoEntity = lancamentoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoEntity);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<LancamentoEntity> lancamentoUnica(@PathVariable Long id) {
        LancamentoEntity lancamentoEntity = lancamentoService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(lancamentoEntity);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<LancamentoEntity> lancamentoAlterar(@PathVariable Long id, @RequestBody LancamentoEntity body){
        LancamentoEntity aux = lancamentoService.findById(id);
        BeanUtils.copyProperties(body,aux,"id");
        lancamentoService.save(aux);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> lancamentoDeletar(@PathVariable Long id){
        lancamentoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}