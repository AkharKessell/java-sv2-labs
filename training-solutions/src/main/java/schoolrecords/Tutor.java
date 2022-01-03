package schoolrecords;

import java.util.List;

public class Tutor {
    private final List<Subject> taughtSubjects;
    private String name;

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (!isEmpty(name)) {
            this.name = name;
        }
        this.taughtSubjects = taughtSubjects;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty or null.");
        }
        return false;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject actual : taughtSubjects) {
            if (subject.getSubjectName().equals(actual.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}