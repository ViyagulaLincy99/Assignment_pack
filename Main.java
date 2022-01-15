//create a package of details to test the employee and department package
package details;
import employeepackage.*;
import departmentpackage.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(101,"linc");
e1.getEmployeeDetails();
Manager m1=new Manager(1000);
System.out.println(m1.getNoOfEmployees());
Admin a1=new Admin(12,"lin");
a1.getUserDetails();
Department d1=new Department("Associate");
d1.getDepartment();

	}

}

