package com.codeclan.CrocCodeIsleService.controllers;

import com.codeclan.CrocCodeIsleService.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping(value = "/questions")
    public ResponseEntity getAllQuestions(){
        return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/questions/{id}")
    public ResponseEntity getQuestionOfId(@PathVariable int id){
        return new ResponseEntity<>(questionRepository.getByQuestionIslandEquals(id), HttpStatus.OK);
    }

}
