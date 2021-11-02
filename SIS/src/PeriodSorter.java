import java.util.Comparator;

public class PeriodSorter implements Comparator<Student>
	{
		public int compare (Student s1, Student s2)
		{
			if(RunSIS.classSortChoice == 1)
				return s1.getClassP1().compareTo(s2.getClassP1());
			else if(RunSIS.classSortChoice == 2)
				return s1.getClassP2().compareTo(s2.getClassP2());
			else 
				return s1.getClassP3().compareTo(s2.getClassP3());
		}
	}
