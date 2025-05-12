package org.baquiax.crudexample.repositories;

import org.baquiax.crudexample.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public abstract Usuario findByEmail(String email);
}
