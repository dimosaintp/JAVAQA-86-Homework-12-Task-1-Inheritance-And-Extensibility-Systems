package ru.netology;

// SimpleTask — простая задача, про неё известны только id (число) и title (название);

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора.
        this.title = title; // заполнение своих полей.
    }

    public String getTitle() {
        return title;
    }
}