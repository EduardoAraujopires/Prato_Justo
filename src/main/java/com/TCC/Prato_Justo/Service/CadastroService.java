package com.TCC.Prato_Justo.Service;

import com.TCC.Prato_Justo.Controller.AutchCadastroController;
import com.TCC.Prato_Justo.Interface.AnthCadastroRepository;
import com.TCC.Prato_Justo.Model.Cadastro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    private final AnthCadastroRepository autchCadastroRepository;

    public CadastroService(AnthCadastroRepository autchCadastroRepository) {
        this.autchCadastroRepository = autchCadastroRepository;
    }


    public Cadastro fazerCadastro(String username, String password, String email){
        return autchCadastroRepository.findByUsernameAndPasswordAndEmail(username, password, email).orElse(null);
    }

    public Cadastro cadastrarNovoUsusario(Cadastro cadastro){
        return autchCadastroRepository.save(cadastro);
    }
}
