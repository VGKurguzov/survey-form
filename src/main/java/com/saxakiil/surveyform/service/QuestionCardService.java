package com.saxakiil.surveyform.service;

import com.saxakiil.surveyform.model.QuestionCard;
import com.saxakiil.surveyform.repository.QuestionCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionCardService {

    private final QuestionCardRepository questionCardRepository;

    @Autowired
    public QuestionCardService(QuestionCardRepository questionCardRepository) {
        this.questionCardRepository = questionCardRepository;
    }

    public void save(QuestionCard questionCard) {
        questionCardRepository.save(questionCard);
    }

    public List<QuestionCard> findAll() {
        return questionCardRepository.findAll();
    }

    public QuestionCard findById(String id) {
        return questionCardRepository.findById(id).get();
    }

    public void deleteAll() {
        questionCardRepository.deleteAll();
    }
}
