package com.TCC.Prato_Justo.Controller;

import Model.Usuario;
import Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(originPatterns = "*")
public class AuthController {
    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarLogin(usuario);
    }

    @PostMapping("/login")
    public String login(Usuario usuario){
        Usuario user = usuarioService.fazerLogin(usuario.getUsername(), usuario.getPassword());
        if(user != null){
            return "Cadastro Realizado " + user.getUsername();
        }
        return "error user or password";
    }

}
