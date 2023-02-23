package gerenciadorPessoas.api.domain.pessoa;

import gerenciadorPessoas.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record DadosCadastradosPessoas(
        @NotNull
        @NotBlank
        String nome,
        @NotBlank
        String datanasc,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}
