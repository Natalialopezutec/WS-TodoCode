/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersis;

/**
 *
 * @author natil
 */
public class Controladora {
    ControladoraPersis controlPersis = new ControladoraPersis();
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rol){
        Usuario usu = new Usuario();
        usu.setContrasenia(contrasenia);
        usu.setNombre_usuario(nombreUsuario);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
        
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
  }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        boolean ingreso = false;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        for (Usuario usu : listaUsuarios){
            if (usu.getNombre_usuario().equals(usuario)){
                if (usu.getContrasenia().equals(contrasenia)){
                    ingreso = true;
                }
            }
        }
      return ingreso;
    }
}
