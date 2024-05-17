package br.eti.valerio.pedido.pedidoCQRS.command;

import br.eti.valerio.pedido.pedidoCQRS.entity.Pedido;
import br.eti.valerio.pedido.pedidoCQRS.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoCommandService {

        private final PedidoRepository pedidoRepository;

        public PedidoCommandService(PedidoRepository pedidoRepository) {
            this.pedidoRepository = pedidoRepository;
        }

        public Pedido handle(CriaPedidoCommand command) {
            Pedido pedido = new Pedido(command.getProduto(), command.getQuantidade());
            return pedidoRepository.save(pedido);
        }

}
