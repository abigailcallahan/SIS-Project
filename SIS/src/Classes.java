import java.util.*;
public class Classes
	{
		private static ArrayList<Student> periodOneAlgebra = new ArrayList<Student>();
		private static ArrayList<Student> periodTwoAlgebra = new ArrayList<Student>();
		private static ArrayList<Student> periodThreeAlgebra = new ArrayList<Student>();
		private static ArrayList<Student> periodOneBiology = new ArrayList<Student>();
		private static ArrayList<Student> periodTwoBiology = new ArrayList<Student>();
		private static ArrayList<Student> periodThreeBiology = new ArrayList<Student>();
		private static ArrayList<Student> periodOneEnglish = new ArrayList<Student>();
		private static ArrayList<Student> periodTwoEnglish = new ArrayList<Student>();
		private static ArrayList<Student> periodThreeEnglish= new ArrayList<Student>();
		public static void fillAuxLists() {
			for(int i = 0; i<RunSIS.StudentList.size();i++) {
				if(RunSIS.StudentList.get(i).getFirstPeriod().equals("Algebra")) {
					periodOneAlgebra.add(RunSIS.StudentList.get(i));
				}else if (RunSIS.StudentList.get(i).getFirstPeriod().equals("Biology")) {
					periodOneBiology.add(RunSIS.StudentList.get(i));
				}else {
					periodOneEnglish.add(RunSIS.StudentList.get(i));
				}
				if(RunSIS.StudentList.get(i).getSecondPeriod().equals("Algebra")) {
					periodTwoAlgebra.add(RunSIS.StudentList.get(i));
				}else if(RunSIS.StudentList.get(i).getSecondPeriod().equals("Biology")) {
					periodTwoBiology.add(RunSIS.StudentList.get(i));
				}else {
					periodTwoEnglish.add(RunSIS.StudentList.get(i));
				}
				if(RunSIS.StudentList.get(i).getThirdPeriod().equals("Algebra")) {
					periodThreeAlgebra.add(RunSIS.StudentList.get(i));
				}else if(RunSIS.StudentList.get(i).getThirdPeriod().equals("Biology")) {
					periodThreeBiology.add(RunSIS.StudentList.get(i));
				}else {
					periodThreeEnglish.add(RunSIS.StudentList.get(i));
				}
			}
		}
		
	}
