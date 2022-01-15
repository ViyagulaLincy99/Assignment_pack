//create a package of employeepackage
package employeepackage;
//create a class of Admin
public class Admin {
	int id;
	String pwd;
	
	public Admin(int id,String pwd)
	{
		this.id=id;
		this.pwd=pwd;
		
	}
	public void getUserDetails()
	{
		System.out.println(id+" "+pwd);
	}

}
