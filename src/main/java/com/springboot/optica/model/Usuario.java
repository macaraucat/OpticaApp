package com.springboot.optica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
    private int id;
    private String rut;
    private String nombreCompleto;
    private String telefono;
    private String direccion;
    private String email;
    private String password;
    private String rol; //cliente, vendedor, administrador

}