package ru.netology;

/**
 * Meeting — задача, описывающая назначенную встречу:
 * id — число;
 * topic — тема обсуждения;
 * project — название проекта, который будут обсуждать;
 * start — дата и время старта текстом.
 */

public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public String getProject() {
        return project;
    }

    public String getTopic() {
        return topic;
    }

    // Метод, проверяющий подходит ли эта задача поисковому запросу.
    // Задача подходит, если запрос query встречается в topic или project.

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        } else if (project.contains(query)) {
            return true;
        } else {
            return false;
        }
    }
}