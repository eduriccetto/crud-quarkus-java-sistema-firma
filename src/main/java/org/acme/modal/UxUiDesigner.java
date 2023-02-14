package org.acme.modal;

import javax.persistence.*;

@Entity // para que o JPA entenda que esta classe representa uma tabela no DB
@Table(name = "uxUiDesigner")
public class UxUiDesigner {

    @Id // vai dizer ao nosso DB que está é uma chave primária
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // para o DB gerar os IDs sozinho em ordem de sequência.
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private String descricao;

    // Getter and Setters =========================================================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
