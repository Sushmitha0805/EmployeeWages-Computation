import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

 interface EmpWageBuilder{
     void addCompany(final String name, final int empRate, final int numOfWorkingDays, final int maxHrsInMonth);
     void computeEmpWage();
     int getTotalWageByCompanyName(final String name);
 }
 public class EmployeeWageBuilder implements EmpWageBuilder {
	
	private List<Company>companies;
   private Map<String,Integer> companyWages;
	
      public EmployeeWageBuilder() {
		companies = new ArrayList<Company>();
	   companyWages= new HashMap<String,Integer>();
   }

	public static void main(String[] args) {
		final EmpWageBuilder empBuilder = new EmployeeWageBuilder();
		empBuilder.addCompany("DMART", 20, 20, 100);
		empBuilder.addCompany("SBI", 20, 18, 110);

		empBuilder.computeEmpWage();

   //uc14
    final int totalWage = empBuilder.getTotalWageByCompanyName("DMART");
    System.out.println("Total empwages of dmart :" +totalWage);

	}

	public void addCompany(final String name, final int empRate, final int numOfWorkingDays, final int maxHrsInMonth){
		companies.add(new Company(name, empRate, numOfWorkingDays, maxHrsInMonth));
		
	}
   public int getTotalWageByCompanyName(final String name){
      final int totalWage=companyWages.get(name);
      return totalWage;
 }


	public void computeEmpWage(){

			for(int i = 0; i< companies.size(); i++){
         final Company company=companies.get(i);
			final int totalWage = computeEmpWage(company);
			company.setTotalEmpWage(totalWage);
			companyWages.put(company.getName(),totalWage);
		}
       System.out.println("companywages" +companyWages.toString());

	}
	
	private int computeEmpWage(final Company company) {
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while(totalEmpHrs < company.getMaxHrsInMonth() && totalWorkingDays< company.getNumOfWorkingDays()){
			totalWorkingDays++;

			final int empHrs = getEmpHrs();
			final int empWage = empHrs*company.getEmpRate();
			totalEmpHrs+=empHrs;
			totalWage+=empWage;
			
		}
		return totalWage;
	}

	
	public int getEmpHrs() {

		final int isFullTime = 1;
		final int isPartTime = 2;
		int empHrs = 0;

		
		final double randomValue = Math.floor(Math.random()*10)%3;

		switch((int)randomValue) {

			case isFullTime:
				empHrs = 8;
				//System.out.println("Employee is full time");
				break;
			case isPartTime:
				empHrs = 4;
				//System.out.println("Employee part time.");
				break;
			default:
				//System.out.println("Employee is absent");
				break;
		}
		return empHrs;
	}

	
}


class Company {

	private String name;
	private int empRate;
	private int numOfWorkingDays;
	private int maxHrsInMonth;
	private int totalEmpWage;

	public Company(final String name, final int empRate, final int numOfWorkingDays, final int maxHrsInMonth){
		this.name = name;
		this.empRate = empRate;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public String getName(){
		return this.name;
	}

	public int getEmpRate(){
		return this.empRate;
	}

	public int getNumOfWorkingDays(){
		return this.numOfWorkingDays;
	}

	public int getMaxHrsInMonth(){
		return this.maxHrsInMonth;
	}

	public void setTotalEmpWage(final int totalEmpWage){
		this.totalEmpWage=totalEmpWage;
	}

	@Override
	public String toString(){
		return "Total emp wage for company: "+name+" is "+ totalEmpWage;
	}

}
