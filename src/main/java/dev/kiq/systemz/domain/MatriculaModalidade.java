package dev.kiq.systemz.domain;

import ch.qos.logback.core.joran.conditional.IfAction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "matriculas_modalidades")
@Getter
@Setter
public class MatriculaModalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "data_inicio")
    private LocalDate dataInicio;
    
    @Column(name = "data_fim")
    private LocalDate dataFim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula_id")
    private Matricula matricula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modalidade_id")
    private Modalidade modalidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "graduacao_id")
    private Graduacao graduacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plano_id")
    private Plano plano;
    
    @PrePersist
    public void prePersist() {
        if (dataInicio == null) {
            dataInicio = LocalDate.now();
        }
    }
}
