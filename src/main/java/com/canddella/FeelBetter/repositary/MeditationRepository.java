package com.canddella.FeelBetter.repositary;

import com.canddella.FeelBetter.entity.Meditation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeditationRepository extends JpaRepository<Meditation, Long> {

}

