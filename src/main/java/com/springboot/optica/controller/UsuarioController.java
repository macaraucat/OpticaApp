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
import com.springboot.optica.model.Usuario;
import com.springboot.optica.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return  usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable int id){
        return usuarioService.getById(id);
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario u) {
        return usuarioService.post(u);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable int id, @RequestBody Usuario u) {
        return usuarioService.put(u);
    }

    @DeleteMapping("/{id}")
    public String eliminarUsuario(@PathVariable int id){
        return usuarioService.delete(id);
    }

    @GetMapping("/total")
    public int totalUsuarios(){
        return usuarioService.totalUsuarios();
    }
}