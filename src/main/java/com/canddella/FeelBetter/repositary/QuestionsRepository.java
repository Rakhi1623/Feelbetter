package com.canddella.FeelBetter.repositary;



import com.canddella.FeelBetter.entity.Answers;
import com.canddella.FeelBetter.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionsRepository extends JpaRepository<Question, Long> {
    Question findByQuestions(String question);
   
}
