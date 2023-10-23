package one.digitalinnovation.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer numeroChamada;
    private Double media;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroChamada() {
        return numeroChamada;
    }

    public void setNumeroChamada(Integer numeroChamada) {
        this.numeroChamada = numeroChamada;
    }

    public Double getNota() {
        return media;
    }

    public void setNota(Double nota) {
        this.media = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                ", nome='" + nome + '\'' +
                ", numeroChamada=" + numeroChamada +
                ", nota=" + media +
                '}';
    }
}
