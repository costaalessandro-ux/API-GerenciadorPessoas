package gerenciadorPessoas.api.domain.pessoa;

import gerenciadorPessoas.api.domain.endereco.Endereco;

public record DadosListarPessoas(Long id, String nome, String datanasc, Endereco endereco) {
    public DadosListarPessoas(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getDatanasc(), new Endereco());
    }
}
