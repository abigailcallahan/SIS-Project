import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;


public class AddDeleteStudent
	{

		static Scanner intInput = new Scanner(System.in);
		static Scanner stringInput = new Scanner(System.in);
		static int answer;
		static String first;
		static String last;
		static int firstP;
		static int secondP;
		static int thirdP;
		static int firstG;
		static String secondG;
		static String thirdG;
		static String deleteFirst;
		static String deleteSecond;

		
		public static void main(String[] args) throws IOException
			{
				System.out.println("Would you like to: ");
				System.out.println("1) Add a Student");
				System.out.println("2) Delete a Student");
				System.out.println("3) Go back to Main Menu");
				answer = intInput.nextInt();
				if(answer == 1)
					{
						System.out.println("What is the first name of your new student");
						first = stringInput.nextLine();
						//put name into array list
						System.out.println("Last Name?");
						last = stringInput.nextLine();
						//last name into arraylist
						System.out.println("Ok, so far we have " + first + " " + last);
						
						
						System.out.println("First Period Class? Your options are: ");
						System.out.println("\t1) Biology\n\t2) English\n\t3) Algebra");
						firstP = intInput.nextInt();
						
						if(firstP == 1)
							{
								//fill array
								System.out.println("What grade will they have in Biology?");
								System.out.println("\t1) A+\n\t2) A\n\t3) A-\n\t4) B+ \n\t5) B\n\t6) B-\n\t7) C+\n\t8) C\n\t9) C-\n\t"
										+ "10) D+\n\t11) D\n\t12) D-\n\t13) F");
								firstG = intInput.nextInt();
								//set grade
								
								
								
								System.out.println("What about second period?");
								System.out.println("\t1) English\n\t2) Algebra");
								secondP = intInput.nextInt();
								if(secondP == 1)
									{
										//use setter 
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								else if(secondP == 2)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
							}
						
						else if(firstP == 2)
							{
								//fill array
								System.out.println("What about second period?");
								System.out.println("\t1) Biology\n\t2) Algebra");
								secondP = intInput.nextInt();
								if(secondP == 1)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								else if(secondP == 2)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
							}
						
						else if(firstP == 3)
							{
								//fill array
								System.out.println("What about second period?");
								System.out.println("\t1) Biology\n\t2) English");
								secondP = intInput.nextInt();
								if(secondP == 1)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
								else if(secondP == 2)
									{
										//fill array
										//fill array with automatic third period
										//display all classes
									}
							}
						else
							{
								System.out.println("You did not enter a valid answer, you will restart.");
							}
					}
				
				else if(answer == 2)
					{
						//display roster
						for(int i = 0; i < RunSIS.StudentList.size(); i++)
							{
								System.out.println(i + 1 + ") ");
								System.out.print(RunSIS.StudentList.get(i));
							}
						
						System.out.println("What is the first name of the student that you would you like to delete?");
						deleteFirst = stringInput.nextLine();
						System.out.println("What is the second name of the student you would like to delete?");
						deleteSecond = stringInput.nextLine();
						
						for(int i = 0; i < RunSIS.StudentList.size(); i++)
							{
								if(deleteFirst.equals(RunSIS.StudentList.get(i).getFirstName()) && deleteSecond.equals(RunSIS.StudentList.get(i).getLastName()))
									{
										RunSIS.StudentList.remove(i);
									}
								else
									{
										System.out.println("You did not enter a real students name, or you did not use correct "
												+ "capitalization, you will have to start over");
									}
							}
					}

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
