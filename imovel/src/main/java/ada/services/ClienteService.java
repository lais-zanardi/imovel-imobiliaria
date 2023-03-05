package ada.services;

import ada.entities.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final CrudRepository<Cliente, String> repository;

    public Cliente save(Cliente entity) {
        return repository.save(entity);
    }

    public Cliente atualizar(Cliente entity) {
        Cliente atualizarCliente = new Cliente();
        atualizarCliente.setEndereco(entity.getEndereco());
        atualizarCliente.setImoveisCliente(entity.getImoveisCliente());
        atualizarCliente.setDadosBancariosId(entity.getDadosBancariosId());
        return atualizarCliente;
    }

    public Optional<Cliente> getById(Cliente cliente) {
        return repository.findById(cliente.getCpf());
    }

    public void deleteById(Cliente cliente) {
        repository.deleteById(cliente.getCpf());
    }
}
