package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void matchSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertTrue(actual);
    }

    @Test
    public void matchNoSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        Assertions.assertFalse(actual);
    }

    @Test
    public void getSimpleTaskTitle() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String actual = simpleTask.getTitle();
        Assertions.assertEquals("Позвонить родителям", actual);
    }

    @Test
    public void matchEpic() {
        Epic epic = new Epic(15, new String[]{"Зайти в магазин", "Зайти в прачечную", "Зайти в добрые булки"});

        boolean actual = epic.matches("Зайти");
        Assertions.assertTrue(actual);
    }

    @Test
    public void matchNoEpic() {
        Epic epic = new Epic(15, new String[]{"Зайти в магазин", "Зайти в прачечную", "Зайти в добрые булки"});

        boolean actual = epic.matches("Поехать");
        Assertions.assertFalse(actual);
    }

    @Test
    public void getSubtasksEpic() {
        Epic epic = new Epic(15, new String[]{"Зайти в магазин", "Зайти в прачечную", "Зайти в Добрые булки"});

        String[] actual = epic.getSubtasks();
        String[] expected = new String[]{"Зайти в магазин", "Зайти в прачечную", "Зайти в Добрые булки"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void matchTopicMeeting() {
        Meeting meeting = new Meeting(25, "Встреча с другом", "Доктор", "Вторник");

        boolean actual = meeting.matches("Встреча");
        Assertions.assertTrue(actual);

    }

    @Test
    public void matchProjectMeeting() {
        Meeting meeting = new Meeting(25, "Встреча с другом", "Доктор", "Вторник");

        boolean actual = meeting.matches("Доктор");
        Assertions.assertTrue(actual);

    }

    @Test
    public void matchNoMeeting() {
        Meeting meeting = new Meeting(25, "Встреча с другом", "Доктор", "Вторник");

        boolean actual = meeting.matches("Капуста");
        Assertions.assertFalse(actual);

    }

    @Test
    public void getMeetingTopic() {
        Meeting meeting = new Meeting(25, "Встреча с другом", "Доктор", "Вторник");

        String actual = meeting.getTopic();
        Assertions.assertEquals("Встреча с другом", actual);
    }

    @Test
    public void getMeetingProject() {
        Meeting meeting = new Meeting(25, "Встреча с другом", "Доктор", "Вторник");

        String actual = meeting.getProject();
        Assertions.assertEquals("Доктор", actual);
    }

    @Test
    public void getMeetingStart() {
        Meeting meeting = new Meeting(25, "Встреча с другом", "Доктор", "Вторник");

        String actual = meeting.getStart();
        Assertions.assertEquals("Вторник", actual);
    }
}