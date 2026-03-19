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
import com.springboot.optica.model.Bodega;
import com.springboot.optica.service.BodegaService;

@RestController
@RequestMapping("/api/bodegas")
public class BodegaController {

    @Autowired
    private BodegaService bodService;

    @GetMapping
    public List<Bodega> listarBodegas() {
        return bodService.getAll();
    }

    @GetMapping("/{id}")
    public Bodega buscarBodega(@PathVariable int id) {
        return bodService.getById(id);
    }

    @PostMapping
    public Bodega crearBodega(@RequestBody Bodega b) {
        return bodService.post(b);
    }

    @PutMapping("/{id}")
    public Bodega actualizarBodega(@PathVariable int id, @RequestBody Bodega b) {
        return bodService.put(b);
    }

    @DeleteMapping("/{id}")
    public String eliminarBodega(@PathVariable int id){
        bodService.delete(id);
        return "Bodega eliminada";
    }
}