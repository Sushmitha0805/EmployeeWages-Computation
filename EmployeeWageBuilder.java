public class EmployeeWageBuilder{
	//Constants
        public static final int isPartTime=1;
        public static final int isFullTime=2;
        public static final int EMP_RATE_PER_HR=20;

        public static void main(String args[]){
		//Variables
                int empHours=0;
                int empWagesPerDay=0;

		//random method
                int empCheck=(int)Math.floor(Math.random()*10)%3;

                switch(empCheck){
                        case isFullTime:
                                System.out.println("Employee is fulltime emp");
                                empHours=8;
                                break;
                        case isPartTime:
                                System.out.println("Employee is  parttime emp");
                                empHours=4;
                                break;
                        default:
                                System.out.println("Employee is absent");
                                empHours=0;
                                break;
                }
		
		//Computation
                empWagesPerDay=empHours*EMP_RATE_PER_HR;
                System.out.println("Employee Wage for a day: "+empWagesPerDay);
        }
}
