package com.canddella.FeelBetter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="useranswer")
public class UserAnswer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ua_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name ="questionnaires_id")
    private Question question;

    @OneToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name ="answer_id")
    private Answers answers;





   




	public UserAnswer( Question questions, Customer customer, Answers answers) {
		
		this.question = questions;
		this.customer = customer;
		this.answers = answers;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public Question getQuestions() {
		return question;
	}





	public void setQuestions(Question questions) {
		this.question = questions;
	}





	public Customer getCustomer() {
		return customer;
	}





	public void setCustomer(Customer customer) {
		this.customer = customer;
	}





	public Answers getAnswers() {
		return answers;
	}





	public void setAnswers(Answers answers) {
		this.answers = answers;
	}





	




	
}
