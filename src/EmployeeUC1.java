import java.util.random.*;

public class EmployeeUC1
{
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =1;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NUM_OF_WORKING_DAYS =2;
	public static final int MAX_HRS_IN_MONTH =10;
	
	public static void main(String []args)
	{
		int totalEmhrs =0, totalEmpwage =0,totalWorkingays=0;
		
	while (  totalEmhrs <=  MAX_HRS_IN_MONTH && totalWorkingays <1  NUM_OF_WORKING_DAYS)
		
	{
	
	int emphrs =0;
	
	totalWorkingays ++;
	
	int empcheck = (int) Math.floor(Math.random() *10) % 3;
	switch (empcheck)
	{
	case  IS_FULL_TIME:
	emphrs =8;
	break;
	case IS_PART_TIME :
		emphrs =4;
		break;
		default:
			emphrs =0;		
	}
	 
	 totalEmhrs += emphrs;
	 int empwage = emphrs = EMP_RATE_PER_HOUR;
	 totalEmpwage += empwage;
		 
	}
	}
}

