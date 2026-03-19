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
import com.springboot.optica.model.Categoria;
import com.springboot.optica.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService catService;

    @GetMapping
    public List<Categoria> listarCategorias() {
        return catService.getAll();
    }

    @GetMapping("/{id}")
    public Categoria buscarCategoria(@PathVariable int id) {
        return catService.getById(id);
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria c) {
        return catService.post(c);
    }

    @PutMapping("/{id}")
    public Categoria actualizarCategoria(@PathVariable int id, @RequestBody Categoria c) {
        return catService.put(c);
    }

    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return catService.delete(id);
    }

    @GetMapping("/total")
    public int totalCategorias(){
        return catService.totalCategorias();
    }
}