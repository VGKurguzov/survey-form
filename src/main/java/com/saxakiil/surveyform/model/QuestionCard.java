package com.saxakiil.surveyform.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class QuestionCard {

    @Id
    private String id;

    private String question;

    private List<String> answers;

    public QuestionCard(String question, List<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public QuestionCard(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "QuestionCard{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
