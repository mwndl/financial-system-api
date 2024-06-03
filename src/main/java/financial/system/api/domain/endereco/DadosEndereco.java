package financial.system.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DadosEndereco(

        @Size(min = 1, max = 100, message = "O campo 'Logradouro' deve ter no máximo 100 caracteres")
        String logradouro,
        @Size(min = 1, max = 50, message = "O campo 'Bairro' deve ter no máximo 50 caracteres")
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,

        @Size(min = 1, max = 50, message = "O campo 'Cidade' deve ter no máximo 50 caracteres")
        String cidade,
        @NotBlank
        @Size(max = 2, message = "O campo 'Estado' deve ter no máximo 2 caracteres")
        String estado,
        @Size(max = 75, message = "O campo 'Complemento' deve ter no máximo 75 caracteres")
        String complemento,
        @Size(max = 5, message = "O campo 'Numero' deve ter no máximo 5 caracteres")
        String numero) {}