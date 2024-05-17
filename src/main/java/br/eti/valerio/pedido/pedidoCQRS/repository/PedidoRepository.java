package br.eti.valerio.pedido.pedidoCQRS.repository;

import br.eti.valerio.pedido.pedidoCQRS.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}
