package user.egen.rest.controller;

import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import user.egen.DAO.userDAO;
import user.egen.exception.AppException;
import user.egen.model.User;

@Path("/user")
@Api(tags = { "user" })
public class UserController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)

	@ApiOperation(value = "Find All", notes = "finds all the user")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })

	public List<User> findUser() throws AppException {

		userDAO dao = new userDAO();
		return dao.fetchAll();
	}

	@GET
	@Path("/{user}")
	@Produces(MediaType.APPLICATION_JSON)

	@ApiOperation(value = "Find one", notes = "Find User")

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })

	public User findOne(@PathParam("user") int userID) throws AppException {

		userDAO dao = new userDAO();

		return dao.fetchOne(userID);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Create", notes = "Create new User")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	public User makeRes(User user) throws Exception {

		userDAO dao = new userDAO();
		return dao.create(user);

	}

	@PUT
	@Path("/{USER_ID}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Update", notes = "Update User Record")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	public User update(@PathParam("USER_ID") int USER_ID, User user) throws Exception {

		userDAO dao = new userDAO();

		return dao.update(USER_ID, user);
	}

}
