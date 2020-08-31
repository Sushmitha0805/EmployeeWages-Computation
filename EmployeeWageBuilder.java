public class EmployeeWageBuilder
{

   public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
   public static final int EMP_WAGE_PER_HR=20;
  public static final int NUM_OF_WORKING_DAYS=20;
  public static final int maxhrs=100;
	public static int computeEmpWage( )
	{
         int empHrs=0;
         int Salary=0;
         int TotalWorkingDays=0;
         int TotalEmpHr=0;
        
         //Computation
           while(TotalEmpHr <= maxhrs && TotalWorkingDays < NUM_OF_WORKING_DAYS)
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
           TotalEmpHr=(TotalEmpHr+empHrs);
                        System.out.println("Day:"+TotalWorkingDays+" Emp Hours:"+ empHrs);

     }
                Salary=(TotalEmpHr*EMP_WAGE_PER_HR);
                System.out.println("Salary of employee: "+Salary);
                return Salary;
 }
    public static void main(String[] args){
    computeEmpWage();
  }
}
