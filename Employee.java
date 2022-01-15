package employeepackage;
//create a class of Employee
public class Employee {
	int eid;
	String ename;
	
	public Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println(eid+" "+ename);
		
	}

}
