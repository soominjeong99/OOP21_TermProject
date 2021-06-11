package mall;

public class Customer {
	private int id;
	private String pwd;
	private String name;
	private String tel;
	private String addr;
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getPwd()
	{
		return this.pwd;
	}
	
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getTel()
	{
		return this.tel;
	}
	
	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public void setAddr(String addr)
	{
		this.addr = addr;
	}
}
