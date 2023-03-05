package ada.services;

import ada.entities.Imovel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CriarImovelService {
    private final CrudRepository<Imovel, String> repository;

    public Imovel salvar(Imovel entity) {
        entity.setId(UUID.randomUUID().toString());
        log.info("Imóvel ID {}", entity.getId());

        return repository.findById(entity.getId())
                .orElse(repository.save(entity));
    }
}
