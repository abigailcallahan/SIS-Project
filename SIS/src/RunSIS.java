import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class RunSIS
	{
		// arraylist and variables
		// static ArrayList<Student>StudentList = new ArrayList<Student>();
		static String student;
		static ArrayList<Student> StudentList = new ArrayList<Student>();

		public static void main(String[] args) throws IOException
			{

				fillArrayList();
				displaySortingMenu();

			}

		public static void fillArrayList() throws IOException
			{
				// filling arraylist
				Scanner myFile = new Scanner(new File("StudentList.txt"));
				while (myFile.hasNext())
					{
						String tempArray = myFile.nextLine();
						String[] filler = tempArray.split(" ");
						StudentList.add(new Student(filler[0], filler[1], filler[2], filler[3], filler[4], filler[5],
								filler[6], filler[7]));
					}

			}

		public static void displaySortingMenu() throws IOException
			{
				// while loop to prevent stoppage
	
				while (true)
					{
						// printing out main menu
						Scanner userInt = new Scanner(System.in);
						System.out.println("\n\nWhat would you like to do?");
						System.out.println("1) add or delete a student");
						System.out.println("2) change student grades/schedule");
						System.out.println("3) sort students");
						System.out.println("4) print a class");
						System.out.println("5) exit");
						int userChoice = userInt.nextInt();
						if (userChoice == 1)
							{
								AddDeleteStudent.addDeleteStudent();
							} 
						else if (userChoice == 2)
							{
								Grades.gradesMenu();
							} 
						else if (userChoice == 3)
							{
								// Scanner for sorting
								Scanner userInput = new Scanner(System.in);
								// variable for scanner
								int menuChoice = userInput.nextInt();

								// if statement to cycle through sorting menu
								if (menuChoice == 1)
									{
										Collections.sort(StudentList, new LastNameSorter());
									} 
								else if (menuChoice == 2)
									{
										Collections.sort(StudentList, new GPASorter());
									} 
								else if (menuChoice == 3)
									{

									} 
								else
									{
										AddDeleteStudent.addStudent();
									}
							}
						else if (userChoice == 4)
							{
								// great for printing
								Classes.printAClass();
							} 
						else if (userChoice == 5)
							{
								// will end the program
								System.exit(0);
							}
					}
			}

		public static void displayPeriodSorter()
			{
				// printing out period menu
				System.out.println("Which period would you like to see?");
				System.out.println("/t(1)  period 1");
				System.out.println("/t(1)  period 2");
				System.out.println("/t(1)  period 3");

				// Scanner for sorting
				Scanner userInput = new Scanner(System.in);
				// variable for scanner
				int menuChoice = userInput.nextInt();

				// Collections.sort(Database.roster, new NameSorter());
			}
	}
