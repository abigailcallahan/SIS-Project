
public class Student
	{
		private String firstName;
		private String lastName;
		private String firstPeriod;
		private String secondPeriod;
		private String thirdPeriod;
		private String firstGrade;
		private String secondGrade;
		private String thirdGrade;
		
		public Student(String f, String l, String fp, String sp, String tp, String fg, String sg, String tg)
		{
			firstName = f;
			lastName = l;
			firstPeriod = fp;
			secondPeriod = sp;
			thirdPeriod = tp;
			firstGrade = fg;
			secondGrade = sg;
			thirdGrade = tg;
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public String getFirstPeriod()
			{
				return firstPeriod;
			}

		public void setFirstPeriod(String firstPeriod)
			{
				this.firstPeriod = firstPeriod;
			}

		public String getSecondPeriod()
			{
				return secondPeriod;
			}

		public void setSecondPeriod(String secondPeriod)
			{
				this.secondPeriod = secondPeriod;
			}

		public String getThirdPeriod()
			{
				return thirdPeriod;
			}

		public void setThirdPeriod(String thirdPeriod)
			{
				this.thirdPeriod = thirdPeriod;
			}

		public String getFirstGrade()
			{
				return firstGrade;
			}

		public void setFirstGrade(String firstGrade)
			{
				this.firstGrade = firstGrade;
			}

		public String getSecondGrade()
			{
				return secondGrade;
			}

		public void setSecondGrade(String secondGrade)
			{
				this.secondGrade = secondGrade;
			}

		public String getThirdGrade()
			{
				return thirdGrade;
			}

		public void setThirdGrade(String thirdGrade)
			{
				this.thirdGrade = thirdGrade;
			}

		
		
		
	}
