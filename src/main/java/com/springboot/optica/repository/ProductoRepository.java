package com.springboot.optica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.optica.model.Categoria;
import com.springboot.optica.model.Producto;

@Repository
public class ProductoRepository {

    private List<Producto> productos = new ArrayList<>();

    public ProductoRepository(){
        Categoria lentesOpticos = new Categoria(1, "Lentes Ópticos");
        Categoria lentesDeSol = new Categoria(2, "Lentes de Sol");

        productos.add(new Producto(101, "VL1234", "Lentes1", "Montura metálica ligera", "Crystal", 80000.00, lentesOpticos));
        productos.add(new Producto(201, "RB2140", "Gafas1", "Montura clásica negra, cristal verde", "Ray-Ban", 150000.0, lentesDeSol));
        productos.add(new Producto(202, "OO9102", "Gafas2", "Montura mate, cristal Prizm", "Oakley", 180000.0, lentesDeSol));
    }

    public List<Producto> listarTodos() {
        return productos;
    }
    public Producto buscarPorId(int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    public Producto crear(Producto p) {
        productos.add(p);
        return p;
    }
    
    public Producto actualizar(Producto actualizado) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == actualizado.getId()) {
                productos.set(i, actualizado);
                return actualizado;
            }
        }
        return null;
    }
    public String eliminar(int id) {
        productos.removeIf(p -> p.getId() == id);
        return "Producto eliminado";
    }
}