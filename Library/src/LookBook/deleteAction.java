package LookBook;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import javax.swing.JOptionPane;
public class deleteAction extends ActionSupport{
	private String title;
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void message()
	{
		String msg="删除成功";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public String execute() throws Exception
	{		
		String tempID=new String();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		//ResultSet rs2=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/book?UseUnicode=true&characterencoding=gdk";
		con = DriverManager.getConnection(url,"root","");
		stmt=con.createStatement();
		String sql1="select * from Book where title='"+title+"'";	
		String sql2="delete  from Book where title='"+title+"'";
		rs=stmt.executeQuery(sql1);
			while(rs.next())
			tempID=rs.getString("AuthorID");	
			String sql3="select * from Book where authorID ='"+tempID+"'";
			String sql4="delete from Author where authorID ='"+tempID+"'";
		rs.close();
		rs=stmt.executeQuery(sql3);
		int k=0;
		while(rs.next())
		{
			k++;
		}		
		if(k==1){
		stmt.executeUpdate(sql2);
		stmt.executeUpdate(sql4);
		}
		else
			stmt.executeUpdate(sql2);
		rs.close();
		stmt.close();
		con.close();
		message();
		return "success";
	}
}
