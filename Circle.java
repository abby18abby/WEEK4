public class Circle 
{   //field or attribute
	private double jejari = 1;

	//overload method toString()

	public String toString()
	{
		return "Jejari = " + jejari
				+"\n Luas adalah "+KiraLuas();
	}


//setter atau mutator
	public void setJejari(double jejari)
	{
		this.jejari=jejari;

	}

	//public void setJejari(double r)
	//{
	//	jejari=r;
	//}

//getter atau accessor
	public double getJejari()
	{
		return jejari;
	}
  
    //default constructor
  	public Circle()
  	{
       System.out.println("Default constructor dipanggil");
  	}

//overloading constructor-parameter
  	public Circle (double jejari){
  		this.jejari = jejari;
  		//System.out.println("Jejari = " + jejari);
  	}

  	//overloading constructor-parameter
  	public Circle (double r,String s)
  	{
  		jejari = r;
  		System.out.println("Jejari = " + jejari + "String " + s);
  	}


  //method
	public double KiraLuas()
	{
		return jejari * jejari * Math.PI;
	}


}