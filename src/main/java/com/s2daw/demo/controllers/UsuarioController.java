package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuarios")
    public List <Usuario> getUsuarios(){
       return usuarioDao.getUsuario();
    }
    @RequestMapping (value = "api/usuarios/{id}", method = RequestMethod.GET)
    private Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alex");
        usuario.setApellidos("Serrano");
        usuario.setEmail("alejandroserranoinfo@gmail.com");
        usuario.setPassword("1234");
        usuario.setTelefono("666666666");
        return usuario;
    }


    @RequestMapping (value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long Id){
    usuarioDao.eliminar(Id);
    }
    @RequestMapping(value = "usuario312")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alex");
        usuario.setApellidos("Serrano");
        usuario.setEmail("alejandroserranoinfo@gmail.com");
        usuario.setPassword("1234");
        usuario.setTelefono("666666666");
        return usuario;
    }
    @RequestMapping(value = "usuario123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alex");
        usuario.setApellidos("Serrano");
        usuario.setEmail("alejandroserranoinfo@gmail.com");
        usuario.setPassword("1234");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @Override
    public List<Usuario> getUsuario() {
        return null;
    }
}
