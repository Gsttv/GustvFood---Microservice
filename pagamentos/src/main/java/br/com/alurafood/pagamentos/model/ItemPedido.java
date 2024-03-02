package br.com.alurafood.pagamentos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedido {

    private Long id;
    private String quantidade;
    private String descricao;

}
