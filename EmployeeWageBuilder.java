
public class EmployeeWageBuilder
{

	public static void main(String[] args)
	{
		//Display welcome message
		System.out.println("Welcome To Employee Wage Computation Problem");
		 	//Constants
      	int IS_PRESENT = 1;
         int EMP_WAGE_PER_HR=20;
		    int FULL_DAY_HR=8;
         int Salary=0;
         //Computation
      	double empCheck = Math.floor(Math.random() * 10 ) % 2;
			if (empCheck== IS_PRESENT)
		{
				System.out.println("Employee Is Present");
			 Salary = EMP_WAGE_PER_HR * FULL_DAY_HR;
				System.out.println("Salary="+Salary);
		}
     	else
		{
			System.out.println("Employee Is Absent");
		}
	}
}
