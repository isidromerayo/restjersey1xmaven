package org.estilolibre.demo.company.ws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.estilolibre.demo.company.db.DB;
import org.estilolibre.demo.company.model.Employee;
import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.core.ClassNamesResourceConfig;
import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.spi.container.servlet.WebComponent;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

/**
 * @author isidromerayo
 *
 */
public class EmployeeResourceServiceTest extends JerseyTest {

	private static final String LITERAL_URI_EMPLOYEE_SERVICE = "employee";

	public static class AppConfig extends DefaultResourceConfig {
		public AppConfig() {
			super(EmployeeResourceService.class);
		}
	}

	@Override
	public WebAppDescriptor configure() {
		return new WebAppDescriptor.Builder()
				.initParam(WebComponent.RESOURCE_CONFIG_CLASS,
						AppConfig.class.getName())
				.initParam(ClassNamesResourceConfig.PROPERTY_CLASSNAMES,
						EmployeeResourceService.class.getName()).build();
	}

	@Test(expected = UniformInterfaceException.class)
	public final void shouldBeThrowExceptionWheURIisIncorrect() {
		resource().path(LITERAL_URI_EMPLOYEE_SERVICE + "/12").get(String.class);
	}

	@Test
	public final void shouldBeReturnEmployeeWithId1() {
		Employee expected = DB.getEmployee(1);
		Employee result = (Employee) resource().path(
				LITERAL_URI_EMPLOYEE_SERVICE + "/1").get(Employee.class);
		assertEquals(expected.getFirstName(), result.getFirstName());
	}

	@Test
	public final void shouldBeReturnResponseXMLFormat() {
		WebResource ws = resource().path(LITERAL_URI_EMPLOYEE_SERVICE + "/1");
		ClientResponse response = ws.accept(MediaType.APPLICATION_XML).get(
				ClientResponse.class);
		assertEquals(200, response.getStatus());
	}

	@Test
	public final void shouldBeReturnResponseJSONFormat() {
		WebResource ws = resource().path(LITERAL_URI_EMPLOYEE_SERVICE + "/1");
		ClientResponse response = ws.accept(MediaType.APPLICATION_JSON).get(
				ClientResponse.class);
		assertEquals(200, response.getStatus());
	}

	@Test
	public final void shouldBeReturnAllEmployeesAsStringWhenCallToResourceEmployee() {
		String result = resource().path(LITERAL_URI_EMPLOYEE_SERVICE).get(
				String.class);
		assertNotNull(result);
	}

	@Test
	public final void shouldBeReturnAllEmployeesWhenCallToResourceEmployee() {
		GenericType<Collection<Employee>> genericType = new GenericType<Collection<Employee>>() {
		};
		List<Employee> wsResult = (List<Employee>) resource()
				.path(LITERAL_URI_EMPLOYEE_SERVICE)
				.accept(MediaType.APPLICATION_XML).get(genericType);
		assertEquals(2, wsResult.size());
	}
}
