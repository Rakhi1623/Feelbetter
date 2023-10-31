package com.canddella.FeelBetter.service.impl;

import com.canddella.FeelBetter.dto.UserAnswerDto;
import com.canddella.FeelBetter.entity.*;
import com.canddella.FeelBetter.repositary.*;
import com.canddella.FeelBetter.service.UserAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAnswerServiceImpl implements UserAnswerService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserAnswerRepository userAnswerRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private QuestionsRepository questionsRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private UserMarkRepository userMarkRepository;


    @Override
    public void respond(UserAnswerDto userAnswerDto) {

    }

    @Override
    public String calculateMood(UserAnswerDto userAnswerDto,Customer customer) {
        int count = 10;
        int index = 1;
        int marks = 0;

        for (int i = 0; i < 10; i++) {
            String answer = null;
             if(index == 1)
                 answer=userAnswerDto.getAnswer1();
             else if(index == 2)
                 answer=userAnswerDto.getAnswer2();
             else if(index == 3)
                 answer=userAnswerDto.getAnswer3();
             else if(index == 4)
                 answer=userAnswerDto.getAnswer4();
             else if(index == 5)
                 answer=userAnswerDto.getAnswer5();
             else if(index == 6)
                 answer=userAnswerDto.getAnswer6();
             else if(index == 7)
                 answer=userAnswerDto.getAnswer7();
             else if(index == 8)
                 answer=userAnswerDto.getAnswer8();
             else if(index == 9)
                 answer=userAnswerDto.getAnswer9();
             else if(index == 10)
                 answer=userAnswerDto.getAnswer10();


           Answers answers = answerRepository.findByAnswer(answer);




                String question = null;
                if(index == 1)
                    question=userAnswerDto.getQuestion1();
                else if(index == 2)
                    question=userAnswerDto.getQuestion2();
                else if(index == 3)
                    question=userAnswerDto.getQuestion3();
                else if(index == 4)
                    question=userAnswerDto.getQuestion4();
                else if(index == 5)
                    question=userAnswerDto.getQuestion5();
                else if(index == 6)
                    question=userAnswerDto.getQuestion6();
                else if(index == 7)
                    question=userAnswerDto.getQuestion7();
                else if(index == 8)
                    question=userAnswerDto.getQuestion8();
                else if(index == 9)
                    question=userAnswerDto.getQuestion9();
                else if(index == 10)
                    question=userAnswerDto.getQuestion10();


            Question questions = questionsRepository.findByQuestions(question);
			/*
			 * System.out.println(questions);
			 */           
            UserAnswer userAnswer = new UserAnswer( questions, customer, answers);
            userAnswer.setAnswers(answers);
            userAnswer.setQuestions(questions);
            userAnswer.setCustomer(customer);
			/* System.out.println(userAnswer); */

            userAnswer  = userAnswerRepository.save(userAnswer);

                 

        
    }
		return "Success";
    }
}
    /*@Override
    public User getuser(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            Long userId = user.getId();
            return user;
        } else {
            return null;
        }
        }*/





   /* private Long mapSelectedAnswerToId(String selectedAnswer) {

        switch (selectedAnswer) {
            case "Never":
                return 1L;
            case "Occasionally":
                return 2L;
            case "Sometimes":
                return 3L;
            case "Often":
                return 4L;
            case "Always":
                return 5L;
            default:
                return null;
        }
    }*/








