package LookBook;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ShowBookAction extends ActionSupport{
	private String authorName;
	List<String> booklist=new ArrayList();
	public void setAuthorName(String authorName){
		this.authorName=authorName;
		}
	public String getAuthorName(){
		return authorName;
	}
	public void setBooklist(ArrayList<String> BookList){
		this.booklist=BookList;
	}
	public List<String> getBooklist(){
		return booklist;
	}
	
	public void wrong1(){
		String msg="不允许有空，查询失败";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	public void wrong2(){
		String msg="没有相关图书";
		int type=JOptionPane.YES_NO_CANCEL_OPTION;
		String title="信息提示";
		JOptionPane.showMessageDialog(null,msg,title,type);
	}
	
	public String execute() throws Exception{
		String tempID=new String();
		if(authorName.length()==0){
			wrong1();
			return "error";
		}
		else{
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/book?UseUnicode=true&characterencoding=gdk";
				con = DriverManager.getConnection(url,"root","");
				stmt=con.createStatement();
				String sql1="select * from Author where Name='"+authorName+"'";
				rs=stmt.executeQuery(sql1);
				while(rs.next())
					tempID=rs.getString("AuthorID");
				rs.close();
				String sql2="select * from Book where AuthorID='"+tempID+"'";		
				rs=stmt.executeQuery(sql2);
				if(!rs.first()){
					wrong2();
					rs.close();
					stmt.close();
					con.close();
					return "error";
				}
				else{
				booklist.add(rs.getString("Title"));
				while(rs.next()){
					booklist.add(rs.getString("Title"));
				}
				rs.close();
				stmt.close();
				con.close();
				return "success";
				}
			}
		}
}
	
