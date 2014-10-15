package LookBook;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

import javax.swing.JOptionPane;

public class Update extends ActionSupport{
		private String title;
		private String authorID;
		private String publisher;
		private String publishDate;
		private float price;
		private String name;
		private int age;
		private String country;
		
		public void setTitle(String title)
		{
			this.title=title;
		}
		public String getTitle()
		{
			return title;
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
			String msg="图书信息不完整，禁止修改";
			int type=JOptionPane.YES_NO_CANCEL_OPTION;
			String title="信息提示";
			JOptionPane.showMessageDialog(null,msg,title,type);
		}
		public void success()
		{
			String msg="修改成功";
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
			String sql1="update Book set AuthorID='"+authorID+"',Publisher='"+publisher+"',PublishDate='"+publishDate+"',Price='"+price+"' where Title='"+title+"'";		
			String sql3="update Author set Name='"+name+"', Age='"+age+"', Country='"+country+"' where AuthorID='"+authorID+"'";		
			if(publisher==null||publishDate==null||price==0||age==0||name==null||country==null)
			{
				wrong();
				stmt.close();
				con.close();
				return "error";
			}
			else{
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql3);
			stmt.close();
			con.close();
			success();
			return "success";		
		}
		}
}
