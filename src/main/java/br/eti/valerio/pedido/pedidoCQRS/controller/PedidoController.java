package br.eti.valerio.pedido.pedidoCQRS.controller;

import br.eti.valerio.pedido.pedidoCQRS.command.CriaPedidoCommand;
import br.eti.valerio.pedido.pedidoCQRS.command.PedidoCommandService;
import br.eti.valerio.pedido.pedidoCQRS.entity.Pedido;
import br.eti.valerio.pedido.pedidoCQRS.query.GetPedidoQuery;
import br.eti.valerio.pedido.pedidoCQRS.query.PedidoQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
@Tag(name = "Pedido", description = "API para manipulação de pedidos")
public class PedidoController {

    private final PedidoCommandService pedidoCommandService;
    private final PedidoQueryService pedidoQueryService;

    public PedidoController(PedidoCommandService pedidoCommandService, PedidoQueryService pedidoQueryService) {
        this.pedidoCommandService = pedidoCommandService;
        this.pedidoQueryService = pedidoQueryService;
    }

    @PostMapping
    @Operation(summary = "Criar novo pedido", description = "Criar um novo pedido com produto e quantidade")
    public ResponseEntity<Pedido> create(@Validated @RequestBody CriaPedidoCommand command) {
        Pedido pedido = pedidoCommandService.handle(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

    @GetMapping("/buscar/{pedidoId}")
    @Operation(summary = "Buscar pedido", description = "Buscar um pedido pelo ID")
    public ResponseEntity<Pedido> get(@PathVariable Long pedidoId) {
        GetPedidoQuery query = new GetPedidoQuery(pedidoId);
        Pedido pedido = pedidoQueryService.handle(query);
        return ResponseEntity.ok(pedido);
    }
}
