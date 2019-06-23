import java.util.Scanner;

public class ClassAverage
{
	public static void main(String[] args)
	{
		int total = 0 ;
		int gradeCounter = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter grade or -1 to quit:");
		int grade = input.nextInt();


		while (grade != -1)
		{
			total = total + grade;
			gradeCounter = gradeCounter +1 ;
			System.out.print("Enter grade or -1 to quit:");
			grade = input.nextInt();
			
		}
		if(gradeCounter != 0)
		{
			double average = total / gradeCounter;

			System.out.printf("%nTotal of all 10 grades is %d%n", total);
			System.out.printf("%nAverage of all 10 grades is %d%n", average);

		}
		else 
			System.out.println("No grade were entered.");

		



	}
}
