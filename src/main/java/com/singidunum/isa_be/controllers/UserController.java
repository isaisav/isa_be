package com.singidunum.isa_be.controllers;

import com.singidunum.isa_be.entities.User;
import com.singidunum.isa_be.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    @PostMapping("add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);

        return "success";
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getUsers();
    }

    @GetMapping("/get")
    public User getUserById(@RequestParam Integer id) {
        return userService.getUser(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(id, user);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);

        return ResponseEntity.ok().build();
    }
}
