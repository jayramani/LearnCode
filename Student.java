import java.util.ArrayList;

public class Student extends User{
	
	private String emailLogIn,passwordLogIn;
	private int balance;
	CourseInformation c = new CourseInformation();
	
    ArrayList<String> coursesBought = new ArrayList<>();
	
	public Student(String firstname, String last_name,String email,String password,int balance) {
		super(firstname,last_name,email,password);
		this.balance=balance;
	}
	
	public Student(String emailLogIn, String passwordLogIn) {
		super();
		this.emailLogIn = emailLogIn;
		this.passwordLogIn = passwordLogIn;
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance<0) {
			return;
		}
		this.balance = balance;
	}

	public boolean studentLogInmethod(User user) {
		if(user.getEmail().equals(emailLogIn) && user.getPassword().equals(passwordLogIn)){
			return true;
		}
		else {
			return false;	
		}
	}
	
	public String showCourseInfo(int choice) {		
		return "Course Title : " + c.coursesInfo.get(choice-1).getCourseTitle() + "\nCourse ID: " + c.coursesInfo.get(choice-1).getCourseId() + "\nCourse Instructer: " + c.coursesInfo.get(choice-1).getInstructerName() + "\nCourse Rating:" + c.coursesInfo.get(choice-1).getRating() + "\nCourse Price:"+c.coursesInfo.get(choice-1).getPrice();
	}
	
	public boolean payForCourse(int n) {
		if(c.coursesInfo.get(n-1).getPrice()>getBalance()) {
			return false;
		}
		return true;
	}	
	
	public boolean addBalance(int amount,int course_number) {
		boolean balanceCheck;
		
		setBalance(this.balance+amount);
	
		if(getBalance()<c.coursesInfo.get(course_number-1).getPrice()) {
			balanceCheck=true;
		}else {
			balanceCheck=false;
		}
		return balanceCheck;
	}
	
	public String makePayment(int course_number) {
		setBalance(this.balance-c.coursesInfo.get(course_number-1).getPrice());
		return "You have successfully purchased "+ c.coursesInfo.get(course_number-1).getCourseTitle() + "\nYour current balance is " + getBalance();
	}
	
	public boolean addCourseToList(int id) {
		if(c.coursesInfo.size()>=id) {
			coursesBought.add(c.coursesInfo.get(id-1).getCourseTitle());
			return true;
	    }else {
	    	return false;
	    }
   }
	 public ArrayList<String> getaddedCourseList(){
	    	return coursesBought;
    }

}



























