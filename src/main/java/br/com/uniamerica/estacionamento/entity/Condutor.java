package br.com.uniamerica.estacionamento.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalTime;

@Entity
@Table(name = "condutores", schema = "public")
public class Condutor extends AbstractEntity {
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Getter @Setter
    @Column(name = "cpf", nullable = false, unique = true, length = 15)
    private String cpf;
    @Getter @Setter
    @Column(name = "telefone", nullable = false, length = 17)
    private String telefone;
    @Getter @Setter
    @Column(name = "tempo_gasto")
    private LocalTime tampoPago;
    @Getter @Setter
    @Column(name = "tempo_desconto")
    private LocalTime tempoDesconto;

}
