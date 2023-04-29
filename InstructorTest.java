
public class InstructorTest {

	public void instuctorLogInSuccessTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		Instructor i = new Instructor("jay@dal.ca","123");
		boolean result = i.instuctorLogInmethod(u);
		
		if(result) {
			System.out.println("instuctorLogInSuccessTest : Pass");
		}else {
			System.out.println("instuctorLogInSuccessTest : Fail");
		}
	}
	
	public void instuctorLogInFailTest() {
		User u = new User("Jay","Ramani","jay@dal.ca","123");
		Instructor i = new Instructor("jay@dal.ca","456");
		boolean result = i.instuctorLogInmethod(u);
		
		if(result==false) {
			System.out.println("instuctorLogInFailTest : Pass");
		}else {
			System.out.println("instuctorLogInFailTest : Fail");
		}
	}
	
	
	
	public void addCourseSuccessTest() {
		Instructor i = new Instructor("Jay","Ramani","jay@dal.ca","123");
		CourseInformation c =new CourseInformation();
		boolean result = i.addCourse("Learn React",199, c);
	
		if(result) {
			System.out.println("addCourseSuccessTest : Pass");
		}else {
			System.out.println("addCourseSuccessTest : Fail");
		}
	}
	
	public void addCourseFailTest() {
		Instructor i = new Instructor("Jay","Ramani","jay@dal.ca","123");
		CourseInformation c =new CourseInformation();
		boolean result = i.addCourse("", 0, c);
	
		if(result==false) {
			System.out.println("addCourseFailTest : Pass");
		}else {
			System.out.println("addCourseFailTest : Fail");
		}
	}
	
	public void deleteCourseSuccessTest() {
		Instructor i = new Instructor("Jay","Ramani","jay@dal.ca","123");
		CourseInformation c =new CourseInformation();

		boolean result = i.deleteCourse(1, c);
		if(result) {
			System.out.println("deleteCourseSuccessTest : Pass");
		}else {
			System.out.println("deleteCourseSuccessTest : Fail");
		}
	}
	
	public void deleteCourseFailTest() {
		Instructor i = new Instructor("Jay","Ramani","jay@dal.ca","123");
		CourseInformation c =new CourseInformation();

		boolean result = i.deleteCourse(10, c);
		if(result==false) {
			System.out.println("deleteCourseSuccessTest : Pass");
		}else {
			System.out.println("deleteCourseSuccessTest : Fail");
		}
	}
	
}
