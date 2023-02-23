package gerenciadorPessoas.api.domain.pessoa;

public record DadosListarPessoas(Long id, String nome, String datanasc) {
    public DadosListarPessoas(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getDatanasc());
    }
}
