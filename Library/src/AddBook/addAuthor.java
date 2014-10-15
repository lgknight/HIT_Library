package AddBook;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class addAuthor extends ActionSupport{
	private String name;
	private int age;
	private String country;
	private String authorID;
	public void setAuthorID(String authorID)
	{
		this.authorID=authorID;
	}
	public String getAuthorID()
	{
		return authorID;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setCountry(String Country)
	{
		this.country=Country;
	}
	public String getCountry()
	{
		return country;
	}
	
	public void wrong()
	{
		String msg="图书信息部完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void success()
	{
		String msg="添加成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	
	public String execute() throws Exception{
		Connection con=null;
		Statement stmt=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/book?UseUnicode=true&characterencoding=gdk";
		con = DriverManager.getConnection(url,"root","");
		stmt=con.createStatement();
		String sql="insert into Author "+"(AuthorID,Name,Age,Country)"+"value("+"'"+authorID+"'"+","+"'"+name+"'"+","+"'"+age+"'"+","+"'"+country+"'"+") ";		
		if(authorID==null||name==null||age==0||country==null)
		{
			stmt.close();
			con.close();
			wrong();
			return "incomplete";
		}
		else
		{
				stmt.executeUpdate(sql);
				stmt.close();
				con.close();
				success();
				return "success";
			
		}
	}
}
