package MaasHesaplama;

public class Main {
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Yusuf", 3000, 46, 1987);
		
		e1.bonus();
		e1.raiseSalary();
		e1.tax();
		e1.employeeInfos();

		
		
	}

}
