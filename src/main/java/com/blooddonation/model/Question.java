package com.blooddonation.model;

import javax.persistence.*;
import java.util.UUID;

public class Question {
    @Id
    private UUID id = UUID.randomUUID();

    private String questionBody;
    private int questionOrder;

    @Enumerated(EnumType.STRING)
    private Enums.AnswerType answerType;

    @Enumerated(EnumType.STRING)
    private Enums.Sex genderSpecific; // if null -> it's general

    private Boolean isGoodAnswerNo;


    public Question() {
    }

    public Question(String questionBody, int questionOrder, Enums.AnswerType answerType, Enums.Sex genderSpecificQuestion, boolean isGoodAnswerNo) {
        this.questionBody = questionBody;
        this.questionOrder = questionOrder;
        this.answerType = answerType;
        this.genderSpecific = genderSpecificQuestion; // if null/empty -> used for both
        this.isGoodAnswerNo = isGoodAnswerNo;
    }

    public UUID getId() {
        return id;
    }

    public Enums.AnswerType getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Enums.AnswerType answerType) {
        this.answerType = answerType;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public Enums.Sex getGenderSpecific() {
        return genderSpecific;
    }

    public void setGenderSpecific(Enums.Sex genderSpecific) {
        this.genderSpecific = genderSpecific;
    }

    public boolean isGoodAnswerNo() {
        return isGoodAnswerNo;
    }

    public void setGoodAnswerNo(boolean goodAnswerNo) {
        isGoodAnswerNo = goodAnswerNo;
    }

    public int getQuestionOrder() {
        return questionOrder;
    }

    public void setQuestionOrder(int questionOrder) {
        this.questionOrder = questionOrder;
    }
}
