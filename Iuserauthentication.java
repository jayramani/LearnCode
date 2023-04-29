
public interface Iuserauthentication {
	
	public enum AuthState{
		SUCCESS,
		INOCRRECT_DATA
	}
	public enum LogInState{
		SUCCESS,
		INOCRRECT_DATA
	}
	
	public enum UserState{
		SUCCESS,
		FAIL
	}
	
	public AuthState userSignUp(User u);
    public LogInState userLogIn(User u);    
}
	