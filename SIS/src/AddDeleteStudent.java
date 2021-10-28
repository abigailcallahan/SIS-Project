import java.util.Scanner;

public class AddDeleteStudent
	{
		static Scanner input = new Scanner(System.in);
		static int answer;
		static String first;
		static String last;
		static int firstP;
		static int secondP;
		static int thirdP;
		static String firstG;
		static String secondG;
		static String thirdG;

		
		public static void main(String[] args)
			{
				System.out.println("Would you like to: ");
				System.out.println("1) Add a Student");
				System.out.println("2) Delete a Student");
				System.out.println("3) Go back to Main Menu");
				answer = input.nextInt();
				if(answer == 1)
					{
						System.out.println("What is the first name of your new student");
						first = input.nextLine();
						//put name into array list
						System.out.println("Last Name?");
						last = input.nextLine();
						//last name into arraylist
						System.out.println("Ok, so far we have " + first + " " + last);
						
						
//						System.out.println("First Period Class? Your options are: ");
//						System.out.println("\t1) Biology\n\t2) English\n\t3) Algebra");
//						firstP = input.nextInt();
//						
//						if(firstP == 1)
//							{
//								//fill array
//								System.out.println("What about second period?");
//								System.out.println("\t1) English\n\t2) Algebra");
//								secondP = input.nextInt();
//								if(secondP == 1)
//									{
//										//fill array
//										//fill array with automatic third period
//										//display all classes
//									}
//								else if(secondP == 2)
//									{
//										//fill array
//										//fill array with automatic third period
//										//display all classes
//									}
//							}
//						
//						else if(firstP == 2)
//							{
//								//fill array
//								System.out.println("What about second period?");
//								System.out.println("\t1) Biology\n\t2) Algebra");
//								secondP = input.nextInt();
//								if(secondP == 1)
//									{
//										//fill array
//										//fill array with automatic third period
//										//display all classes
//									}
//								else if(secondP == 2)
//									{
//										//fill array
//										//fill array with automatic third period
//										//display all classes
//									}
//							}
//						
//						else if(firstP == 3)
//							{
//								//fill array
//								System.out.println("What about second period?");
//								System.out.println("\t1) Biology\n\t2) English");
//								secondP = input.nextInt();
//								if(secondP == 1)
//									{
//										//fill array
//										//fill array with automatic third period
//										//display all classes
//									}
//								else if(secondP == 2)
//									{
//										//fill array
//										//fill array with automatic third period
//										//display all classes
//									}
//							}
//						else
//							{
//								System.out.println("You did not enter a valid answer, you will restart.");
//							}
					}
				

				//ask if they want to 
				//1)add or 2) delete 3) go 
				
				//IF THEY PICK ADD
					//get new name
					//get new GPA
					//figure out the order of periods
				//IF THEY PICK DELETE
					//display the students
					//ask which student they would like to delete
					//delete name based on input
					//display new names

			}

	}
