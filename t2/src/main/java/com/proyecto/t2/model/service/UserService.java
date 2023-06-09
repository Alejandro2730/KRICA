package com.proyecto.t2.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.t2.model.dao.IUsuarioDao;
import com.proyecto.t2.model.entidad.Rol;
import com.proyecto.t2.model.entidad.Usuario;

@Service("UserService")
public class UserService implements UserDetailsService{

    @Autowired
    private IUsuarioDao usuarioDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario=usuarioDAO.findByUsername(username);
        List<GrantedAuthority> listaRoles = new ArrayList<>();
        if(usuario==null){
            throw new UsernameNotFoundException("usuario/contraseña incorrecta");
        }else{
            for(Rol item:usuario.getRoles()){
                listaRoles.add(new SimpleGrantedAuthority(item.getAythority()));
            }
        }
        return new User(usuario.getUsername(), usuario.getPassword(), listaRoles);
    }
    
}
