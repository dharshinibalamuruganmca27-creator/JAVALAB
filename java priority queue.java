import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.PriorityQueue;
import java.util.Comparator;

class Student {
    private int id;
    private String name;
    private double cgpa;
    
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public double getCGPA(){ return this.cgpa;}
    
    public Student(String id, String name, String cgpa){
        this.id = Integer.parseInt(id);
        this.name = name;
        this.cgpa = Double.parseDouble(cgpa);
    }
 }
 
class Priorities {
    // No attributes required
    public List<Student> getStudents(List<String> events){
        List<Student> out = new ArrayList<>();
        PriorityQueue<Student> pq = new PriorityQueue<Student>(
            Comparator.comparing(Student::getCGPA, Comparator.reverseOrder())
            .thenComparing(Student::getName)
            .thenComparing(Student::getId));

        // O(n log k)
        events.forEach(eventString -> 
        {
            String[] parts = eventString.split(" ");
            if("SERVED".equals(parts[0])){
                pq.poll();
            }else{
                Student student = new Student(parts[3], parts[1], parts[2]);
                pq.add(student);
            }
        });
        
        // O(m log m)
        while(!pq.isEmpty()){
            out.add(pq.poll());
        }
        
        // Overall complexity: O(n log k) when k < n,
        // worst scenario O(n log n) when n = k
        return out;
    }
 }

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
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
