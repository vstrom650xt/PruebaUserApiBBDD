package es.lavereda.pruebauser.controller;

import es.lavereda.pruebauser.model.User;
import es.lavereda.pruebauser.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/user/{id}")
    public User byId(@PathVariable("id") int id) {
        return userService.find(id).orElseThrow();
    }

    @PostMapping("/api/user/")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/api/user/")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @PatchMapping("/api/user/")
    public User change(@RequestBody User user) {
        return userService.change(user);
    }

    @DeleteMapping("/api/user/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return userService.remove(id);
    }
}
