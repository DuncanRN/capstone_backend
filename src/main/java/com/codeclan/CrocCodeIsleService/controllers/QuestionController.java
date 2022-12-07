package com.codeclan.CrocCodeIsleService.controllers;

import com.codeclan.CrocCodeIsleService.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping(value = "/questions")
    public ResponseEntity getAllQuestions(){
        return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
    }



    @GetMapping(value = "/questions/{id}")
    public ResponseEntity getQuestionsOfThisIsland(@PathVariable long id){
        return new ResponseEntity<>(questionRepository.findQuestionByQuestionIslandId(id), HttpStatus.OK);
    }

    // The following mapping works. I wanted to copy it and comment it out before I make it return the questions in island order, question_order order
//    @GetMapping(value = "/questions/{id}")
//    public ResponseEntity getQuestionsOfThisIsland(@PathVariable long id){
//        return new ResponseEntity<>(questionRepository.findQuestionByQuestionIslandId(id), HttpStatus.OK);
//    }



//
}
