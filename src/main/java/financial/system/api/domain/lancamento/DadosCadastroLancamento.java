package financial.system.api.domain.lancamento;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosCadastroLancamento(
        @NotNull
        TipoLancamento lancamento,
        @NotBlank
        String descricao,

        @FutureOrPresent
        LocalDate dataVencimento,

        @PastOrPresent
        LocalDate dataPagamento,

        @Positive
        BigDecimal valor,

        @Size(max = 150, message = "O campo 'Observação' deve ter no máximo 150 caracteres")
        String observacao,

        @NotNull
        Long idCategoria,
        @NotNull
        Long idPessoa) {
}