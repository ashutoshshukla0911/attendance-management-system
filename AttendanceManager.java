import java.util.ArrayList;
import java.util.List;

public class AttendanceManager {
    private List<Student> records;

    public AttendanceManager() {
        records = new ArrayList<>();
    }

    public void markAttendance(String name, String status) {
        records.add(new Student(name, status));
    }

    public List<Student> getAllRecords() {
        return records;
    }
}
