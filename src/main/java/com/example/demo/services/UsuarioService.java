package com.example.demo.services;
import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuario() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerPorEdad(Integer edad) {
        return usuarioRepository.findByEdad(edad);
    }

    public boolean eliminarUsuario(Long id) {
    try {
        usuarioRepository.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }
    }
    
}