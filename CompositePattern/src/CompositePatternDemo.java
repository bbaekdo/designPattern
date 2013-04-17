public class CompositePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee CEO = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		CEO.add(headMarketing);
		CEO.add(headSales);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		System.out.println(CEO);
		System.out.println("123");
		
		for(Employee e : CEO.getSubordinates()) {
			System.out.println(e);
			for(Employee ex : e.getSubordinates()) {
				System.out.println(ex);
			}
		}
		
	}

}
