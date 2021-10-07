package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private String Id;
	@OneToMany(mappedBy = "student")
	private List<Enrollment>enroll;
	
	private String LastName;
	private String FirstMidName;
	private String EnrollmentDate;
	
	public Student() {
		
	}

	public Student(String id, List<Enrollment> enroll, String lastName, String firstMidName, String enrollmentDate) {
		super();
		Id = id;
		this.enroll = enroll;
		LastName = lastName;
		FirstMidName = firstMidName;
		EnrollmentDate = enrollmentDate;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public List<Enrollment> getEnroll() {
		return enroll;
	}

	public void setEnroll(List<Enrollment> enroll) {
		this.enroll = enroll;
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

	public String getEnrollmentDate() {
		return EnrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		EnrollmentDate = enrollmentDate;
	}
}
