package br.com.jmcs.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Modificadores
 * public
 * private
 * protected
 */

 @RestController
 @RequestMapping("/users")
public class UserController {

@Autowired
private IUserRepository userRepository;

/*
 * String (texto)
 * Integer(int) numero inteiro
 * Double numerios 0.00
 * Float numeros flutuantes 0.000
 * char ( A E F) um caractere
 * Date para data
 * void quando nao retorna valores [e quando uma logica seja execultada]
 */

 @PostMapping("/user")
    public UserModel create(@RequestBody UserModel usermodel){
       var userCreated = this.userRepository.save(usermodel);
       return userCreated;
    }

}
