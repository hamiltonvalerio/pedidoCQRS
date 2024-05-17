package br.eti.valerio.pedido.pedidoCQRS.command;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class CriaPedidoCommand {
    @NotEmpty
    private String produto;
    @Min(1)
    private Integer quantidade;

    public CriaPedidoCommand() {
    }

    public CriaPedidoCommand(String produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
