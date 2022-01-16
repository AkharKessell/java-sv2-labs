package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {
    private final List<ToDo> todos = new ArrayList<>();

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addTodos(new ToDo("sleep", true));
        toDoList.addTodos(new ToDo("wakeup", false));
        toDoList.addTodos(new ToDo("wash", true));
        toDoList.addTodos(new ToDo("eat", true));
        toDoList.addTodos(new ToDo("dress", false));
        toDoList.addTodos(new ToDo("travel", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
    }

    public void addTodos(ToDo toDo) {
        todos.add(toDo);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> order = new ArrayDeque<>();
        for (ToDo actual : todos) {
            if (actual.isUrgent()) {
                order.push(actual);
            } else {
                order.add(actual);
            }
        }
        return order;
    }
}