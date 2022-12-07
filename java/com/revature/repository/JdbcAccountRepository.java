package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

import com.revature.database.FirstConnection;
import com.revature.entity.Account;
import com.revature.entity.TDetails;
import com.revature.entity.AccDetails;

public class JdbcAccountRepository implements AccountRepository {
	Scanner input = new Scanner(System.in);
	public void save1(AccDetails accdetails) {
			Connection con = null;
		try {
			con = FirstConnection.getConnection();

			String sql = "insert into register (id,Name,Mail,Password,Phone,address) values (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, accdetails.getId());
			ps.setString(2, accdetails.getname());
			ps.setString(3,accdetails.getmail());
			ps.setString(4,accdetails.getpw());
			ps.setString(5,accdetails.getphone());
			ps.setString(6,accdetails.getaddress());
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("Account Created");
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	public User load(String name) {	

		User u = null;

		Connection connection = null;
		try {
			connection = FirstConnection.getConnection();

			String sql = "select * from register where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				User user= new User();
				user.setId(rs.getInt(1));
				user.setname(rs.getString(2));
				user.setmail(rs.getString(3));
				user.setpw(rs.getString(4));
				user.setphone(rs.getString(5));
				user.setaddress(rs.getString(6));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return u;
	}
	
	public void update(User u) {

		Connection connection = null;
		try {
			connection = FirstConnection.getConnection();

			String sql = "update register set name=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, u.getname());
			ps.setInt(2, u.getId());
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
	public List<AccDetails> getCusDetails(int n1) {
		
		Connection con = null;

		List<AccDetails> Details1 = new ArrayList<AccDetails>();

		try {
			con = FirstConnection.getConnection();
			String sql;
			if(n1==0) {
			sql="select * from register;";
			}
			else {
			sql="select * from register where id="+n1+";";
			}
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				AccDetails Details = new AccDetails();
				Details.setId(rs.getInt(1));
				Details.setname(rs.getString(2));
				Details.setmail(rs.getString(3));
				Details.setpw(rs.getString(4));
				Details.setphone(rs.getString(5));
				Details.setaddress(rs.getString(6));
				Details1.add(Details);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return Details1;

	}
	
	public void edit(String n1) {

		Connection con = null;
		try {
			con = FirstConnection.getConnection();
			String sql;
			System.out.println("Select 1 to change name");
			System.out.println("Select 2 to change mail");
			System.out.println("Select 3 to change pw");
			System.out.println("Select 4 to change phone number");
			System.out.println("Select 5 to change address");
			int c=input.nextInt();
			System.out.println("Enter the value");
			switch (c) {
				case 1:{
					String val=input.next();
					sql = "update register set name='"+val+"' where id="+n1+"";
					PreparedStatement ps = con.prepareStatement(sql);
					int rowCount = ps.executeUpdate();
					if (rowCount == 1) {
						System.out.println("Account edited.");
					}
					break;
				}
				
				case 2:{
					String val=input.next();
					sql = "update register set mail='"+val+"' where id="+n1+"";
					PreparedStatement ps = con.prepareStatement(sql);
					int rowCount = ps.executeUpdate();
					if (rowCount == 1) {
						System.out.println("Account edited.");
					}
					break;
				}
				
				case 3:{
					String val=input.next();
					sql = "update register set pw='"+val+"' where id="+n1+"";
					PreparedStatement ps = con.prepareStatement(sql);
					int rowCount = ps.executeUpdate();
					if (rowCount == 1) {
						System.out.println("Account edited.");
					}
					break;
				}
				
				case 4:{
					String val=input.next();
					sql = "update register set phone='"+val+"' where id="+n1+"";
					PreparedStatement ps = con.prepareStatement(sql);
					int rowCount = ps.executeUpdate();
					if (rowCount == 1) {
						System.out.println("Account edited.");
					}
					break;
				}
				
				case 5:{
					String val=input.next();
					sql = "update register set address='"+val+"' where id="+n1+"";
					PreparedStatement ps = con.prepareStatement(sql);
					int rowCount = ps.executeUpdate();
					if (rowCount == 1) {
						System.out.println("Account edited.");
					}
					break;
				}
				default:
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
				
				
			}

	public void save1(TDetails ld) {
		Connection con = null;
		try {
			con = FirstConnection.getConnection();

			String sql = "insert into TDeatils (Mail,Password) values (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,ld.getmail());
			ps.setString(2,ld.getpw());
			

			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("login successfull");
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	@Override
	public void save(TDetails tdetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(AccDetails accdetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tsave(TDetails tdetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TDetails> getTransfer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccDetails> getAccDetails(int n1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getaadharc(int n1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countAcc() {
		// TODO Auto-generated method stub
		return 0;
	}
		



}
