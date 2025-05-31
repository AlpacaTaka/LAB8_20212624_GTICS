package edu.pucp.lab8_20212624_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "expeditions")
@Getter
@Setter
public class Expedition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre_mision;

    @Column(nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "planeta_destino_id", nullable = false)
    private Planet planeta_destino;

    @Column(nullable = false)
    private LocalDate fecha_lanzamiento;

    @Column(nullable = false)
    private String estado;

    @ManyToMany
    @JoinTable(
        name = "expedition_crew",
        joinColumns = @JoinColumn(name = "expedition_id"),
        inverseJoinColumns = @JoinColumn(name = "crew_member_id")
    )
    private Set<CrewMember> tripulacion;

    @Lob
    private String objetivos;

    @Lob
    private String resultados;

}
