package financial.system.api.domain.pessoa;

import jakarta.validation.constraints.NotNull;
import financial.system.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPessoa(
        @NotNull
        Long id,
        String nome,
        DadosEndereco endereco){
}
