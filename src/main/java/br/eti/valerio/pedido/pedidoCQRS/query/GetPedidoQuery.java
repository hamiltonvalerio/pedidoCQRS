package br.eti.valerio.pedido.pedidoCQRS.query;

public class GetPedidoQuery {

    private Long pedidoId;

    public GetPedidoQuery(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

}
