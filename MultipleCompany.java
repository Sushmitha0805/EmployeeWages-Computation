public class MultipleCompany{

  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
  public static final int IS_ABSENT=0;
  
  public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
	  //variables
	  int empHrs=0;
	  int totalEmpHrs=0;
	  int totalWorkingDays=0;
	  //computation
	  while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays  < numOfWorkingDays){
		  int empCheck=(int)Math.floor(Math.random()*10)%3;
		  switch(empCheck){
			  case IS_PART_TIME:
				  empHrs=4;
				  break;
			  case IS_FULL_TIME:
				  empHrs=8;
				  break;
			  case IS_ABSENT:
				  empHrs=0;
				  break;
			  default:
				  System.out.println("invalid");
		  }
		  totalEmpHrs+=empHrs;
		  System.out.println("Day#: " +totalWorkingDays + "EmpHr:" +empHrs);
	  }
	  int totalEmpWage=totalEmpHrs*empRatePerHour;
	  System.out.println("Total Emp Wage for comapny: " +company+ " is:" +totalEmpWage);
	   return totalEmpWage;
  }
	public static void main(String[]args){
		computeEmpWage("Dmart",20,20,10);
		computeEmpWage("SBI",10,10,20);
	}
	
}
		
