package com.canddella.FeelBetter.repositary;

import com.canddella.FeelBetter.entity.Answers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answers, Long> {
    Answers findByAnswer(String answer);
    Answers getById(long answer);
}
