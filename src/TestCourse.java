import java.util.ArrayList;
public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures","Mon 09:10~12:00","Bill_Smith","M13312");
		Course course2 = new Course("Database Systems","Thur 13:00~15:00","John_White","E14221");
		
		Student Peter_Jones = new Student(0001,"Peter Jones","Computer Science","31/05/02");
		Student Kim_Smith = new Student(0002,"Kim Smith","Computer Science","30/03/02");
		Student Anne_Kennedy = new Student(0003,"Anne Kennedy","Computer Science","08/01/02");
		Student Steve_Smith = new Student(0004,"Steve Smith","Computer Science","01/11/01");
		
		course1.addStudent(Peter_Jones);
		course1.addStudent(Kim_Smith);
		course1.addStudent(Anne_Kennedy);
		course1.removeStudent(Peter_Jones);
		
		course2.addStudent(Peter_Jones);
		course2.addStudent(Steve_Smith);

		System.out.println("Number of students in course1: "+ course1.getNumberOfStudents());
		System.out.println("Course1's name: "+ course1.getCourseName());
		System.out.println("Course1's time: "+ course1.getCourseTime());
		System.out.println("Course1's professor: "+ course1.getCourseProfessor());
		System.out.println("Course1's classroom: "+ course1.getCourseClassroom());
		ArrayList<Student> students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students.get(i).getStudentName() + ", ");
		System.out.println();
		System.out.println("Number of students in course2: "+ course2.getNumberOfStudents());
		System.out.println("Index of Peter Jones in Course2: "+ course2.getIndexOfStudent(Peter_Jones));
	}
}