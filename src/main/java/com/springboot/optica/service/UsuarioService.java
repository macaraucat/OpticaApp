package com.springboot.optica.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.optica.model.Usuario;
import com.springboot.optica.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepo;
    
    public List<Usuario> getAll(){
        return usuarioRepo.listarTodos();
    }

    public Usuario getById(int id){
        return usuarioRepo.buscarPorId(id);
    }

    public Usuario post(Usuario u){
        return usuarioRepo.crear(u);
    }

    public Usuario put(Usuario u){
        return usuarioRepo.actualizar(u);
    }

    public String delete(int id){
        usuarioRepo.eliminar(id);
        return "Usuario eliminado";
    }

    //Acción realizada por el servicio
    public int totalUsuarios() {
        return usuarioRepo.listarTodos().size();
    }

}