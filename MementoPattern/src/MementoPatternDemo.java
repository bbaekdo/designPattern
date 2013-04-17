
public class MementoPatternDemo {
	public static void main(String[] args) {
		Originator originator =new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("state 1");
		originator.setState("state 2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("4");
		
		System.out.println("Current state: " + originator.getState() );
		originator.getStateToMemento(careTaker.get(0));
	
		System.out.println("First state: " + originator.getState());
		originator.getStateToMemento(careTaker.get(1));
		System.out.println("second state: " + originator.getState());
	}
}
