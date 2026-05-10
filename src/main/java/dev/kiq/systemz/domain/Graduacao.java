package dev.kiq.systemz.domain;

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

@Entity
@Table(name = "graduacoes")
@Getter
@Setter
public class Graduacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modalidade_id")
    private Modalidade modalidade;
}
