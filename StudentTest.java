import java.util.ArrayList;

public class StudentTest {
	
	public void studentLogInSuccessTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		Student s = new Student("jay@dal.ca","123");
		boolean result = s.studentLogInmethod(u);
		
		if(result) {
			System.out.println("studentLogInSuccessTest : Pass");
		}else {
			System.out.println("studentLogInSuccessTest : Fail");
		}
	}
	
	public void studentLogInFailTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		Student s = new Student("jay@dal.ca","456");
		boolean result = s.studentLogInmethod(u);
		
		if(result==false) {
			System.out.println("studentLogInFailTest : Pass");
		}else {
			System.out.println("studentLogInFailTest : Fail");
		}
	}
	
	public void getBalanceTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",0);
		if(s.getBalance()==0) {
			System.out.println("getBalanceTest : Pass");
		}else {
			System.out.println("getBalanceTest : Fail");
		}
	}
	
	public void setBalanceTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",0);
		s.setBalance(0);
		if(s.getBalance()==0) {
			System.out.println("setBalanceTest : Pass");
		}else {
			System.out.println("setBalanceTest : Fail");
		}
	}
	
	public void setNegativeBalanceTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",0);
		s.setBalance(-100);
		if(s.getBalance()==0) {
			System.out.println("setNegativeBalanceTest : Pass");
		}else {
			System.out.println("setNegativeBalanceTest : Fail");
		}
	}
	
	public void addLessBalanceTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",300);
		boolean result;
		result = s.addBalance(50, 1);
		
		if(result==true) {
			System.out.println("addLessBalanceTest : Pass");

		}else {
			System.out.println("addLessBalanceTest : Fail");
		}
	}
	
	public void addMoreBalanceTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",300);
		boolean result;
		result = s.addBalance(100, 1);
		
		if(result==false) {
			System.out.println("addMoreBalanceTest : Pass");

		}else {
			System.out.println("addMoreBalanceTest : Fail");
		}
	}
	
	public void payForCourseInsufficientBalanceTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",300);
		boolean result=s.payForCourse(1);
		
		if(result==false) {
			System.out.println("payForCourseInsufficientBalanceTest : Pass");
		}else {
			System.out.println("payForCourseInsufficientBalanceTest : Fail");
		}
	}
	
	public void payForCourseSuccessTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",400);
		boolean result=s.payForCourse(1);
		
		if(result) {
			System.out.println("payForCourseSuccessTest : Pass");
		}else {
			System.out.println("payForCourseSuccessTest : Fail");
		}
	}
	
	public void getaddedCourseListTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",400);

		ArrayList<String> expectedCourses = new ArrayList<String>();
		expectedCourses.add("Learn C from Basic to Advance");
		s.addCourseToList(1);
		ArrayList<String> actualCourses = s.getaddedCourseList();
			
		
		if(actualCourses.size() == expectedCourses.size() && actualCourses.get(0).equals(expectedCourses.get(0))) {
			System.out.println("getaddedCourseListTest : Pass");
		}else {
			System.out.println("getaddedCourseListTest : Fail");

		}
	}
	
	public void addCourseToListSuccessTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",400);
		boolean result = s.addCourseToList(1);
		
		if(result && s.getaddedCourseList().get(0).equals("Learn C from Basic to Advance")) {
			System.out.println("addCourseToListSuccessTest : Pass");
		}else {
			System.out.println("addCourseToListSuccessTest : Fail");
		}
	}
	
	public void addCourseToListincorrectIdTest() {
		Student s = new Student("Jay","Ramani","jay@dal.ca","123",400);
		boolean result = s.addCourseToList(10);
		
		if(result==false) {
			System.out.println("addCourseToListincorrectIdTest : Pass");
		}else {
			System.out.println("addCourseToListincorrectIdTest : Fail");
		}
	}
}
