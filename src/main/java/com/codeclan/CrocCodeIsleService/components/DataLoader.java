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
                "Output the string:",
                "\n _____('Hello')", 10,
                "print",
                "console",
                "system.out",
                "output",
                1);
        questionRepository.save(question1);

        Question question2 = new Question(questionIsland1, 2, "fill_blank",
                "Declare the variable:",
                "\n colin _ 'crocodile'", 20,
                "is a",
                "-",
                "=",
                ":",
                3);
        questionRepository.save(question2);

        Question question3 = new Question(questionIsland1, 3, "text_input",
                "Output variable value:",
                "\n palm = 'tree' \n print (____) ", 30,
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
                "Select data type of value:",
                "\n 1.5", 40,
                "integer",
                "string",
                "thing",
                "float",
                4);
        questionRepository.save(question4);

        Question question5 = new Question(questionIsland2, 2, "fill_blank",
                "Concatenate the strings:",
                "\n 'coco' ___ 'nut'", 50,
                "*",
                "+",
                "and",
                "-",
                2);
        questionRepository.save(question5);

        Question question6 = new Question(questionIsland2, 3, "text_input",
                "Enter the result:",
                "\n print((5 % 3) * 3)", 60,
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
                "Select output:",
                "\n coconuts = 3 \n if coconuts < 5: \n \t print (coconuts) ", 70,
                "3",
                "5",
                "coconuts",
                "error",
                1);
        questionRepository.save(question7);

        Question question8 = new Question(questionIsland3, 2, "fill_blank",
                "Choose correct keyword:",
                "\n if animal == 'crocodile': \n \t print ('in a while') \n ___ animal == 'alligator': \n \t print('see you later') \n else: \n \t print('Shark! Swim away!')",
                80,
                "if",
                "elif",
                "or",
                "otherwise",
                2);
        questionRepository.save(question8);

        Question question9 = new Question(questionIsland3, 3, "text_input",
                "Enter correct output:",
                "\n fruit = 'pineapple' \n if fruit == 'coconut': print('coconutty') else: print ('yum')",
                90,
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

        QuestionIsland questionIsland4 = new QuestionIsland("Javascript","JS Island 1");
        questionIslandRepository.save(questionIsland4);

        Question question10 = new Question(questionIsland4, 1, "normal",
                "First question of 1st javascript island?", "code example", 10,
                "aaaaaa",
                "bbbbbbb",
                "cccccccc",
                "dddddddd",
                1);
        questionRepository.save(question10);

        Question question11 = new Question(questionIsland4, 2, "normal",
                "2nd question of 1st Javascipt island?", "code example", 20,
                "eee",
                "fff",
                "gg",
                "hh",
                1);
        questionRepository.save(question11);

        Question question12 = new Question(questionIsland4, 3, "normal",
                "3rd question of 1st Javascipt island?", "code example", 30,
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