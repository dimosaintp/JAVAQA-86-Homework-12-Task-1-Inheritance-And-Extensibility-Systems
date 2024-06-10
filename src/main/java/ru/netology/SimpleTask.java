package ru.netology;

/**
 * SimpleTask — простая задача, состоящая из:
 * id — число;
 * title — название.
 */

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора.
        this.title = title; // заполнение своих полей.
    }

    public String getTitle() {
        return title;
    }

    // Метод, проверяющий подходит ли эта задача поисковому запросу.
    // Задача подходит, если запрос query встречается в title.

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}