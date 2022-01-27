package MaasHesaplama;

public class Employee {
	
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	int bonus;
	int vergi;
	int maasArtisi;
	
	
	public Employee(String name,int salary,int workHours,int hireYear) {
		this.hireYear = hireYear;
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
	}
	
	public void tax() {
		
		if(this.salary < 1000) {
			System.out.println("Veri Uygulanmamýþtýr: 0");
		}
		else {
			
			int vergiMiktari = (this.salary * 3) / 100;
			this.salary -= vergiMiktari;
			this.vergi = vergiMiktari;
			System.out.println("Alýnan Vergi:\t" + vergiMiktari);
		}
		
	}
	
	public void bonus() {
		
		if(this.workHours > 40) {
			int fark = this.workHours - 40;
			int bonusMiktari = fark * 30;
			this.salary += bonusMiktari;
			this.bonus = bonus;
			System.out.println("Bonus: " + bonusMiktari);
		}
		else {
			System.out.println("Bonus: 0");
		}
		
	}
	
	public void raiseSalary() {
		int workAmount = 2021 - this.hireYear;
		
		if(workAmount < 10) {
			int deceredAmount = (this.salary * 5) /100;
			this.salary += deceredAmount;
			this.maasArtisi = deceredAmount;
			System.out.println("Maaþ Artýþý: " + deceredAmount);
		}
		else if(workAmount > 9 && workAmount < 20) {
			int deceredAmount = (this.salary * 10) / 100;
			this.salary += deceredAmount;
			this.maasArtisi = deceredAmount;
			System.out.println("Maaþ Artýþý: " + deceredAmount);
			
		}
		else if(workAmount > 19) {
			int deceredAmount = (this.salary * 15) / 100;
			this.salary += deceredAmount;
			this.maasArtisi = deceredAmount;
			System.out.println("Maaþ Artýþý: " + deceredAmount);
		}
		else {
			System.out.println("Artýþ Yapýlamadý. Hatalý yýl verisi");
		}
	}
	
	public void employeeInfos() {
		
		System.out.println("Adý: " + this.name);
		System.out.println("Maaþý: " + this.salary);
		System.out.println("Çalýþma Saati: " + this.workHours);
		System.out.println("Baþlangýç Tarihi: " + this.hireYear);
		System.out.println("Vergi ve bonuslar ile birlikte maaþ: " + (this.salary - vergi + bonus));
		System.out.println("Toplam Maaþ: " + (this.salary + maasArtisi));
		
		
	}

}
