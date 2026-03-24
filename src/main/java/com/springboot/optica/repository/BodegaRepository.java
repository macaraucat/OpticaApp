package com.springboot.optica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.optica.model.Bodega;

@Repository
public class BodegaRepository {
    private List<Bodega> bodegas = new ArrayList<>();
    public BodegaRepository() {
        // Datos de ejemplo
        bodegas.add(new Bodega(1, "Bodega Central", "Av. Industrial 500, Maipú, Santiago"));
        bodegas.add(new Bodega(2, "Tienda Viña del Mar", "Av. Libertad 850, Viña del Mar"));
        bodegas.add(new Bodega(3, "Punto de Venta Valparaíso", "Calle Esmeralda 1020, Valparaíso"));
    }
    public List<Bodega> findAll() {
        return bodegas;
    }

    public Bodega findById(int id) {
        return bodegas.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    public Bodega save(Bodega bodega) {
        bodegas.add(bodega);
        return bodega;
    }
    
    public Bodega update(Bodega bodegaActualizada) {
        for (int i = 0; i < bodegas.size(); i++) {
            if (bodegas.get(i).getId() == bodegaActualizada.getId()) {
                bodegas.set(i, bodegaActualizada);
                return bodegaActualizada;
            }
        }
        return null;
    }
    
    public void deleteById(int id) {
        bodegas.removeIf(b -> b.getId() == id);
    }
}