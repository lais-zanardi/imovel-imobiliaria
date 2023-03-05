package ada.entities;

import ada.enums.TipoDeCliente;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Cliente {
    @Id
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private List<Imovel> imoveisCliente;
    private Long dadosBancariosId;
    private TipoDeCliente tipoDeCliente;
}
