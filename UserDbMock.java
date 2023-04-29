public class UserDbMock implements Iuserauthentication{
	
	public Iuserauthentication.AuthState userSignUp(User u){

		if(u.getFirstname().equals("") || u.getLastname().equals("") || u.getEmail().equals("") || u.getPassword().equals("")){
				return Iuserauthentication.AuthState.INOCRRECT_DATA;
		}else {
			return AuthState.SUCCESS;
		}
	}
	
	public Iuserauthentication.LogInState userLogIn(User u){

		if(u.getEmail().equals("jay@dal.ca") || u.getPassword().equals("123")){
				return Iuserauthentication.LogInState.SUCCESS;
		}else {
			return LogInState.INOCRRECT_DATA;
		}
	}	
}
