import java.util.*;

public class Classes
	{
		static ArrayList<Student> periodOneAlgebra = new ArrayList<Student>();
		static ArrayList<Student> periodTwoAlgebra = new ArrayList<Student>();
		static ArrayList<Student> periodThreeAlgebra = new ArrayList<Student>();
		static ArrayList<Student> periodOneBiology = new ArrayList<Student>();
		static ArrayList<Student> periodTwoBiology = new ArrayList<Student>();
		static ArrayList<Student> periodThreeBiology = new ArrayList<Student>();
		static ArrayList<Student> periodOneEnglish = new ArrayList<Student>();
		static ArrayList<Student> periodTwoEnglish = new ArrayList<Student>();
		static ArrayList<Student> periodThreeEnglish = new ArrayList<Student>();
		private static Scanner intGetter = new Scanner(System.in);
		private static int displayClassChoice;
		private static int classType;

		public static void fillAuxLists()
			{
				periodOneAlgebra.clear();
				periodTwoAlgebra.clear();
				periodThreeAlgebra.clear();
				periodOneBiology.clear();
				periodTwoBiology.clear();
				periodThreeBiology.clear();
				periodOneEnglish.clear();
				periodTwoEnglish.clear();
				periodThreeEnglish.clear();
				for (int i = 0; i < RunSIS.StudentList.size(); i++)
					{
						if (RunSIS.StudentList.get(i).getFirstPeriod().equals("Algebra"))
							{
								periodOneAlgebra.add(RunSIS.StudentList.get(i));
							} else if (RunSIS.StudentList.get(i).getFirstPeriod().equals("Biology"))
							{
								periodOneBiology.add(RunSIS.StudentList.get(i));
							} else
							{
								periodOneEnglish.add(RunSIS.StudentList.get(i));
							}
						if (RunSIS.StudentList.get(i).getSecondPeriod().equals("Algebra"))
							{
								periodTwoAlgebra.add(RunSIS.StudentList.get(i));
							} else if (RunSIS.StudentList.get(i).getSecondPeriod().equals("Biology"))
							{
								periodTwoBiology.add(RunSIS.StudentList.get(i));
							} else
							{
								periodTwoEnglish.add(RunSIS.StudentList.get(i));
							}
						if (RunSIS.StudentList.get(i).getThirdPeriod().equals("Algebra"))
							{
								periodThreeAlgebra.add(RunSIS.StudentList.get(i));
							} else if (RunSIS.StudentList.get(i).getThirdPeriod().equals("Biology"))
							{
								periodThreeBiology.add(RunSIS.StudentList.get(i));
							} else
							{
								periodThreeEnglish.add(RunSIS.StudentList.get(i));
							}
					}
			}

		public static void printAClass()
			{
				System.out.println("What is the period  of the class you want displayed?");
				displayClassChoice = intGetter.nextInt();
				System.out.println("What is the type of class you want displayed?\n1) Algebra\n2) Biology\n3) English");
				classType = intGetter.nextInt();
				printList(classListGetter(displayClassChoice, classType));

			}

		public static ArrayList<Student> classListGetter(int p, int t)
			{
				fillAuxLists();
				if (p == 1)
					{
						if (t == 1)
							{
								return periodOneAlgebra;
							} else if (t == 2)
							{
								return periodOneBiology;
							} else
							{
								return periodOneEnglish;
							}
					} else if (p == 2)
					{
						if (t == 1)
							{
								return periodTwoAlgebra;
							} else if (t == 2)
							{
								return periodTwoBiology;
							} else
							{
								return periodTwoEnglish;
							}
					} else
					{
						if (t == 1)
							{
								return periodThreeAlgebra;
							} else if (t == 2)
							{
								return periodThreeBiology;
							} else
							{
								return periodThreeEnglish;
							}
					}

			}

		public static void printList(ArrayList<Student> sl)
			{
				for (Student s : sl)
					{
						System.out.println(s.getLastName() + ", " + s.getFirstName());
					}
			}
	}
