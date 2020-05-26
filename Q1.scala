object Q1
{
	def main(args:Array[String])
	{
		println("\n\tSalary Calculator\n")
		print("Enter the number of normal worked hours : ")
		var normal:Double=scala.io.StdIn.readDouble()
		print("Enter the number of OT worked hours : ")
		var ot:Double=scala.io.StdIn.readDouble()

		var monthlySalary=(normalSalary(normal)+otSalary(ot))*4;
		var untaxSallary=monthlySalary-tax(monthlySalary);
		printf("\nSalary of employee : %.2f\n",untaxSallary);
	}

	def normalSalary(normal:Double):Double=
	{
		return 150*normal;
	}

	def otSalary(ot:Double):Double=
	{
		return 75*ot;
	}

	def tax(monthlySalary:Double):Double=
	{
		return monthlySalary*0.1;
	}
}