package java_programming_element.Level_1;

public class PenDivision {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int perStudent = pens / students, remaining = pens % students;
        System.out.println(
                "The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }
}
