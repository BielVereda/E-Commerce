package com.venda.ecommerce.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String description;
    private String imgUrl;
    private Double preco;

    @ManyToMany
    @JoinTable(name = "produto_categoria",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))

    private Set<Categoria> categorias = new HashSet<>();

}