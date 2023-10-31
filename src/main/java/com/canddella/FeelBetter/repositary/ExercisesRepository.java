package com.canddella.FeelBetter.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canddella.FeelBetter.entity.Exercises;
import com.canddella.FeelBetter.entity.Meditation;

public interface ExercisesRepository extends JpaRepository<Exercises, Long>{
	

}
