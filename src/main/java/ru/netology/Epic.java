package ru.netology;

// Epic — задача, состоящая из подзадач. Про неё известны id (число) и subtasks — массив из подзадач,
// каждая из которых является простым текстом (String).

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}