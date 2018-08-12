package com.durgasoft.beans;

public class Student {

	private Branch branch;
	/*public Student(Branch branch)
	{
		this.branch=branch;
	}
	*/
	
	
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
	public String getStudentName()
	{
		return "Durga";
	}

}
