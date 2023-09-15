class Student 
{
	String name;
	Student(String n)
	{
	      this.name=n;
	}
	public static void main(String[] args) 
	{
		Student s1=new Student("puja");
		Student s2=new Student("puja");
		System.out.println(s1.equals("dwedsa"));
	}
   public boolean equals(Object o)
	{
		String n1=this.name;
		Student s3=(Student) o;
		String n2=s3.name;
		if(n1.equals(n2))
			return true;
		else
			return false;
	}

}
