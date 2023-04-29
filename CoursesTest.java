
public class CoursesTest {
	
	public void getCourseTitleTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		if(c.getCourseTitle().equals("Learn React")) {
			System.out.println("getCourseTitleTest : Pass");
		}else {
			System.out.println("getCourseTitleTest : Fail");
		}
	}
	
	public void setCourseTitleTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setCourseTitle("Learn Angular");
		if(c.getCourseTitle().equals("Learn Angular")) {
			System.out.println("setCourseTitleTest : Pass");
		}else {
			System.out.println("setCourseTitleTest : Fail");
		}
	}
	
	public void setIncorrectCourseTitleTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setCourseTitle("");
		if(c.getCourseTitle().equals("Learn React")) {
			System.out.println("setIncorrectCourseTitleTest : Pass");
		}else {
			System.out.println("setIncorrectCourseTitleTest : Fail");
		}
	}
	
	public void getCourseIdTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		if(c.getCourseId()==1) {
			System.out.println("getCourseIdTest : Pass");
		}else {
			System.out.println("getCourseIdTest : Fail");
		}
	}
	
	public void setCourseIdTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setCourseId(2);
		if(c.getCourseId()==2) {
			System.out.println("setCourseIdTest : Pass");
		}else {
			System.out.println("setCourseIdTest : Fail");
		}
	}
	
	public void setIncorrectCourseIdTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setCourseId(-2);
		if(c.getCourseId()==1) {
			System.out.println("setIncorrectCourseIdTest : Pass");
		}else {
			System.out.println("setIncorrectCourseIdTest : Fail");
		}
	}
	
	public void getPriceTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		if(c.getPrice()==199) {
			System.out.println("getPriceTest : Pass");
		}else {
			System.out.println("getPriceTest : Fail");
		}
	}
	
	public void setPriceTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setPrice(299);
		if(c.getPrice()==299) {
			System.out.println("setPriceTest : Pass");
		}else {
			System.out.println("setPriceTest : Fail");
		}
	}
	
	public void setIncorrectPriceTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setPrice(-100);
		if(c.getPrice()==199) {
			System.out.println("setIncorrectPriceTest : Pass");
		}else {
			System.out.println("setIncorrectPriceTest : Fail");
		}
	}
	
	public void getRatingTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		if(c.getRating()==4) {
			System.out.println("getRatingTest : Pass");
		}else {
			System.out.println("getRatingTest : Fail");
		}
	}
	
	public void setRatingTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setRating(3);
		if(c.getRating()==3) {
			System.out.println("setRatingTest : Pass");
		}else {
			System.out.println("setRatingTest : Fail");
		}
	}
	
	public void setIncorrectRatingTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setRating(-3);
		if(c.getRating()==4) {
			System.out.println("setIncorrectRatingTest : Pass");
		}else {
			System.out.println("setIncorrectRatingTest : Fail");
		}
	}
	
	public void getInstructerNameTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		if(c.getInstructerName().equals("Mark")) {
			System.out.println("getInstructerNameTest : Pass");
		}else {
			System.out.println("getInstructerNameTest : Fail");
		}
	}
	
	public void setInstructerNameTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setInstructerName("Tim");
		if(c.getInstructerName().equals("Tim")) {
			System.out.println("setInstructerNameTest : Pass");
		}else {
			System.out.println("setInstructerNameTest : Fail");
		}
	}
	
	public void setIncorrectInstructerNameTest() {
		Courses c = new Courses(1,"Learn React","Mark",4,199);
		c.setInstructerName("");
		if(c.getInstructerName().equals("Mark")) {
			System.out.println("setIncorrectInstructerNameTest : Pass");
		}else {
			System.out.println("setIncorrectInstructerNameTest : Fail");
		}
	}	
}
