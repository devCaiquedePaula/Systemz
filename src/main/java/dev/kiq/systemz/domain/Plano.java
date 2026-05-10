package dev.kiq.systemz.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "planos")
@Getter
@Setter
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private Boolean ativo = true;
    
    @Column(name = "valor_mensal")
    private BigDecimal valorMensal;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modalidade_id")
    private Modalidade modalidade;
}
