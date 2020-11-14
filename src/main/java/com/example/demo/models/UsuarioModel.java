package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;

    private String apellido;
    
    private Integer edad;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId(Long id) {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido(String apellido) {
        return apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad(Integer edad) {
        return edad;
    }
}