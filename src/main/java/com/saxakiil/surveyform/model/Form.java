package com.saxakiil.surveyform.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Form {

    @Id
    private String id;
    private String name;
    private List<QuestionCard> questionCards;

    public Form(String name, List<QuestionCard> questionCards) {
        this.name = name;
        this.questionCards = questionCards;
    }

    public Form() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuestionCard> getQuestionCards() {
        return questionCards;
    }

    public void setQuestionCards(List<QuestionCard> questionCards) {
        this.questionCards = questionCards;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", questionCards=" + questionCards +
                '}';
    }
}
