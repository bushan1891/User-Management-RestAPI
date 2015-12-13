package user.egen.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import user.egen.model.*;
import user.egen.model.User.Gender;
import user.egen.util.DButil;

public class userDAO {

	public List fetchAll() {
		
		List<User> UserList = new ArrayList<User>();
		Connection con = DButil.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			ps = con.prepareStatement("Select * from user_db.user");
			rs = ps.executeQuery();
			
		while(rs.next())
		{
		User User	= new User();
		Gender gen = null;

		User.setId(rs.getInt("ID"));
		User.setFirstName(rs.getString("FIRST_NAME"));
		User.setMiddleName(rs.getString("MIDDLE_NAME"));
		User.setLastName(rs.getString("LAST_NAME"));
		User.setAge(rs.getInt("AGE"));
		
		String str =rs.getString("GENDER");
		str.toUpperCase();
		
		if(str=="MALE")
		   gen=gen.MALE;
		else
	       gen=gen.FEMALE;
		
		User.setGender(gen);
		User.setPhone(rs.getString("PHONE"));
		User.setZip(rs.getInt("ZIP"));
		
		UserList.add(User);
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(" Error in Returant DAO "+ e );
			//throw new AppException(e.getMessage(), e.getCause());	
		}
		finally {
			DButil.closeResource(ps,rs,con);
		}
		
		return UserList ;

	}
	
	public User fetchOne(int resNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User update(int cON_ID, User res) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
