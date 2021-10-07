package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Instructor {
	@Id
	@GeneratedValue
	private long Id;
	
	private String LastName;
	private String FirstMidName;
	private String HireDate;
	@ManyToMany
	@JoinTable(name="Instructor_Course",joinColumns= {@JoinColumn(name="course_id",referencedColumnName = "CourseId" )},
	inverseJoinColumns = {@JoinColumn(name="Instructor_id",referencedColumnName = "Id")})
	private List<Course> course=new ArrayList<Course>();
	
	@OneToMany(mappedBy = "instructor")
	private List<Department>dept;
	
	private Course CourseId;
	
	public Instructor() {
		
	}

	public Instructor(long id, String lastName, String firstMidName, String hireDate, Course courseId) {
		super();
		Id = id;
		LastName = lastName;
		FirstMidName = firstMidName;
		HireDate = hireDate;
		CourseId = courseId;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstMidName() {
		return FirstMidName;
	}

	public void setFirstMidName(String firstMidName) {
		FirstMidName = firstMidName;
	}

	public String getHireDate() {
		return HireDate;
	}

	public void setHireDate(String hireDate) {
		HireDate = hireDate;
	}

	public Course getCourseId() {
		return CourseId;
	}

	public void setCourseId(Course courseId) {
		CourseId = courseId;
	}
	
}
