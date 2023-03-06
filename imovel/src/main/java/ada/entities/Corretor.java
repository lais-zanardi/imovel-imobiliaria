package ada.entities;

import ada.enums.TipoDeCliente;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Corretor {
    @Id
    private String id;
    private String nome;
    private double comissao;
    private Long dadosBancariosId;
}
