package br.com.macrolego.catalogo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Entity
@Table(name = "maquinas")

public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "A categoria é obrigatória")
    @Column(nullable = false)
    private String categoria;

    private String fabricante;

    private Integer anoFabricacao;

    @PositiveOrZero(message = "O preço da diária não pode ser negativo")
    @Column(precision = 10, scale = 2)
    private BigDecimal precoDiaria;

    @Column(length = 500)
    private String descricao;

    public Maquina() {
    }
}
