package com.springboot.optica.repository;

import com.springboot.optica.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepository(){
        usuarios.add(new Usuario(1, "11.111.111-1", "Carla Rojas", "987654321", "Av. Siempre Viva 123, Santiago", "carla.rojas@opticavision.cl", "adminPass123", "administrador"));
        usuarios.add(new Usuario(2, "12.222.222-2", "Miguel Campos", "912345678", "Calle Falsa 456, Viña del Mar", "miguel.campos@opticavision.cl", "vendedorPass456", "vendedor"));
        usuarios.add(new Usuario(3, "13.333.333-3", "Ana Torres", "955556666", "Pasaje Los Aromos 789, Valparaíso", "ana.torres@email.com", "clientePass789", "cliente"));
        usuarios.add(new Usuario(4, "14.444.444-4", "Luis González", "944443333", "Av. Libertad 1010, Depto 5B, Viña del Mar", "luis.gonzalez@email.com", "clientePass012", "cliente"));
        usuarios.add(new Usuario(5, "15.555.555-5", "Sofía Castro", "922221111", "Errázuriz 500, Valparaíso", "sofia.castro@opticavision.cl", "vendedorPass345", "vendedor"));
    }
    
    public List<Usuario> listarTodos(){
        return usuarios;
    }

    public Usuario buscarPorId(int id){
        for(Usuario u : usuarios){
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }

    public Usuario crear(Usuario u){
        usuarios.add(u);
        return u;
    }

    public Usuario actualizar(Usuario u){
        int id = 0;
        int idPos = 0;

        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getId() == u.getId()){
                id = u.getId();
                idPos = i;
            }
        }

        Usuario u1 = new Usuario();
        u1.setId(id);
        u1.setRut(u.getRut());
        u1.setNombreCompleto(u.getNombreCompleto());
        u1.setTelefono(u.getTelefono());
        u1.setDireccion(u.getDireccion());
        u1.setEmail(u.getEmail());
        u1.setPassword(u.getPassword());
        u1.setRol(u.getRol());

        usuarios.set(idPos, u1);
        return u1;
    }

    public void eliminar(int id){
        usuarios.removeIf(u -> u.getId() == id);
    }


}