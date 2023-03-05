import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Imovel {
    @Id
    private String id;
    private String comodos;
    private String localizacao;
    private String tipoImovel;
    private Boolean disponivelParaLocacao;
    private BigDecimal valorLocacao;
    private String corretorResponsavel;
    private String cliente;
}
