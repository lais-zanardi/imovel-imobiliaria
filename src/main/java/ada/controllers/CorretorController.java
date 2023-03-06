package ada.controllers;

import ada.entities.Corretor;
import ada.services.CorretorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/corretor")
@RequiredArgsConstructor
public class CorretorController {

    private final CorretorService service;

    @PostMapping("/{id}")
    public void salvar(@RequestBody Corretor corretor) {
        service.save(corretor);
    }

    @PutMapping("/{id}")
    public void atualizar(@RequestBody Corretor corretor) {
        service.atualizarCorretor(corretor);
    }

    @GetMapping("/{id}")
    public Optional<Corretor> pesquisar(@RequestBody Corretor corretor) {
        return service.getById(corretor);
    }

    @DeleteMapping("/{id}")
    public Optional<Corretor> deletar(@RequestBody Corretor corretor) {
        return service.deleteById(corretor);
    }





}
