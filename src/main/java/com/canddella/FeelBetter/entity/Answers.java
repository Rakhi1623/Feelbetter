package com.canddella.FeelBetter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="answer")
public class Answers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="answer_id")
    private Long id;

    @Column(name="answer")
    private String answer;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}



}
