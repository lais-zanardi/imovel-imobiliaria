package ada.entities;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Corretor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nome;
    private double taxaComissao;
}
