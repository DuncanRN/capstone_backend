package com.codeclan.CrocCodeIsleService.repositories;

import com.codeclan.CrocCodeIsleService.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long>{


    List<Question> findQuestionByQuestionIslandId(long id);




//    List<Qu
//this workedestion> findQuestionByQuestionIslandId(long id);

//    List<Question> getByQuestionIsland(long islandId);
}