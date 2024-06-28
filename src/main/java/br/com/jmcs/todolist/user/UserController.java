package br.com.jmcs.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity create(@RequestBody UserModel usermodel){
      var user = this.userRepository.findByUsername(usermodel.getUsername());

      if(user != null){
        
         //Mensagem de erro 
         //Status code
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario já existe");
      }
      
       var userCreated = this.userRepository.save(usermodel);
       return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
