package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dto.UserDTO;
import service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> listarUsers() {
        return userService.listarUsers();
    }

    @PostMapping
    public void salvarUser(@RequestBody UserDTO userDto) {
        userService.salvarUser(userDto);
    }

    @DeleteMapping
    public void deletarUser(@RequestParam Long id) {
        userService.deletarUser(id);
    }

    @PutMapping
    public void atualizarUser(@RequestParam Long id, @RequestBody UserDTO userDto) {
        userService.atualizarUser(id, userDto);
    }
}