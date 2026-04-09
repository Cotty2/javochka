
import java.util.Arrays;

public class Main {


    static class Student implements Comparable<Student> {
        int age;

        public Student(int age) {
            this.age = age;
        }


        public int compareTo(Student other) {
            return Integer.compare(this.age, other.age);
        }


        public String toString() {
            return "Студент(" + age + ")";
        }
    }

    public static Comparable[] maxAndMin(Comparable[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать минимум 2 элемента");
        }

        Comparable max = array[0];
        Comparable min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return new Comparable[] { max, min };
    }

    public static void main(String[] args) {

        Integer[] numbers = { 10, 5, 20, 1 };
        System.out.println("Числа: " + Arrays.toString(maxAndMin(numbers)));

        String[] strings = { "Яблоко", "Апельсин", "Банан" };
        System.out.println("Строки: " + Arrays.toString(maxAndMin(strings)));

        Student[] students = { new Student(20), new Student(25), new Student(18) };
        System.out.println("Студенты: " + Arrays.toString(maxAndMin(students)));


        try {
            maxAndMin(new Integer[] { 100 });
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}