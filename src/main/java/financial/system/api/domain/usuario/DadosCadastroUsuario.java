package financial.system.api.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotNull
        String nome,
        @NotNull
        String email,
        @NotNull
        String senha) {
}
