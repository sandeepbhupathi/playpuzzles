package studentsort;

import java.util.*;

public class Priorities {
    public List<Student> getStudents(List<String> events) {
        Set<Student> studentSet = new TreeSet<>();
        List<Student> studentList = new ArrayList<>();
        events.stream().forEach((event)->{
            String splitEvent[] =event.split("\\s");
            if(splitEvent[0].equalsIgnoreCase("SERVED")){
                System.out.println("Before Serving: "+studentSet+"It has been served :"+removeFirst(studentSet));
            }else{
                studentSet.add(new Student(splitEvent[1],splitEvent[2],splitEvent[3]));
            }

        });
        studentList.addAll(studentSet);
        return studentList;
    }

    public Student removeFirst(Set<Student> c) {
        Iterator<Student> it = c.iterator();
        if (!it.hasNext()) { return null; }
        Student removed = it.next();
        it.remove();
        return removed;
    }
}
