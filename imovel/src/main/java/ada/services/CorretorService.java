package ada.services;

import ada.entities.Corretor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CorretorService {
    private final CrudRepository<Corretor, String> repository;

    public Corretor save(Corretor entity) {
        return repository.save(entity);
    }

    public Corretor atualizarCorretor(Corretor entity) {
        Corretor atualizaCorretor = new Corretor();
        atualizaCorretor.setComissao(entity.getComissao());
        return atualizaCorretor;
    }

    public Optional<Corretor> getById(Corretor corretor) {
        return repository.findById(corretor.getId());
    }

    public Optional<Corretor> deleteById(Corretor corretor) {
        repository.deleteById(corretor.getId());
        return null;
    }
}
