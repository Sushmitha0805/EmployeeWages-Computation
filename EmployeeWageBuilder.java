public class EmployeeWageBuilder
{

	public static void main(String[] args)
	{
		//Display welcome message
		System.out.println("Welcome To Employee Wage Computation Problem");
		 	//Constants
      	int IS_PRESENT = 1;
         //Computation
      	double empCheck = Math.floor(Math.random() * 10 ) % 2;
			if (empCheck== IS_PRESENT)
         	System.out.println("Employee Is Present");
      	else
         	System.out.println("Employee Is Absent");

	}
}
