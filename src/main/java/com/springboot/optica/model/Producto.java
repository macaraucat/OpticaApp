package com.springboot.optica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    private int id;
    private String sku;
    private String nombre;
    private String descripcion;
    private String marca;
    private Double precioBase;
    private Categoria categoria;     
}