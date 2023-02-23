package gerenciadorPessoas.api.domain.pessoa;

import gerenciadorPessoas.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaPessoas(
        @NotNull
        Long id,
        String nome,
        String datanasc,
        @Valid DadosEndereco endereco) {
}
