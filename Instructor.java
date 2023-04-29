
public class Instructor extends User{
	private String emailLogIn,passwordLogIn;
	
	public Instructor(String emailLogIn, String passwordLogIn) {
		super();
		this.emailLogIn = emailLogIn;
		this.passwordLogIn = passwordLogIn;	}

	public Instructor(String firstname, String lastname, String email, String password) {
		super(firstname, lastname, email, password);
	}

	public boolean instuctorLogInmethod(User user) {

		if(user.getEmail().equals(this.emailLogIn) && user.getPassword().equals(this.passwordLogIn)){
			return true;
			}
		else {
			return false;
		}
	}
	
	public boolean addCourse(String courseTitle,int price,CourseInformation c) {
		if(courseTitle.equals("") || price<=0) {
		    return false;
		}else {
			c.addCourse(courseTitle,price,firstname);
			return true;
		}
	}
	
	public boolean deleteCourse(int id, CourseInformation c) {
		if(c.deleteCourse(id)) {
			return true;
		}else {
			return false;
		}
	}	
}
//coursesInfo.add(new Courses(7,"The Complete SQL Bootcamp","Williams",4.9,299));