package dev.kiq.systemz.domain;

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

import java.time.LocalDateTime;

@Entity
@Table(name = "assiduidade")
@Getter
@Setter
public class Assiduidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "data_entrada")
    private LocalDateTime dataEntrada;
    
    @Column(name = "data_saida")
    private LocalDateTime dataSaida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula_id")
    private Matricula matricula;
    
    @PrePersist
    public void prePersist() {
        if (dataEntrada == null) {
            dataEntrada = LocalDateTime.now();
        }
    }
}
