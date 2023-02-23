package gerenciadorPessoas.api.domain.pessoa;

import gerenciadorPessoas.api.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= "id")
public class Pessoa {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String datanasc;

    @Embedded
    private Endereco endereco;

    public Pessoa(DadosCadastradosPessoas dados) {
        this.nome = dados.nome();
        this.datanasc = dados.datanasc();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInfos(DadosAtualizaPessoas dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        } if(dados.datanasc() != null){
            this.datanasc = dados.datanasc();
        }if(dados.endereco() != null){
            this.endereco.atualizarInfosEnd(dados.endereco());
        }
    }

}
