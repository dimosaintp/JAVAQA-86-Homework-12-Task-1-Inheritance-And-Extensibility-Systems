package ru.netology;

/**
 * Класс, реализующий хранилище задач в менеджере.
 * Epic — задача, состоящая из подзадач:
 * id — число;
 * subtasks — массив из подзадач, каждая из которых является простым текстом.
 */

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    // Метод, проверяющий подходит ли эта задача поисковому запросу.
    // Задача подходит, если запрос query встречается хотя бы в одной из подзадач.

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }
        }
        return false;
    }
}