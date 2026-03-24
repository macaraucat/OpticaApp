package com.springboot.optica.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.optica.model.Bodega;
import com.springboot.optica.repository.BodegaRepository;

@Service
public class BodegaService {
    @Autowired
    private BodegaRepository bodegaRepository;
    public List<Bodega> getAll() {
        return bodegaRepository.findAll();
    }

    public Bodega getById(int id) {
        return bodegaRepository.findById(id);
    }

    public Bodega post(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    public Bodega put(Bodega bodega) {
        return bodegaRepository.update(bodega);
    }
    
    public void delete(int id) {
        bodegaRepository.deleteById(id);
    }
}