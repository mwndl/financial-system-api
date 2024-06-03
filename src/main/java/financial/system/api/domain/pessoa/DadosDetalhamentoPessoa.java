package financial.system.api.domain.pessoa;

import financial.system.api.domain.endereco.Endereco;

public record DadosDetalhamentoPessoa(
        Long id, String nome,
        Endereco endereco) {
            public DadosDetalhamentoPessoa(Pessoa pessoa) {
                this(pessoa.getId(), pessoa.getNome(), pessoa.getEndereco());
            }
        }
