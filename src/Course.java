import java.util.ArrayList;
public class Course {
	private String courseName;
	private ArrayList<Student> students = new ArrayList<Student>();
	private String courseTime;
	private String courseProfessor;
	private String courseClassroom;
	public Course(String courseName , String courseTime , String courseProfessor , String courseClassroom) {
		this.courseName = courseName;
		this.courseTime = courseTime;
		this.courseProfessor = courseProfessor;
		this.courseClassroom = courseClassroom;
	}
	
	public void removeStudent(Student student){
		students.remove(student);
	}
	
	public boolean addStudent(Student student){
		if (!students.contains(student)){
			students.add(student);
			return true;
		}
		return false;
	}
	
	public int getIndexOfStudent(Student student){
		return students.indexOf(student);
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseTime(){
		return courseTime;
	}
	
	public String getCourseProfessor() {
		return courseProfessor;
	}
	
	public String getCourseClassroom() {
		return courseClassroom;
	}
}