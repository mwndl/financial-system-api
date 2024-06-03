package financial.system.api.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Long id,
        @NotNull
        String nome,
        @NotNull
        String email,
        @NotNull
        String senha) {
}
