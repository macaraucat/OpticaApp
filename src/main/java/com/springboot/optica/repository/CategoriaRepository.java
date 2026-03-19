package com.springboot.optica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.optica.model.Categoria;

@Repository
public class CategoriaRepository {
    
    private List<Categoria> categorias = new ArrayList<>();
    
    public CategoriaRepository() {
        categorias.add(new Categoria(1, "Lentes Ópticos"));
        categorias.add(new Categoria(2, "Lentes de Sol"));
        categorias.add(new Categoria(3, "Lentes de Contacto"));
        categorias.add(new Categoria(4, "Productos de Limpieza"));
        categorias.add(new Categoria(5, "Accesorios"));
    }

    public List<Categoria> listarTodas(){
        return categorias;
    }

    public Categoria buscarPorId(int id){
        for(Categoria cat : categorias){
            return cat;
        }
        return null;
    }

    public Categoria crear(Categoria c){
        categorias.add(c);
        return c;
    }

    public Categoria actualizar(Categoria actualizada){
        for(int i = 0; i < categorias.size(); i++){
            if(categorias.get(i).getId() == actualizada.getId()){
                categorias.set(i, actualizada);
                return actualizada;
            }
        }
        return null;
    }

    public String eliminar(int id){
        categorias.removeIf(c -> c.getId() == id);
        return "Categoria eliminada";
    }
}
