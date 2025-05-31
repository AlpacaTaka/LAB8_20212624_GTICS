package edu.pucp.lab8_20212624_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "crew_members")
public class CrewMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre_completo;

    @Column(nullable = false)
    private String especialidad;

    private String rango;

    private LocalDate fecha_contratacion;


}
