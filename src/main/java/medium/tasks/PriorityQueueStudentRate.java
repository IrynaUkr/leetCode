package medium.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueStudentRate {
    private final static Scanner scan = new Scanner(System.in);
    private final static Student.Priorities priorities = new Student.Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final double cdpa;

    public Student(int id, String name, double cdpa) {
        this.id = id;
        this.name = name;
        this.cdpa = cdpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCdpa() {
        return cdpa;
    }

    @Override
    public int compareTo(Student s) {
        if (this.getCdpa() == s.getCdpa()) {
            if (this.getName().equals(s.getName())) {
                return this.getId() - s.getId();
            } else {
                return this.getName().compareTo(s.getName());
            }
        } else {
            return this.getCdpa() < s.getCdpa() ? 1 : -1;
        }
    }



    static class Priorities {
        List<Student> getStudents(List<String> events) {
            PriorityQueue<Student> queue = new PriorityQueue<>();
            for (int i = 0; i < events.size(); i++) {
                String[] info = events.get(i).split(" ");
                if (info[0].equals("ENTER")) {
                    int id = Integer.parseInt(info[3]);
                    String name = info[1];
                    double cdpa = Double.parseDouble(info[2]);
                    queue.add(new Student(id, name, cdpa));
                } else {
                    queue.poll();
                }
            }
            return new ArrayList<>(queue);
        }
    }
}
