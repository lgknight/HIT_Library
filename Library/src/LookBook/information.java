package LookBook;
import com.opensymphony.xwork2.ActionSupport;

import java.net.URLEncoder;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class information extends ActionSupport{
		private String title;
		private String isbn;
		private String authorID;
		private String publisher;
		private String publishDate;
		private float price;
		private String name;
		private int age;
		private String country;
		
		public void setTitle(String Title) throws Exception
		{
			
			this.title=Title;
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
		
		public String execute() throws Exception{
			String tempID=new String();
					
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/book?UseUnicode=true&characterencoding=gdk";
			con = DriverManager.getConnection(url,"root","");
			stmt=con.createStatement();
			String sql1="select * from Book where Title='"+title+"'";		
			rs=stmt.executeQuery(sql1);
			while(rs.next()){
			isbn=rs.getString("ISBN");
			authorID=rs.getString("AuthorID");
			publisher=rs.getString("Publisher");
			publishDate=rs.getString("PublishDate");
			price=rs.getFloat("Price");
			}
			rs.close();
			tempID=authorID;
			String sql2="select * from Author where AuthorID='"+tempID+"'";		
			rs=stmt.executeQuery(sql2);
			while(rs.next()){
			name=rs.getString("Name");
			age=rs.getInt("Age");
			country=rs.getString("Country");
			}
			rs.close();
			stmt.close();
			con.close();
			
			return "success";		
		}
}
