package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {
    @RequestMapping(value = "usuarios")
    public List <Usuario> getUsuarios(){
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Alex");
        usuario.setApellidos("Serrano");
        usuario.setEmail("alejandroserranoinfo@gmail.com");
        usuario.setPassword("1234");
        usuario.setTelefono("666666666");

        Usuario usuario2 = new Usuario();
        usuario2.setId(345L);
        usuario2.setNombre("Alex");
        usuario2.setApellidos("Orgaz");
        usuario2.setEmail("nombre2@gmail.com");
        usuario2.setPassword("1234");
        usuario2.setTelefono("666555444");

        Usuario usuario3 = new Usuario();
        usuario3.setId(356L);
        usuario3.setNombre("Alex");
        usuario3.setApellidos("Diaz");
        usuario3.setEmail("piba@gmail.com");
        usuario3.setPassword("1234");
        usuario3.setTelefono("666777888");


        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
    @RequestMapping(value = "usuario567")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alex");
        usuario.setApellidos("Serrano");
        usuario.setEmail("alejandroserranoinfo@gmail.com");
        usuario.setPassword("1234");
        usuario.setTelefono("666666666");
        return usuario;
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
