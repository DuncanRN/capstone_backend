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


        QuestionIsland questionIsland1 = new QuestionIsland("Python","Outputs and Variables");
        questionIslandRepository.save(questionIsland1);


        Question question1 = new Question(questionIsland1, 1, "multiple_choice",
                "Output the string: _____('Hello')", 2,
                "print",
                "console",
                "system.out",
                "output",
                1);
        questionRepository.save(question1);

        Question question2 = new Question(questionIsland1, 2, "fill_blank",
                "Declare the variable: colin _ 'crocodile'", 5,
                "is a",
                "-",
                "=",
                ":",
                3);
        questionRepository.save(question2);

        Question question3 = new Question(questionIsland1, 3, "text_input",
                "Output variable value: palm = 'tree' print (____) ", 10,
                "palm",
                "",
                "",
                "",
                1);
        questionRepository.save(question3);

        // now for island 2

        QuestionIsland questionIsland2 = new QuestionIsland("Python","Data Types");
        questionIslandRepository.save(questionIsland2);

        Question question4 = new Question(questionIsland2, 1, "multiple_choice",
                "Select data type of value: 1.5", 10,
                "integer",
                "string",
                "thing",
                "float",
                4);
        questionRepository.save(question4);

        Question question5 = new Question(questionIsland2, 2, "fill_blank",
                "Concatenate the strings: 'coco' ___ 'nut'", 10,
                "*",
                "+",
                "and",
                "-",
                2);
        questionRepository.save(question5);

        Question question6 = new Question(questionIsland2, 3, "text_input",
                "Enter the result: print((5 % 3) * 3)", 10,
                "6",
                "",
                "",
                "",
                1);
        questionRepository.save(question6);




        // now for island 3

        QuestionIsland questionIsland3 = new QuestionIsland("Python","Conditional Logic");
        questionIslandRepository.save(questionIsland3);

        Question question7 = new Question(questionIsland3, 1, "multiple_choice",
                "Select output: coconuts = 3 if coconuts < 5: print (coconuts) ", 10,
                "3",
                "5",
                "coconuts",
                "error",
                1);
        questionRepository.save(question7);

        Question question8 = new Question(questionIsland3, 2, "fill_blank",
                "Choose correct keyword: if animal == 'crocodile': print ('in a while') ___ animal == 'alligator': print('see you later') else: print('Shark! Swim away!')", 10,
                "if",
                "elif",
                "or",
                "otherwise",
                2);
        questionRepository.save(question8);

        Question question9 = new Question(questionIsland3, 3, "text_input",
                "Enter correct output: fruit = 'pineapple' if fruit == 'coconut': print('coconutty') else: print ('yum')", 10,
                "yum",
                "",
                "",
                "",
                1);
        questionRepository.save(question9);







        // ______
        // Java time!
        //_____


        // now for island 3

        QuestionIsland questionIsland4 = new QuestionIsland("Java","Island 1");
        questionIslandRepository.save(questionIsland4);

        Question question10 = new Question(questionIsland4, 1, "normal",
                "First question of 4rd island?", 10,
                "aaaaaa",
                "bbbbbbb",
                "cccccccc",
                "dddddddd",
                1);
        questionRepository.save(question10);

        Question question11 = new Question(questionIsland4, 2, "normal",
                "2nd question of 4rd island?", 10,
                "eee",
                "fff",
                "gg",
                "hh",
                1);
        questionRepository.save(question11);

        Question question12 = new Question(questionIsland4, 3, "normal",
                "3rd question of 4rd island?", 10,
                "iii",
                "jjj",
                "kkk",
                "lll",
                1);
        questionRepository.save(question12);

        



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
