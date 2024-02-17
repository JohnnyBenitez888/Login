package com.todocode.ap.login.logica;

import com.todocode.ap.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia persis = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contra) {
        String mensaje = "Base de datos vacía";
        for (Usuario user : listarUsuarios()) {
            if (user.getNombreUsuario().equals(usuario)){
                if (user.getContrasenia().equals(contra)) {
                    mensaje = "Usuario y Contraseña correctos. Bienvenido/a " + user.getNombreUsuario();
                }else{
                    mensaje = "Contraseña Incorrecta";
                }
            } else {
                mensaje = "Usuario no encontrado";
            }
        }
        return mensaje;
    }

    public List<Usuario> listarUsuarios() {
        return persis.listarUsuarios();
    }

}
