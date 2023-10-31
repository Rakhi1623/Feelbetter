package com.canddella.FeelBetter.service;

import com.canddella.FeelBetter.dto.UserAnswerDto;
import com.canddella.FeelBetter.entity.Customer;
import com.canddella.FeelBetter.entity.User;

public interface UserAnswerService {
    public void respond(UserAnswerDto userAnswerDto);
    public String calculateMood(UserAnswerDto userAnswerDto,Customer customer);
    /*public User getuser(String username);*/



}
