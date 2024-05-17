package br.eti.valerio.pedido.pedidoCQRS.query;

import br.eti.valerio.pedido.pedidoCQRS.entity.Pedido;
import br.eti.valerio.pedido.pedidoCQRS.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoQueryService {

    private final PedidoRepository pedidoRepository;

    public PedidoQueryService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido handle(GetPedidoQuery query) {
        return pedidoRepository.findById(query.getPedidoId()).orElse(null);
    }
}
