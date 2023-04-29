public class UserTest {

	public void userSignUpSuccessTest() {            
		User u = new User("Jay","Ramani","jay@dal.ca","123");

		UserDbMock uDbMock = new UserDbMock();
		Iuserauthentication.AuthState result= u.userSignUp(uDbMock);		
		
		if(Iuserauthentication.AuthState.SUCCESS==result) {
			System.out.println("userSignUpSuccessTest : Pass");
		}else {
			System.out.println("userSignUpSuccessTest : Fail");
		}
	}
	public void userSignUpEmptyFieldest() {            
		User u = new User("Jay","","jay@dal.ca","123");

		UserDbMock uDbMock = new UserDbMock();
		Iuserauthentication.AuthState result= u.userSignUp(uDbMock);		
		
		if(Iuserauthentication.AuthState.INOCRRECT_DATA==result) {
			System.out.println("userSignUpEmptyFieldTest : Pass");
		}else {
			System.out.println("userSignUpEmptyFieldTest : Fail");
		}
	}
	
	public void userLoginSuccessTest() {

		User u = new User("Jay","Ramani","jay@dal.ca","123");
		UserDbMock uDbMock = new UserDbMock();
		Iuserauthentication.LogInState result= u.userLogIn(uDbMock);
	
		if(Iuserauthentication.LogInState.SUCCESS==result) {
			System.out.println("userLoginSuccessTest : Pass");
		}else {
			System.out.println("userLoginSuccessTest : Fail");
		}
	}
	
	public void userLoginincorrectDataTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		UserDbMock uDbMock = new UserDbMock();
		Iuserauthentication.LogInState result= u.userLogIn(uDbMock);
	
		if(Iuserauthentication.LogInState.SUCCESS==result) {
			System.out.println("userLoginIncorrectDataTest : Pass");
		}else {
			System.out.println("userLoginIncorrectDataTest : Fail");
		}
	}	
	
	public void getFirstnameTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		if(u.getFirstname().equals("Jay")) {
			System.out.println("getFirstnameTest : Pass");
		}else {
			System.out.println("getFirstnameTest : Fail");
		}
	}
	
	public void setFirstnameTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setFirstname("xyz");
		if(u.getFirstname().equals("xyz")) {
			System.out.println("setFirstnameTest : Pass");
		}else {
			System.out.println("setFirstnameTest : Fail");
		}
	}
	
	public void setIncorrectFirstnameTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setFirstname("");
		if(u.getFirstname().equals("Jay")) {
			System.out.println("setIncorrectFirstnameTest : Pass");
		}else {
			System.out.println("setIncorrectFirstnameTest : Fail");
		}
	}
	
	public void getLastnameTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		if(u.getLastname().equals("Ramani")) {
			System.out.println("getLastnameTest : Pass");
		}else {
			System.out.println("getLastnameTest : Fail");
		}
	}
	
	public void setLastnameTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setLastname("xyz");
		if(u.getLastname().equals("xyz")) {
			System.out.println("setLastnameTest : Pass");
		}else {
			System.out.println("setLastnameTest : Fail");
		}
	}
	
	public void setIncorrectLastnameTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setLastname("");
		if(u.getLastname().equals("Ramani")) {
			System.out.println("setIncorrectLastnameTest : Pass");
		}else {
			System.out.println("setIncorrectLastnameTest : Fail");
		}
	}
	
	public void getEmailTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		if(u.getEmail().equals("jay@dal.ca")) {
			System.out.println("getEmailTest : Pass");
		}else {
			System.out.println("getEmailTest : Fail");
		}
	}
	
	public void setEmailTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setEmail("xyz@dal.ca");
		if(u.getEmail().equals("xyz@dal.ca")) {
			System.out.println("setEmailTest : Pass");
		}else {
			System.out.println("setEmailTest : Fail");
		}
	}
	
	public void setIncorrectEmailTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setEmail("");
		if(u.getEmail().equals("jay@dal.ca")) {
			System.out.println("setIncorrectEmailTest : Pass");
		}else {
			System.out.println("setIncorrectEmailTest : Fail");
		}
	}
	
	public void getPasswordTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		if(u.getPassword().equals("123")) {
			System.out.println("getPasswordTest : Pass");
		}else {
			System.out.println("getPasswordTest : Fail");
		}
	}
	
	public void setPasswordTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setEmail("123");
		if(u.getPassword().equals("123")) {
			System.out.println("setPasswordTest : Pass");
		}else {
			System.out.println("setPasswordTest : Fail");
		}
	}
	
	public void setIncorrectPasswordTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		u.setEmail("");
		if(u.getPassword().equals("123")) {
			System.out.println("setPasswordTest : Pass");
		}else {
			System.out.println("setPasswordTest : Fail");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
