package com.springboot.optica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bodega {
    private int id;
    private String nombre;
    private String direccion;
}