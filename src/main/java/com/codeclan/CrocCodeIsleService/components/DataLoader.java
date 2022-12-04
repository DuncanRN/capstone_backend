package com.codeclan.CrocCodeIsleService.components;

import com.codeclan.CrocCodeIsleService.models.Question;
import com.codeclan.CrocCodeIsleService.models.QuestionIsland;
import com.codeclan.CrocCodeIsleService.models.User;
import com.codeclan.CrocCodeIsleService.repositories.QuestionIslandRepository;
import com.codeclan.CrocCodeIsleService.repositories.QuestionRepository;
import com.codeclan.CrocCodeIsleService.repositories.UserRepository;
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

    @Autowired
    UserRepository userRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {


        QuestionIsland questionIsland1 = new QuestionIsland("Python","Question number one");
        questionIslandRepository.save(questionIsland1);

        // here we are putting question 2 in before question 1. This is for a test to see if we can keep them
        // always in the right order through the derived methods in QuestionController

        Question question1 = new Question(questionIsland1, 1, "normal",
                "Q1 How do you iterate in Python?", 2,
                "for x in range",
                "loop(x : range)",
                "doThisManyTimes(x in range)",
                "something else ()",
                1);
        questionRepository.save(question1);

        Question question2 = new Question(questionIsland1, 2, "normal",
                "Q2 How do we deliniate the body of a loop?", 5,
                "()",
                "{}",
                "[]",
                "indentation",
                4);
        questionRepository.save(question2);

        Question question3 = new Question(questionIsland1, 3, "normal",
                "Q3 Example text in a question?", 10,
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

        // USERS

        User user1 = new User("Duncan", 0);
        userRepository.save(user1);

        User user2 = new User("Louise", 1);
        userRepository.save(user2);

        User user3 = new User("Cammy", 2);
        userRepository.save(user3);

        User user4 = new User("Matt", 3);
        userRepository.save(user4);
        User user5 = new User("Lucy", 4);
        userRepository.save(user5);
        User user6 = new User("Colin", 5);
        userRepository.save(user6);
        User user7 = new User("Jen", 6);
        userRepository.save(user7);
        User user8 = new User("Aqib", 7);
        userRepository.save(user8);
        User user9 = new User("Randolph", 8);
        userRepository.save(user9);
        User user10 = new User("Steve", 9);
        userRepository.save(user10);
        User user11 = new User("Ally", 10);
        userRepository.save(user11);

    }
}
