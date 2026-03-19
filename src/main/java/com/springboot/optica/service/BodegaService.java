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
        return bodegaRepository.listarTodas();
    }
    public Bodega getById(int id) {
        return bodegaRepository.buscarPorId(id);
    }
    public Bodega post(Bodega bodega) {
        return bodegaRepository.crear(bodega);
    }
    public Bodega put(Bodega bodega) {
        return bodegaRepository.actualizar(bodega);
    }
    public void delete(int id) {
        bodegaRepository.eliminar(id);
    }
}