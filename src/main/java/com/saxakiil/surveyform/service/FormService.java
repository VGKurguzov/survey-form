package com.saxakiil.surveyform.service;

import com.saxakiil.surveyform.model.Form;
import com.saxakiil.surveyform.repository.FormRepository;
import com.saxakiil.surveyform.repository.QuestionCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    private final FormRepository formRepository;
    private final QuestionCardRepository questionCardRepository;

    @Autowired
    public FormService(FormRepository formRepository, QuestionCardRepository questionCardRepository) {
        this.formRepository = formRepository;
        this.questionCardRepository = questionCardRepository;
    }

    public void save(Form form) {
        questionCardRepository.saveAll(form.getQuestionCards());
        formRepository.save(form);
    }

    public List<Form> findAll() {
        return formRepository.findAll();
    }

    public Form findById(String id) {
        return formRepository.findById(id).get();
    }

    public void deleteAll() {
        formRepository.deleteAll();
    }

    public void deleteById(String id) {
        formRepository.deleteById(id);
    }

    public void updateById(String id, Form updatedForm) {
        formRepository.findById(id);
        formRepository.save(updatedForm);
    }
}
