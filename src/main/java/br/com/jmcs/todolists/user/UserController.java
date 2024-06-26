package br.com.jmcs.todolists.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    /*
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (numeros 0.00)
     * Float (numeros .00000)
     * char (A B C )
     * Date (data)
     * void
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }
}
