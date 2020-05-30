object Q2
{
	def main(args:Array[String])
	{
		println("\n\tProfit Calculator\n")
		print("Enter the ticket price : ")
		var price:Int=scala.io.StdIn.readInt();

		var atendees=atendeesCal(price);
		var income=incomeCal(atendees,price);
		var cost=costCal(atendees);
		var profit=profitCal(income,cost);
		printf("\nProfit for ticket price %d : %.2f\n",price,profit);
	}

	def atendeesCal(price:Int):Int=
	{
		return 120+((15-price)/5)*20;
	}
	def incomeCal(atendees:Int,price:Int):Int=
	{
		return atendees*price;
	}
	def costCal(atendees:Int):Int=
	{
		return 500+3*atendees;
	}
	def profitCal(income:Int,cost:Int):Int=
	{
		return income-cost;
	}
}
