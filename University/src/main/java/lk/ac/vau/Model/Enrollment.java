package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {
	@Id
	@GeneratedValue
	private String EnrollmentId;
	private Course CourseId;
	@ManyToOne
	@JoinColumn(name="CourseId",referencedColumnName="CourseId")
	private Student StudentId;
	@ManyToOne
	@JoinColumn(name="StudentId",referencedColumnName="Id")
	private String Grade;
	
	public Enrollment() {
		
	}

	public Enrollment(String enrollmentId, Course courseId, Student studentId, String grade) {
		super();
		EnrollmentId = enrollmentId;
		CourseId = courseId;
		StudentId = studentId;
		Grade = grade;
	}

	public String getEnrollmentId() {
		return EnrollmentId;
	}

	public void setEnrollmentId(String enrollmentId) {
		EnrollmentId = enrollmentId;
	}

	public Course getCourseId() {
		return CourseId;
	}

	public void setCourseId(Course courseId) {
		CourseId = courseId;
	}

	public Student getStudentId() {
		return StudentId;
	}

	public void setStudentId(Student studentId) {
		StudentId = studentId;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}
	
}
