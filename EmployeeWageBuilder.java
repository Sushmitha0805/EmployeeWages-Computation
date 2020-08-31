public class EmployeeWageBuilder
{

   public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
   public static final int EMP_WAGE_PER_HR=20;
  public static final int NUM_OF_WORKING_DAYS=20;

	public static void main(String[] args)
	{
         int empHrs=0;
         int totalWage=0;
         int EMP_WAGE_PER_DAY=0;
        
         //Computation
          for(int day=1; day<NUM_OF_WORKING_DAYS;day++)
          {
      	int empCheck=(int)Math.floor(Math.random()*10)%3;
			 
         switch( empCheck ){
             case IS_FULL_TIME:
				      System.out.println("Employee Is full time");
			         empHrs=8;
                   break;
     	      case IS_PART_TIME:
				       System.out.println("Employee is Part time Employee");
					     empHrs=4;
                  break;
            default:
			           System.out.println("Employee Is Absent");
					     empHrs=0;
                    break;
		}
       EMP_WAGE_PER_DAY=(empHrs*EMP_WAGE_PER_HR);
       totalWage=(totalWage+EMP_WAGE_PER_DAY);
	}
    System.out.println("Monthly salary of employee = "  +totalWage);
}
}
