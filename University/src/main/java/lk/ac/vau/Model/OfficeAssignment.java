package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OfficeAssignment {
	@Id
	@GeneratedValue
	private Instructor instructorId;
	private String Location;
	@OneToOne(mappedBy = "Id")
	private List<OfficeAssignment>instructors;
	
	public OfficeAssignment() {
		
	}

	public OfficeAssignment(Instructor instructorId, String location, List<OfficeAssignment> instructors) {
		super();
		this.instructorId = instructorId;
		Location = location;
		this.instructors = instructors;
	}

	public Instructor getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Instructor instructorId) {
		this.instructorId = instructorId;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public List<OfficeAssignment> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<OfficeAssignment> instructors) {
		this.instructors = instructors;
	}
}
