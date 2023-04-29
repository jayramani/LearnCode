
public class CourseinformationTest {
	
	public void addCourseTest() {
		CourseInformation c = new CourseInformation();
		c.addCourse("Learn React", 199, "Mark");
		
		Courses course = c.findCourse(8);
		
		if(course.getCourseTitle().equals("Learn React")) {
			System.out.println("addCourseTest: Pass");
		}else {
			System.out.println("addCourseTest: Fail");
		}
	}
	
	public void deleteCourseSuccessTest() {
		CourseInformation c = new CourseInformation();
		boolean result = c.deleteCourse(1);
		if(result) {
			System.out.println("deleteCourseSuccessTest: Pass");
		}else {
			System.out.println("deleteCourseSuccessTest: Fail");
		}
	}
	
	public void deleteCourseFailTest() {
		CourseInformation c = new CourseInformation();
		boolean result = c.deleteCourse(10);
		if(result==false) {
			System.out.println("deleteCourseFailTest: Pass");
		}else {
			System.out.println("deleteCourseFailTest: Fail");
		}
	}

	public void findCourseSuccessTest() {
		CourseInformation c = new CourseInformation();
		Courses cr = c.findCourse(1);
		if(cr!=null && cr.getCourseTitle().equals("Learn C from Basic to Advance")) {
			System.out.println("findCourseSuccessTest: Pass");
		}else {
			System.out.println("findCourseSuccessTest: Fail");
		}
	}	
	
	public void findCourseFailTest() {
		CourseInformation c = new CourseInformation();
		Courses cr = c.findCourse(10);
		if(cr==null) {
			System.out.println("findCourseFailTest: Pass");
		}else {
			System.out.println("findCourseFailTest: Fail");
		}
	}
}
