public class User {
	
	protected String firstname,lastname,email,password,emailLogIn,passwordLogIn;
	//Student s  = new Student();
	public User(String firstname, String lastname,String email,String password) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
		
		//System.out.println("user constructor"+this.email);
	}
	
public User() {
		// TODO Auto-generated constructor stub
	}

	//	public User(String email,String password) {	
//		emailLogIn=email;
//		passwordLogIn=password;
//	}
//	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		if(firstname.equals("")) {
			return;
		}
		this.firstname=firstname;
    }

	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		if(lastname.equals("")) {
			return;
		}
		this.lastname=lastname;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.equals("")) {
			return;
		}
		this.email=email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		if(password.equals("")) {
			return;
		}
		this.password=password;
	}
	
	public Iuserauthentication.AuthState userSignUp(Iuserauthentication iuserauth) {	
		return iuserauth.userSignUp(this);
	}
	
	public Iuserauthentication.LogInState userLogIn(Iuserauthentication iuserauth) {	
		return iuserauth.userLogIn(this);
	}
}
