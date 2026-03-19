package com.springboot.optica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.optica.model.Categoria;
import com.springboot.optica.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository catRepo;

    public List<Categoria> getAll(){
        return catRepo.listarTodas();
    }

    public Categoria getById(int id){
        return catRepo.buscarPorId(id);
    }

    public Categoria post(Categoria c){
        return catRepo.crear(c);
    }

    public Categoria put(Categoria c){
        return catRepo.actualizar(c);
    }

    public String delete(int id){
        return catRepo.eliminar(id);
    }

    //Acción realizada por el servicio
    public int totalCategorias() {
        return catRepo.listarTodas().size();
    }
}
