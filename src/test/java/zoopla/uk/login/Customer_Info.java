package zoopla.uk.login;

public class Customer_Info {
	static int salary;
	static String name;
	
	public void getSalary(){
		salary = 1000;
		name = "Rafat";
		System.out.println("Salary :" + salary);
		System.out.println("Name :" + name);
	}

	public static void main(String[] args) {
		
	Customer_Info obj = new Customer_Info();
	obj.getSalary();
		
		}

	}

