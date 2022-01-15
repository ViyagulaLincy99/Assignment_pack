package departmentpackage;
//create a class of Project
public class Project {
	String pname;
	int daysToComplete;
	
	public Project(String pname,int daysToComplete)
	{
		this.pname=pname;
		this.daysToComplete=daysToComplete;
	}
	public void getProjectDetails()
	{
		System.out.println(pname+" "+daysToComplete);
	}

}
