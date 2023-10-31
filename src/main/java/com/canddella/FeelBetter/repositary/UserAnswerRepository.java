package com.canddella.FeelBetter.repositary;


import com.canddella.FeelBetter.entity.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
}
