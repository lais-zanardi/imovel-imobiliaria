package ada.services;

import ada.entity.Imovel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PesquisarImovelService {
    private final CrudRepository<Imovel, String> repository;

    public Optional<Imovel> getById(String id) {
        return repository.findById(id);
    }

    public Iterable<Imovel> getByLocalizacao(Imovel entity) {
        return repository.findAllById(Collections.singleton(entity.getLocalizacao()));
    }

    public Iterable<Imovel> getByComodos(Imovel entity) {
        return repository.findAllById(Collections.singleton(entity.getComodos()));
    }

    public Iterable<Imovel> getByTipoImovel(Imovel entity) {
        return repository.findAllById(Collections.singleton(entity.getTipoImovel()));
    }

}


