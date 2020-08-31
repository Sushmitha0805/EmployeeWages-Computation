public class EmployeeWageBuilder
{

	public static void main(String[] args)
	{
		//Display welcome message
		System.out.println("Welcome To Employee Wage Computation Problem");
		 	//Constants
      	int IS_FULL_TIME = 1;
         int IS_PART_TIME=2;
         int EMP_WAGE_PER_HR=20;
		    int FULL_DAY_HR=8;
         int Salary=0;
         //Computation
      	double empCheck = Math.floor(Math.random() * 10 ) % 2;
			if (empCheck== IS_FULL_TIME)
		{
				System.out.println("Employee Is full time");
			 Salary = EMP_WAGE_PER_HR * FULL_DAY_HR;
				System.out.println("Salary="+Salary);
		}
     	else if (empCheck == IS_PART_TIME)
		{
				System.out.println("Employee is Part time Employee");
					int empHrs=4;
					 Salary = EMP_WAGE_PER_HR * empHrs;
            System.out.println("Salary = " +Salary);
		}
     	else
		{
			System.out.println("Employee Is Absent");
					int empHrs=0;
			   	 Salary = EMP_WAGE_PER_HR * empHrs;
			System.out.println("Salary = " +Salary);

		}

	}
}
