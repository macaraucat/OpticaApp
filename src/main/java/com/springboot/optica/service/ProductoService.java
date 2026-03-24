package com.springboot.optica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optica.model.Producto;
import com.springboot.optica.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository prodRepo;

    public List<Producto> getAll(){
        return prodRepo.findAll();
    }

    public Producto getById(int id){
        return prodRepo.findById(id);
    }

    public Producto post(Producto p){
        return prodRepo.save(p);
    }

    public Producto put(Producto p){
        return prodRepo.update(p);
    }

    public String delete(int id){
        return prodRepo.deleteById(id);
    }

    //Acción realizada por el servicio
    public int totalProductos() {
        return prodRepo.findAll().size();
    }
}
