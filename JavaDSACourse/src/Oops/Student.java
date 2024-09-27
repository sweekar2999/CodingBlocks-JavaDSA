package Oops;

/*



//ARRAY OF OBJECTS
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 22);
        students[1] = new Student("Bob", 20);
        students[2] = new Student("Charlie", 21);

        // Accessing objects in the array
        for (Student student : students) {
            System.out.println(student.name + " is " + student.age + " years old.");
        }
    }
}



*/
//COMPARABLES

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Natural ordering by age
    public int compareTo(Student other) {
        return this.age - other.age;  // Ascending order
    }

    public String toString() {
        return name + " (" + age + ")";
    }
    public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int pass = 1; pass < arr.length; pass++) { // itni baar comparison hoga
			for (int i = 0; i < arr.length - pass; i++) {
				if(arr[i].compareTo(arr[i+1])>0) { // for descending inverse the sign
					T t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			}
		}
	}
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 22),
            new Student("Bob", 20),
            new Student("Charlie", 21)
        };

        // Sort using Comparable's compareTo method
        sort(students);

        // Display sorted students
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


