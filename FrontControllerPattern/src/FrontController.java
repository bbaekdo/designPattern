
public class FrontController {
	private Dispathcher dispathcher;
	
	public FrontController() {
		dispathcher = new Dispathcher();
	}
	
	private boolean isAuthenticUser() {
		System.out.println("user is authenticated successfully");
		return true;
	}
	
	private void trackRequest(String request) {
		System.out.println("page request " + request);
	}
	
	public void dispatchRequest(String request) {
		trackRequest(request);
		if(isAuthenticUser()) {
			dispathcher.dispatch(request);
		}
	}
	
}
