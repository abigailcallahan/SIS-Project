import java.util.*;

public class Grades
	{
		private static String lFName;
		private static String sFName;
		private static String flFName;
		private static String flLName;
		private static int sIndex;
		private static Scanner stringGetter = new Scanner(System.in);
		private static Scanner intGetter = new Scanner(System.in);
		private static String className;
		private static String newGrade;

		public static int studentIndexGetter()
			{
				System.out.println("What is the first name of the student who you want to select?");
				sFName = stringGetter.nextLine();
				System.out.println("What is the last name of the student who you want to select?");
				lFName = stringGetter.nextLine();
				for (int i = 0; i < RunSIS.StudentList.size(); i++)
					{
						flFName = RunSIS.StudentList.get(i).getFirstName();
						flLName = RunSIS.StudentList.get(i).getLastName();
						if (flFName.equals(flFName) && flLName.equals(flLName))
							{
								return i;
							}
					}
				return 0;
			}
		public static void changeClasses() {
			sIndex = studentIndexGetter();
			System.out.println("Do you want so switch (2) two classes or (3) change all three?");
		}
		private static void changeTwoClasses(int sI) {
			
		}
		public static void changeGrade()
			{
				sIndex = studentIndexGetter();
				System.out.println(RunSIS.StudentList.get(sIndex).getSecondPeriod() + " "
						+ RunSIS.StudentList.get(sIndex).getSecondGrade());
				System.out.println(RunSIS.StudentList.get(sIndex).getThirdPeriod() + " "
						+ RunSIS.StudentList.get(sIndex).getThirdGrade());
				System.out.println(RunSIS.StudentList.get(sIndex).getFirstPeriod() + " "
						+ RunSIS.StudentList.get(sIndex).getFirstGrade()
						+ "\nWhich grade do you want to change?\nPlease enter the name of the class (case insensitive)\n");

				className = stringGetter.nextLine();
				System.out.println("What do you want the grade to be?");
				newGrade = stringGetter.nextLine();
				if (className.equalsIgnoreCase(RunSIS.StudentList.get(sIndex).getSecondPeriod()))
					{
						RunSIS.StudentList.get(sIndex).setSecondGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getSecondGrade()+" in "+RunSIS.StudentList.get(sIndex).getSecondPeriod());
					} else if (className.equalsIgnoreCase(RunSIS.StudentList.get(sIndex).getFirstPeriod()))
					{
						RunSIS.StudentList.get(sIndex).setFirstGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getFirstGrade()+" in "+RunSIS.StudentList.get(sIndex).getFirstPeriod());
					} else if (className.equalsIgnoreCase(RunSIS.StudentList.get(sIndex).getThirdPeriod()))
					{
						RunSIS.StudentList.get(sIndex).setThirdGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getThirdGrade()+" in "+RunSIS.StudentList.get(sIndex).getThirdPeriod());
					}
				// It needs an update GPA method to be called here
			}
	}
