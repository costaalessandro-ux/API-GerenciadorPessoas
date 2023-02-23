package gerenciadorPessoas.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        @Pattern(regexp =  "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String numero) {
}
