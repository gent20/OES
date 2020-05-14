package com.OES.onlineexamsystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Set;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private int numQuestions;
    private String timeLimit;
    private Set<Question> questions;

    public Exam() {
    }

    public Exam(String title, int numQuestions, String timeLimit) {
        this.title = title;
        this.numQuestions = numQuestions;
        this.timeLimit = timeLimit;
    }

    public Exam(String title, int numQuestions, String timeLimit, Set<Question> questions) {
        this.title = title;
        this.numQuestions = numQuestions;
        this.timeLimit = timeLimit;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return id == exam.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", numQuestions=" + numQuestions +
                ", timeLimit='" + timeLimit + '\'' +
                ", questions=" + questions +
                '}';
    }
}
