package com.TCC.Prato_Justo.Controller;

import Model.Login;
import Service.Login_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Login")
public class LoginController {

    private final Login_Service loginService;

    public LoginController(Login_Service loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public List<Login> buscarLogin() {
        return loginService.buscarLogin();
    }

    @PostMapping
    public Login salvarLogin(@RequestBody Login login) {
        return loginService.salvarLogin(login);
    }

    @GetMapping("/{id}")
    public Login buscarLoginId(@PathVariable Long id) {
        return loginService.buscarLoginId(id);
    }

    @DeleteMapping("/{id]")
    public void deleteLoginId(@PathVariable Long id) {
        loginService.deletarLoginId(id);
    }
}
