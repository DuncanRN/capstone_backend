package com.codeclan.CrocCodeIsleService.controllers;

import com.codeclan.CrocCodeIsleService.models.User;
import com.codeclan.CrocCodeIsleService.repositories.QuestionRepository;
import com.codeclan.CrocCodeIsleService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/top10")
    public ResponseEntity getTopTenUsers(){
        return new ResponseEntity<>(userRepository.findTop10ByOrderByPointsDesc(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/top5")
    public ResponseEntity getTopFiveUsers(){
        return new ResponseEntity<>(userRepository.findTop5ByOrderByPointsDesc(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUserOfThisId(@PathVariable long id){
        return new ResponseEntity<>(userRepository.findUserById(id), HttpStatus.OK);
    }


    // the followingn Patch / Update is untested
    @PatchMapping(value = "users/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping(value="/users")
    public ResponseEntity<User> postUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

//    @PatchMapping(value = "/pirates/{id}")
//    public ResponseEntity<Pirate> updatePirate(@RequestBody Pirate pirate){
//        pirateRepository.save(pirate);
//        return new ResponseEntity<>(pirate, HttpStatus.OK);
//    }




}
