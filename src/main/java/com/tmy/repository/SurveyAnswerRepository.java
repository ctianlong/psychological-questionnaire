package com.tmy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmy.model.SurveyAnswer;
import com.tmy.model.User;

public interface SurveyAnswerRepository extends JpaRepository<SurveyAnswer, Integer> {
	
	SurveyAnswer findOneByUser(User user);

}
