import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner sc  = new Scanner(System.in);
	    CourseInformation c = new CourseInformation();
	    UserDbMock uDb = new UserDbMock();
		Student studentLogIn;
		Instructor instuctorLogIn;
		
		if(args.length==0) {
					
	    	System.out.println("Here we are teaching the programming languages");
		    	
			    System.out.println("Please sign up here...");
			    
		    		System.out.println("Enter First Name:");
    	    		String first_name = sc.nextLine();
		    		
		    		System.out.println("Enter Last Name:");
		    		String last_name = sc.nextLine();
		    		
		    		System.out.println("Enter Email:");
		    		String email = sc.nextLine();
		    		
		    		System.out.println("Set Password");
		    		String password = sc.nextLine();
		    		
		    		System.out.println("Thank you for registering with us...\nPlease Log in Now");		    		
		    		System.out.println("\n----------------------------------------------------------------------------------------------\n");
				    User u =  new User(first_name,last_name,email,password);

					boolean input;

				    do {
						System.out.println("Do you want to LogIn as a Student or Instructor\nEnter your choice. 1.Student 2.Instructor");

						int choice = sc.nextInt();
						sc.nextLine();
						switch (choice) {
							case 1:

								boolean do_again;
								do {
									System.out.println("Enter Email:");
									String emailLogInStudent = sc.nextLine();

									System.out.println("Enter Password");
									String passwordLogInStudent = sc.nextLine();

									studentLogIn = new Student(emailLogInStudent, passwordLogInStudent);

									if (studentLogIn.studentLogInmethod(u)) {
										System.out.println("LogIn Successful");
										do_again = false;
									} else {
										System.out.println("LogIn Failed. Re-enter your credentials.");
										do_again = true;
									}
								} while (do_again);

								String s;
								int course_number = 0;
								String confirmation;

								int entered_choice;

								do {
									System.out.println("\nPress 1 to See the List of Courses\nPress 2 to explore any course\nPress 3 to buy any course\nPress 4 to see the list of the courses you have bought\nPress 5 to check your current account balance\nPress 6 to exit");
									entered_choice = sc.nextInt();

									switch (entered_choice) {
										case 1:
											System.out.println("\nHere is the list of the courses.");

											for (int i = 0; i < c.getCourses().size(); i++) {
												System.out.println((i + 1) + " " + c.getCourses().get(i).getCourseTitle());
											}
											break;

										case 2:
											System.out.println("Select the course you want to explore from above list");
											course_number = sc.nextInt();
											System.out.println(studentLogIn.showCourseInfo(course_number));
											System.out.println("\n");
											break;

										case 3:
											System.out.println("Select the course you want to buy from above list");

											course_number = sc.nextInt();
											System.out.println("\nYour current balance is: " + studentLogIn.getBalance());

											if (!studentLogIn.payForCourse(course_number)) {
												System.out.println("\nYou  don't have enough balance. You need to have minimum $" + c.coursesInfo.get(course_number - 1).getPrice() + " to purchase this course. " + "Amount you need to add is $" + (c.coursesInfo.get(course_number - 1).getPrice() - studentLogIn.getBalance()));
											}

											System.out.println("Add balance to your account.");

											System.out.println("Enter Card Number. It must be of 8 digit ");
											sc.nextLine();
											String card_number;
											do {
												card_number = sc.nextLine();
											} while (card_number.length() < 8 || card_number.length() > 8);

											System.out.println("Enter cvv:");
											int cvv = sc.nextInt();

											int amount;

											do {
												System.out.println("$" + (c.coursesInfo.get(course_number - 1).getPrice() - studentLogIn.getBalance()) + " is required to add.");
												System.out.println("Enter the amount need to be added: ");
												sc.nextLine();
												amount = sc.nextInt();
											} while (studentLogIn.addBalance(amount, course_number));

											System.out.println("You have enough balance. Now confirm that would you like to proceed with the purchse or not.\nEnter Yes or No for the confirmation");

											sc.nextLine();
											do {
												confirmation = sc.nextLine();

												if (!confirmation.toLowerCase().equals("yes") && !confirmation.toLowerCase().equals("no")) {
													System.out.println("Enter only Yes or No");
												} else {

													if (confirmation.toLowerCase().equals("yes")) {
														System.out.println(studentLogIn.makePayment(course_number));
														studentLogIn.addCourseToList(course_number);
														break;
													} else {
														break;
													}
												}
											} while (!confirmation.toLowerCase().equals("yes") && !confirmation.toLowerCase().equals("no"));


											break;

										case 4:

											if (studentLogIn.getaddedCourseList().size() == 0) {
												System.out.println("You dont have any courses to learn.");
											} else {

												for (int i = 0; i < studentLogIn.getaddedCourseList().size(); i++) {
													System.out.println((i + 1) + " " + studentLogIn.getaddedCourseList().get(i));
												}
											}
											break;

										case 5:
											System.out.println("Your current balance is: " + studentLogIn.getBalance());
											break;
									}
								} while (entered_choice != 6);
								input = false;
								break;

							case 2:
								boolean do_again_;
								do {
									System.out.println("Enter Email:");
									String emailLogInInstructor = sc.nextLine();

									System.out.println("Enter Password");
									String passwordLogInInstructor = sc.nextLine();

									instuctorLogIn = new Instructor(emailLogInInstructor, passwordLogInInstructor);

									if (instuctorLogIn.instuctorLogInmethod(u)) {
										System.out.println("LogIn Succsessful");
										do_again_ = false;
									} else {
										System.out.println("LogIn Failed. Reenter your credentials.");
										do_again_ = true;
									}
								} while (do_again_);

								System.out.println("\nHere is the list of the courses.");

								for (int i = 0; i < c.getCourses().size(); i++) {
									System.out.println((i + 1) + " " + c.getCourses().get(i).getCourseTitle());
								}
								int value;
								do {
									System.out.println("\nPress 1 to Add course\nPress 2 to delete course\nPress 3 to see the course list\nPress 4 to exit");
									value = sc.nextInt();

									switch (value) {
										case 1:
											System.out.println("Enter title of your course:");
											sc.nextLine();
											String courseTitle = sc.nextLine();

											System.out.println("Enter price of your course: ");
											int coursePrice = sc.nextInt();

											if (instuctorLogIn.addCourse(courseTitle, coursePrice, c)) {
												System.out.println("Course added successfully");
											} else {
												System.out.println("Enter details correctly.");
											}
											break;

										case 2:

											System.out.println("Enter id of course you want to delete: ");
											int id = sc.nextInt();

											if (instuctorLogIn.deleteCourse(id, c)) {
												System.out.println("Course Deleted");
											} else {
												System.out.println("No Course found with ID you entered.");
											}
											break;

										case 3:

											for (int i = 0; i < c.getCourses().size(); i++) {
												System.out.println((i + 1) + " " + c.getCourses().get(i).getCourseTitle());
											}
											break;

										case 4:
											break;
									}
								} while (value != 4);
								input = false;
								break;

							default:
								System.out.println("Please enter valid input. 1 or 2");
								input = true;
						}


					}while (input) ;
		}else if(args[0].toLowerCase().equals("test")) {
			UserTest ut = new UserTest();
            System.out.println("\n========== Testing User Class Methods ==========");
			ut.userSignUpSuccessTest();
			ut.userSignUpEmptyFieldest();
			ut.userLoginSuccessTest();
			ut.userLoginincorrectDataTest();
			ut.getFirstnameTest();
			ut.setFirstnameTest();
			ut.setIncorrectFirstnameTest();
			ut.getLastnameTest();
			ut.setLastnameTest();
			ut.setIncorrectLastnameTest();
			ut.getEmailTest();
			ut.setEmailTest();
			ut.setIncorrectEmailTest();
			ut.getPasswordTest();
			ut.setPasswordTest();
			ut.setIncorrectPasswordTest();
            System.out.println("\n========== Testing Student class Methods ==========");
			StudentTest st = new StudentTest();
			st.studentLogInSuccessTest();
			st.studentLogInFailTest();
			st.getBalanceTest();
			st.setBalanceTest();
			st.setNegativeBalanceTest();
			st.addLessBalanceTest();
			st.addMoreBalanceTest();
			st.payForCourseInsufficientBalanceTest();
			st.payForCourseSuccessTest();
			st.getaddedCourseListTest();
			st.addCourseToListSuccessTest();
			st.addCourseToListincorrectIdTest();
            System.out.println("\n========== Testing Course class Methods ==========");
			CoursesTest ct = new CoursesTest();
			ct.getCourseTitleTest();
			ct.setCourseTitleTest();
			ct.setIncorrectCourseTitleTest();
			ct.getCourseIdTest();
			ct.setCourseIdTest();
			ct.setIncorrectCourseIdTest();
			ct.getPriceTest();
			ct.setPriceTest();
			ct.setIncorrectPriceTest();
			ct.getRatingTest();
			ct.setRatingTest();
			ct.setIncorrectRatingTest();
			ct.getInstructerNameTest();
			ct.setInstructerNameTest();
			ct.setIncorrectInstructerNameTest();
            System.out.println("\n========== Testing Courseinformation class Methods ==========");
			CourseinformationTest cit = new CourseinformationTest();
			cit.addCourseTest();
			cit.deleteCourseSuccessTest();
			cit.deleteCourseFailTest();
			cit.findCourseSuccessTest();
			cit.findCourseFailTest();
            System.out.println("\n========== Testing Instructor class Methods ==========");
			InstructorTest it = new InstructorTest();
			it.instuctorLogInSuccessTest();
			it.instuctorLogInFailTest();
			it.addCourseSuccessTest();
			it.addCourseFailTest();
			it.deleteCourseSuccessTest();
			it.deleteCourseFailTest();
		}
	}
}
