package com.saxakiil.surveyform;

import com.saxakiil.surveyform.model.QuestionCard;
import com.saxakiil.surveyform.model.Form;
import com.saxakiil.surveyform.service.QuestionCardService;
import com.saxakiil.surveyform.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SurveyFormApplication implements CommandLineRunner {

    @Autowired
    FormService formService;

    @Autowired
    QuestionCardService questionCardService;

    public static void main(String[] args) {
        SpringApplication.run(SurveyFormApplication.class, args);

    }

    @Override
    public void run(String... args) {

        formService.deleteAll();
        questionCardService.deleteAll();

        QuestionCard questionCard1 = new QuestionCard("Вопрос1", Arrays.asList("Ответ1", "Ответ2", "Ответ3"));
        QuestionCard questionCard2 = new QuestionCard("Вопрос2", Arrays.asList("Ответ4", "Ответ5", "Ответ6"));
        QuestionCard questionCard3 = new QuestionCard("Вопрос3", Arrays.asList("Ответ7", "Ответ8", "Ответ9"));
        Form form = new Form("Таблица1", Arrays.asList(questionCard1, questionCard2, questionCard3));

        formService.save(form);

        for (Form formElem : formService.findAll()){
            System.out.println(formElem.toString());
        }

    }
}
