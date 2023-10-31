package com.canddella.FeelBetter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="questionnaire")
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="questionaries_id")
    private Long id;

    @Column(name="questions")
    private String questions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	

	
}
