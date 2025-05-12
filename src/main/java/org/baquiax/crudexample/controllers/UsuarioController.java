package org.baquiax.crudexample.controllers;

import org.baquiax.crudexample.models.Usuario;
import org.baquiax.crudexample.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ArrayList<Usuario> getUsuarios() {
        return usuarioService.findAll();
    }
    @PostMapping
    public Usuario saverUser(@RequestBody Usuario usuario) {
        return usuarioService.saveUser(usuario);
    }
    @GetMapping(path = "/{id}")
    public Optional<Usuario> getUser(@PathVariable("id") Long id) {
        return usuarioService.findById(id);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        if(usuarioService.deleteById(id)){
            return "Usuario elimando con id: " + id;
        }else {
            return "No se pudo eliminar el usuario con id: " + id;
        }
    }
}
