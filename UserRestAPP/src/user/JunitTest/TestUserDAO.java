package user.JunitTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import user.egen.DAO.userDAO;
import user.egen.exception.AppException;
import user.egen.model.User;

public class TestUserDAO {

	private userDAO dao;
	private List<User> userList;
	private static final int id = 1001;
	
	@Before
	public void setUp() throws Exception {
		dao = new userDAO();
		userList = new ArrayList<User>();
	}
	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void testFetchAll() throws AppException {
		userList = dao.fetchAll();
		assertNotNull(userList);
		assertEquals(userList.get(0).getFirstName(),"Nagendra");
		assertEquals(userList.get(0).getLastName(),"Bushan");
		assertEquals(userList.get(0).getMiddleName(),"");
				
	}
	
	@Test
	public void testFetchOne()throws AppException{
		
		User one = dao.fetchOne(id);
		assertEquals(one.getFirstName(),"Nagendra");
		assertEquals(one.getLastName(),"Bushan");
		assertEquals(one.getMiddleName(),"");
		
	}
	
	@Test
	public void testUpdate()throws AppException{
		
		User one = new User();
	         one.setFirstName("Nagen");
	         one = dao.update(id, one);
	         assertEquals(one.getFirstName(),"Nagen");
		
	}
	

}
