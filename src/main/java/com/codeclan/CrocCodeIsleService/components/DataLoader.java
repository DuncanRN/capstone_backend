package com.codeclan.CrocCodeIsleService.components;

import com.codeclan.CrocCodeIsleService.models.Question;
import com.codeclan.CrocCodeIsleService.models.QuestionIsland;
import com.codeclan.CrocCodeIsleService.repositories.QuestionIslandRepository;
import com.codeclan.CrocCodeIsleService.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    QuestionIslandRepository questionIslandRepository;
//
//    @Autowired
//    UserRepository userRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {


        QuestionIsland questionIsland1 = new QuestionIsland("Python","Question number one");
        questionIslandRepository.save(questionIsland1);

        Question question1 = new Question(questionIsland1, 1, "normal",
                "How do you iterate in Python?", 2,
                "for x in range",
                "loop(x : range)",
                "doThisManyTimes(x in range)",
                "something else ()",
                1);
        questionRepository.save(question1);

        Question question2 = new Question(questionIsland1, 2, "normal",
                "How do we deliniate the body of a loop?", 5,
                "()",
                "{}",
                "[]",
                "indentation",
                4);
        questionRepository.save(question2);


        Question question3 = new Question(questionIsland1, 3, "normal",
                "Example text in a question?", 10,
                "answer one",
                "maybe this is right",
                "but this is throwing me off",
                "oh no",
                1);
        questionRepository.save(question3);

        // now for island 2

        QuestionIsland questionIsland2 = new QuestionIsland("Python","Question number two");
        questionIslandRepository.save(questionIsland2);

        Question question4 = new Question(questionIsland2, 1, "normal",
                "First question of second island?", 10,
                "aaaaaa",
                "bbbbbbb",
                "cccccccc",
                "dddddddd",
                1);
        questionRepository.save(question4);





    }
}
