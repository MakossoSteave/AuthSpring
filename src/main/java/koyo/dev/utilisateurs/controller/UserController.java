package koyo.dev.utilisateurs.controller;

import koyo.dev.utilisateurs.entite.User;
import koyo.dev.utilisateurs.repository.UserRepository;
import koyo.dev.utilisateurs.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @RequestMapping("inscription")
    public  @ResponseBody User Create(@RequestBody User user){
        this.userService.create(user);
        return user;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @RequestMapping("user")
    public @ResponseBody List<User> getUser(){
        List data = (List) this.userService.getUser();
        System.out.println(data);
        return data;
    }


}
