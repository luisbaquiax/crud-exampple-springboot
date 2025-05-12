package org.baquiax.crudexample.services;

import org.baquiax.crudexample.models.Usuario;
import org.baquiax.crudexample.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> findAll() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }
    public Usuario saveUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findById(Long id) {
        return  usuarioRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
