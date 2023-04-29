public class Courses {

	protected int courseId,price; 
	protected double rating;
	protected String instructerName,courseTitle;
	
	public Courses(int courseId,String courseTitle,String instructerName,double rating, int price) {
		super();
		this.courseTitle=courseTitle;
		this.courseId = courseId;
		this.price = price;
		this.rating = rating;
		this.instructerName = instructerName;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		if(courseTitle.equals("")) {
			return;
		}
		this.courseTitle = courseTitle;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		if(courseId<=0) {
			return;
		}
		this.courseId = courseId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0) {
			return;
		}
		this.price = price;
	}

	public double getRating() {
		return rating;
	}
	public void setRating(float rating) {
		if(rating<0) {
			return;
		}
		this.rating = rating;
	}

	public String getInstructerName() {
		return instructerName;
	}

	public void setInstructerName(String instructerName) {
		if(instructerName.equals("")) {
			return;
		}
		this.instructerName = instructerName;
	}
}

