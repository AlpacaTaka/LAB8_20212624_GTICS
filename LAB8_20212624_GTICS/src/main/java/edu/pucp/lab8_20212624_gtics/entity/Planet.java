package edu.pucp.lab8_20212624_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "planets")
public class Planet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private String tipo_planeta;

    @Column(nullable = false)
    private boolean habitable;

    @Column(nullable = false)
    private Double gravedad_relativa;

    @Lob
    private String descripcion;


}
