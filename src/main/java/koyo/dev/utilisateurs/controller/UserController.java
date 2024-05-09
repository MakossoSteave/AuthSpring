package koyo.dev.utilisateurs.controller;

import koyo.dev.utilisateurs.entite.User;
import koyo.dev.utilisateurs.repository.UserRepository;
import koyo.dev.utilisateurs.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @RequestMapping("inscription")
    public  void Create(@RequestBody User user){
        this.userService.create(user);
    }
}
