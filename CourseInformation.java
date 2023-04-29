import java.util.ArrayList;
public class CourseInformation {
	
       ArrayList<Courses> coursesInfo = new ArrayList<>();

	    public CourseInformation() {
	        addData();
	    }

	    private void addData() {

	        coursesInfo.add(new Courses(1,"Learn C from Basic to Advance","Stuart",4.2,399));
	        coursesInfo.add(new Courses(2,"Learn C++: The Complete Course for Beginners","Steve",4.7,499));
	        coursesInfo.add(new Courses(3,"Learn Java - Coding for All Levels","James",4.1,299));
	        coursesInfo.add(new Courses(4,"Learn Python - Learn by Doing","Kane",4.5,349));
	        coursesInfo.add(new Courses(5,"Learn HTML & CSS Correctly","Richard",4.0,199));
	        coursesInfo.add(new Courses(6,"6-Week JavaScript Course","Smith",4.3,249));
	        coursesInfo.add(new Courses(7,"The Complete SQL Bootcamp","Williams",4.9,299));
	    }
	    
	    public void addCourse(String courseTitle, int price, String firstname) {
	    	coursesInfo.add(new Courses(coursesInfo.size()+1,courseTitle,firstname,0,price));
	    }
	    
	    public boolean deleteCourse(int id) {
	    	Courses c = findCourse(id);
	    	if(c==null) {
	    		return false;
	    	}else {
	    		coursesInfo.remove(id-1);
	    		return true;
	    	}
	    }
	    
	    public Courses findCourse(int id) {
	    	for(Courses c : coursesInfo) {
	    		if(c.getCourseId()==id) {
	    			return c;
	    		}
	    	}
	    	return null;
	    }
	    
	    public ArrayList<Courses> getCourses(){
	    	return coursesInfo;
	    }
	}


  