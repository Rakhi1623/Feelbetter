package com.canddella.FeelBetter.repositary;

import com.canddella.FeelBetter.entity.MindfullnessMeditation;
import com.canddella.FeelBetter.entity.WalkingMeditation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalkingMeditationRepository extends JpaRepository<WalkingMeditation, Long> {
}
