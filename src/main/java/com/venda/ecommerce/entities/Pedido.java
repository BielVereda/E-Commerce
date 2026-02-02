package com.venda.ecommerce.entities;

import com.venda.ecommerce.enums.StatusDoPedido;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate momento;
    private StatusDoPedido status;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

}