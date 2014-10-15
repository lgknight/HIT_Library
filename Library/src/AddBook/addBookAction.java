package AddBook;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class addBookAction extends ActionSupport{
	private String title;
	private String isbn;
	private String authorID;
	private String publisher;
	private String publishDate;
	private float price;
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setAuthorID(String authorID)
	{
		this.authorID=authorID;
	}
	public String getAuthorID()
	{
		return authorID;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublishDate(String publishdate)
	{
		this.publishDate=publishdate;
	}
	public String getPublishDate()
	{
		return publishDate;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
	
	public void wrong1()
	{
		String msg="图书信息不完整，禁止添加";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public void wrong2()
	{
		String msg="图书已存在，添加失败";
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
		ResultSet rs=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/book?UseUnicode=true&characterencoding=gdk";
		con = DriverManager.getConnection(url,"root","");
		stmt=con.createStatement();
		String sql1="select * from Author where authorID='"+authorID+"'";		
		String sql2="select * from Book where ISBN='"+isbn+"'";		
		String sql3="insert into Book "+"(ISBN,Title,AuthorID,Publisher,PublishDate,Price)"+"value("+"'"+isbn+"'"+","+"'"+title+"'"+","+"'"+authorID+"'"+","+"'"+publisher+"'"+","+"'"+publishDate+"'"+","+"'"+price+"'"+") ";		
		if(isbn==null||title==null||authorID==null||publisher==null||publishDate==null||price==0)
		{
			wrong1();
			return "incomplete";
		}
		else
		{
			rs=stmt.executeQuery(sql2);
			if(rs.next())
			{
				wrong2();
				rs.close();
				stmt.close();
				con.close();
				return "error";
			}
			else
			{
			stmt.executeUpdate(sql3);
			rs.close();
			rs=stmt.executeQuery(sql1);
			if(rs.next()){
				rs.close();
				stmt.close();
				con.close();
				success();
				return "success";
			}
			else
			{
				rs.close();
				stmt.close();
				con.close();
				return "noauthor";
			}
			}
		}
	}
}
