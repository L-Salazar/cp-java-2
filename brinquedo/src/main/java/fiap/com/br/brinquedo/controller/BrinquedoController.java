package fiap.com.br.brinquedo.controller;

import fiap.com.br.brinquedo.model.Brinquedo;
import fiap.com.br.brinquedo.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService service;

    @PostMapping
    public Brinquedo criar(@RequestBody Brinquedo brinquedo) {
        return service.salvar(brinquedo);
    }

    @GetMapping
    public List<Brinquedo> listar() {
        return service.listarTodos();
    }

    @PutMapping("/{id}")
    public Brinquedo atualizar(@PathVariable Long id, @RequestBody Brinquedo brinquedo) {
        return service.atualizar(id, brinquedo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
