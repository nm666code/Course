public class Student {
	private int studentID;
	private String studentName;
	private String studentDepartment;
	private String studentBorn;
	
	public  Student(int studentID,String studentName,String studentDepartment,String studentBorn){
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.studentBorn = studentBorn;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getStudentDepartment() {
		return studentDepartment;
	}
	
	public String getStudentBorn() {
		return studentBorn;
	}
}
