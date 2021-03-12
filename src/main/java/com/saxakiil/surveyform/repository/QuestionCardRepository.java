package com.saxakiil.surveyform.repository;

import com.saxakiil.surveyform.model.QuestionCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionCardRepository extends MongoRepository<QuestionCard, String> {

}
