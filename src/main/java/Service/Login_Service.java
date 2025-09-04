package Service;

import Model.Login;
import com.TCC.Prato_Justo.Interface.Login_Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class Login_Service {

    private final Login_Repository loginRepository;

    public Login_Service(Login_Repository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Login> buscarLogin(){
        return loginRepository.findAll();
    }

    public Login salvarLogin(Login login){
        return loginRepository.save(login);
    }

    public Login buscarLoginId(Long id){
        return loginRepository.findById(id).orElse(null);
    }

    public void deletarLoginId(Long id){
        loginRepository.deleteById(id);
    }

}
