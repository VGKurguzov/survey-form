package com.saxakiil.surveyform.repository;

import com.saxakiil.surveyform.model.Form;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormRepository extends MongoRepository<Form, String> {

}
