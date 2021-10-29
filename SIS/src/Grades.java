import java.util.*;
public class Grades
	{
		private static String lFName;
		private static String sFName;
		private static String flFName;
		private static String flLName;
		private static int sIndex;
		private static Scanner stringGetter = new Scanner(System.in);
		public static int studentIndexGetter() {
			System.out.println("What is the first name of the student whose grade you want to change?");
			sFName = stringGetter.nextLine();
			System.out.println("What is the last name of the student whose grade you want to change?");
			lFName = stringGetter.nextLine();
			for (int i =0; i<RunSIS.StudentList.length();i++) {
				flFName = RunSIS.StudentList.get(i).getFirstName();
				flLName = RunSIS.StudentList.get(i).getLastName();
				if(flFName.equals(flFName)&&flLName.equals(flLName)) {
					return i;
				}
			}
		}
		public static void changeGrade() {
			sIndex = studentIndexGetter();
			System.out.println("Which grade do you want to change?\n"+StudentList.get(sIndex).getFirstPeriod()+" "+StudentList.get(sIndex).getFirstGrade());
			System.out.println(StudentList.get(sIndex).getSecondPeriod()+" "+StudentList.get(sIndex).getSecondGrade());
			System.out.println(StudentList.get(sIndex).getThirdPeriod()+" "+StudentList.get(sIndex).getThirdGrade());
			
		}
	}
