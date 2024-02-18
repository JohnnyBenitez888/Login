package com.todocode.ap.login.persistencia;

import com.todocode.ap.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {

    UsuarioJpaController userJpa = new UsuarioJpaController();

    public List<Usuario> listarUsuarios() {
        return userJpa.findUsuarioEntities();
    }

}
