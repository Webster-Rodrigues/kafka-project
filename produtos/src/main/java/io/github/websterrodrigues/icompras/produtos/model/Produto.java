package io.github.websterrodrigues.icompras.produtos.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "valor_unitario", nullable = false, length = 16, scale = 2)
    private BigDecimal valorUnitario;

    public Produto(){

    }

    public Produto(Long codigo, String nome, BigDecimal valorUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
