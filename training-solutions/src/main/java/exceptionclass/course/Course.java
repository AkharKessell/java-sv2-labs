package exceptionclass.course;

public class Course {
    private final String name;
    private final SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        checkAttributes(name, begin);
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return begin.toString() + ": " + name;
    }

    private void checkAttributes(String name, SimpleTime time) {
        if (name == null) {
            throw new IllegalArgumentException("Name is null!");
        }
        if (time == null) {
            throw new IllegalArgumentException("Begin is null!");
        }
    }
}