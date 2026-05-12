class Task5{
	public static void main(String args[]){
		String names[]={"Alice","Bob","Charlie"};
        	int salaries[]={50000,30000,70000};
		System.out.println("Employee List:");
		for(String s:names){
			System.out.println(s);
		}
		int totalSal=0;
		for(int i:salaries){
			totalSal+=i;
		}
		int avgSal=totalSal/salaries.length;
		System.out.println("Total Salary: "+totalSal);
        	System.out.println("Average Salary: "+avgSal);
	}
}