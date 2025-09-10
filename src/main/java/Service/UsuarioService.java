package Service;

import Model.Usuario;
import com.TCC.Prato_Justo.Interface.AnthUsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final AnthUsuarioRepository anthUsuarioRepository;

    public UsuarioService(AnthUsuarioRepository anthUsuarioRepository) {
        this.anthUsuarioRepository = anthUsuarioRepository;
    }


    public Usuario fazerLogin(String username, String password){
        return anthUsuarioRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

    public Usuario cadastrarLogin(Usuario usuario){
        return anthUsuarioRepository.save(usuario);
    }

}
