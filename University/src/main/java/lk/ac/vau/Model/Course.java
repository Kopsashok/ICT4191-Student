package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private String CourseId;

	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "course")
	private List<Instructor> instructor=new ArrayList<Instructor>();
	
	private String Title;
	private int Credits;
	@OneToMany(mappedBy = "course")
	private List<Enrollment>enroll;
	
	@ManyToOne
	@JoinColumn(name="DepartmentId",referencedColumnName="DepartmentId")
	private Department DepartmentId;
	
	public Course() {
		
	}

	public Course(String courseId, String title, int credits, List<Enrollment> enroll, Department departmentId) {
		super();
		CourseId = courseId;
		Title = title;
		Credits = credits;
		this.enroll = enroll;
		DepartmentId = departmentId;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credits) {
		Credits = credits;
	}

	public List<Enrollment> getEnroll() {
		return enroll;
	}

	public void setEnroll(List<Enrollment> enroll) {
		this.enroll = enroll;
	}

	public Department getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(Department departmentId) {
		DepartmentId = departmentId;
	}
	
}
