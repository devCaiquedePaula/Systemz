package dev.kiq.systemz.domain;

import dev.kiq.systemz.domain.enums.StatusMatricula;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "matriculas")
@Getter
@Setter
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "data_matricula")
    private LocalDate dataMatricula;
    
    @Column(name = "dia_vencimento")
    private Integer diaVencimento;
    
    @Column(name = "data_encerramento")
    private LocalDate dataEncerramento;
    
    @Enumerated(EnumType.STRING)
    private StatusMatricula status = StatusMatricula.ATIVA;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    
    @PrePersist
    public void prePersist() {
        if (dataMatricula == null) {
            dataMatricula = LocalDate.now();
        }
    }
}
