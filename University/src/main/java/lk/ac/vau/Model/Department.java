package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private long DepartmentId;
	private String Name;
	private double budget;
	private String StartDate;
	@ManyToOne
	@JoinColumn(name="Instructor_id",referencedColumnName="Id")
	private Instructor InstructorId;
	
	public Department() {
		
	}

	public Department(long departmentId, String name, double budget, String startDate, Instructor instructorId) {
		super();
		DepartmentId = departmentId;
		Name = name;
		this.budget = budget;
		StartDate = startDate;
		InstructorId = instructorId;
	}

	public long getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(long departmentId) {
		DepartmentId = departmentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public Instructor getInstructorId() {
		return InstructorId;
	}

	public void setInstructorId(Instructor instructorId) {
		InstructorId = instructorId;
	}
	
}
