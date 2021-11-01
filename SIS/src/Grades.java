import java.util.*;

public class Grades
	{
		private static String lFName;
		private static String sFName;
		private static String forlFName;
		private static String forlLName;
		private static int sIndex;
		private static Scanner stringGetter = new Scanner(System.in);
		private static Scanner intGetter = new Scanner(System.in);
		private static String className;
		private static String newGrade;
		private static int classSizeChoice;
		private static int classOneChoice;
		private static int classTwoChoice;
		private static String tempClassStorage;
		public static int studentIndexGetter()
			{
				System.out.println("What is the first name of the student who you want to select?");
				sFName = stringGetter.nextLine();
				System.out.println("What is the last name of the student who you want to select?");
				lFName = stringGetter.nextLine();
				for (int i = 0; i < RunSIS.StudentList.size(); i++)
					{
						forlFName = RunSIS.StudentList.get(i).getFirstName();
						forlLName = RunSIS.StudentList.get(i).getLastName();
						if (forlFName.equals(sFName) && forlLName.equals(lFName))
							{
								return i;
							}
					}
				return 0;
			}

		public static void changeClasses()
			{
				sIndex = studentIndexGetter();
				System.out.println("Do you want so switch (2) two classes or (3) change all three?");
				classSizeChoice = intGetter.nextInt();
				if (classSizeChoice == 2)
					{
						changeTwoClasses(sIndex);
					} else
					{
						System.out.println("What do you want the first period class to be?");
						classSelections();
						
					}
			}

		private static void classSelections()
			{
				boolean oneNotUsed = true;
				boolean twoNotUsed = true;
				boolean threeNotUsed = true;
				for (int i = 0; i < 3; i++)
					{
						if (oneNotUsed && i == 1)
							{
								oneNotUsed = false;
								System.out.print("Algebra");
							} else if (twoNotUsed && i == 2)
							{
								twoNotUsed = false;
								System.out.print("English");
							} else if (threeNotUsed && i == 3)
							{
								threeNotUsed = false;
								System.out.print("Biology");
							}
						if(i==0||i==1) {
							System.out.println(" or ");
						}
					}
			}

		private static void changeTwoClasses(int sI)
			{	
				System.out.println(RunSIS.StudentList.get(sI).getFirstName()+"'s first period class is "+RunSIS.StudentList.get(sI).getFirstPeriod());
				System.out.println(RunSIS.StudentList.get(sI).getFirstName()+"'s second period class is "+RunSIS.StudentList.get(sI).getSecondPeriod());
				System.out.println(RunSIS.StudentList.get(sI).getFirstName()+"'s third period class is "+RunSIS.StudentList.get(sI).getThirdPeriod());
				
				System.out.println("What period is the first class that you want to switch?");
				classOneChoice = intGetter.nextInt();
				System.out.println("Which is the second class that you want to switch?");
				classTwoChoice = intGetter.nextInt();
				tempClassStorage = classGetter(classOneChoice, sI);
				classSetter(classOneChoice, classGetter(classTwoChoice, sI), sI);
				classSetter(classTwoChoice, tempClassStorage, sI);
				
			}
		private static String classGetter(int period, int studentIndex) {
			if( period ==1) {
				return RunSIS.StudentList.get(studentIndex).getFirstPeriod();
			}else if (period ==2) {
				return RunSIS.StudentList.get(studentIndex).getSecondPeriod();
			}else {
				return RunSIS.StudentList.get(studentIndex).getThirdPeriod();
			}
			
		}
		private static void classSetter(int p, String cS, int studentIndex) {
			if( p ==1) {
				 RunSIS.StudentList.get(studentIndex).setFirstPeriod(cS);
			}else if (p ==2) {
				RunSIS.StudentList.get(studentIndex).setSecondPeriod(cS);
			}else {
				 RunSIS.StudentList.get(studentIndex).setThirdPeriod(cS);
			}
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
								+ RunSIS.StudentList.get(sIndex).getSecondGrade() + " in "
								+ RunSIS.StudentList.get(sIndex).getSecondPeriod());
					} else if (className.equalsIgnoreCase(RunSIS.StudentList.get(sIndex).getFirstPeriod()))
					{
						RunSIS.StudentList.get(sIndex).setFirstGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getFirstGrade() + " in "
								+ RunSIS.StudentList.get(sIndex).getFirstPeriod());
					} else if (className.equalsIgnoreCase(RunSIS.StudentList.get(sIndex).getThirdPeriod()))
					{
						RunSIS.StudentList.get(sIndex).setThirdGrade(newGrade);
						System.out.println(RunSIS.StudentList.get(sIndex).getFirstName() + " now has a "
								+ RunSIS.StudentList.get(sIndex).getThirdGrade() + " in "
								+ RunSIS.StudentList.get(sIndex).getThirdPeriod());
					}
				// It needs an update GPA method to be called here
			}
	}
