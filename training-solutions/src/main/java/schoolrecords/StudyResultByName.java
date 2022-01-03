package schoolrecords;

public class StudyResultByName {
    private final double studyAverage;
    private String studentName;

    public StudyResultByName(String studentName, double studyAverage) {
        if (!isEmpty(studentName)) {
            this.studentName = studentName;
        }
        this.studyAverage = studyAverage;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Name of student can not be null or empty.");
        }
        return false;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}