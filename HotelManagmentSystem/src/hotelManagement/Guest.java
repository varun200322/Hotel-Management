package hotelManagement;

public class Guest 
{
	int id;
	String name;
	String email;
	int discount;
	
	public Guest(int id, String name, String email, int discount)//default constructor
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.discount = discount;
	}
	
	//public Guest() {}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public int getDiscount()
	{
		return discount;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public void setDiscount(int discount) 
	{
		this.discount = discount;
	}
}
