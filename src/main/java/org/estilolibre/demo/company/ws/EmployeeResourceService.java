/**
 * 
 */
package org.estilolibre.demo.company.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.estilolibre.demo.company.db.DB;
import org.estilolibre.demo.company.model.Employee;

import com.sun.jersey.api.NotFoundException;

/**
 * @author isidromerayo
 *
 *
 */
@Path("/employee")
public class EmployeeResourceService {

	@GET
	@Produces({ MediaType.APPLICATION_XML })
	public List<Employee> getAllEmployees() {
		return DB.getAllEmployees();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("{id}")
	public Employee getEmployee(@PathParam("id") int id) {
		Employee result = DB.getEmployee(id);
		if (result == null) {
			throw new NotFoundException("Employee with id " + id
					+ " not exists");
		}
		return result;
	}
}
