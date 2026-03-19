package com.springboot.optica.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.optica.model.Producto;
import com.springboot.optica.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService prodService;
    
    @GetMapping
    public List<Producto> listarProductos() {
        return prodService.getAll();
    }

    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable int id) {
        return prodService.getById(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto p) {
        return prodService.post(p);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable int id, @RequestBody Producto p) {
        return prodService.put(p);
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id){
        return prodService.delete(id);
    }

    @GetMapping("/total")
    public int totalProductos(){
        return prodService.totalProductos();
    }
}