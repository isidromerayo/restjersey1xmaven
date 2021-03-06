/**
 * 
 */
package org.estilolibre.demo.blog.restws;

import java.util.Date;
import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.estilolibre.demo.blog.entity.User;

import com.sun.jersey.api.NotFoundException;

/**
 * @author isidromerayo
 *
 */
// @Path here defines class level path. Identifies the URI path that
// a resource class will serve requests for.
@Path("UserInfoService")
public class UserInfo {

	// @GET here defines, this method will method will process HTTP GET
	// requests.
	@GET
	// @Path here defines method level path. Identifies the URI path that a
	// resource class method will serve requests for.
	@Path("/name/{i}")
	// @Produces here defines the media type(s) that the methods
	// of a resource class can produce.
	@Produces(MediaType.TEXT_XML)
	// @PathParam injects the value of URI parameter that defined in @Path
	// expression, into the method.
	public String userName(@PathParam("i") String i) {

		String name = i;
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}

	@GET
	@Path("/age/{j}")
	@Produces(MediaType.TEXT_XML)
	public String userAge(@PathParam("j") int j) {

		try {
			int age = j;
			return "<User>" + "<Age>" + age + "</Age>" + "</User>";
		} catch (Exception e) {
			throw new NotFoundException(e.getMessage());
		}
	}

	@GET
	@Path("/username")
	@Produces(MediaType.TEXT_XML)
	public String userNameQuery(@QueryParam("username") String name) {
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/id/{id}")
	public User findById(@PathParam("id") final Long id) {
		if (id.equals(666l)) {
			return null;
		}

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		final User user = new User();
		user.setId(id);
		user.setFirstName("Tim");
		user.setLastName("Tester");
		user.setBirthday(new Date(1321009871));
		return user;
	}
}