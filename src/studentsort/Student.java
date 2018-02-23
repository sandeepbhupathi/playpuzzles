package studentsort;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private double cgpa;
    private int id;



    public Student(String name, String cgpa, String id) {
        this.name = name;
        this.cgpa = Double.parseDouble(cgpa);
        this.id = Integer.parseInt(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }



    @Override
    public int compareTo(Student o) {
        if(this.getCgpa()>o.getCgpa()){
            return -1;
        }else if(this.getCgpa()<o.getCgpa()){
            return 1;
        }else {
            if (this.getName().compareToIgnoreCase(o.getName()) > 1) {
                return -1;
            } else if (this.getName().compareToIgnoreCase(o.getName()) < 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (Double.compare(student.getCgpa(), getCgpa()) != 0) return false;
        if (getId() != student.getId()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getCgpa());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getId();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", id=" + id +
                '}';
    }
}
