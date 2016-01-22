/**
 * 
 */
package org.estilolibre.demo.blog.restws;

import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.core.ClassNamesResourceConfig;
import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.spi.container.servlet.WebComponent;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

/**
 * @author isidromerayo
 *
 */
public class UserServiceTestUsingJerseyFrameworkTest extends JerseyTest {
	private static final String LITERAL_URI_USER_INFO_SERVICE = "/UserInfoService/";

	public static class AppConfig extends DefaultResourceConfig {
		public AppConfig() {
			super(UserInfo.class);
		}
	}

	@Override
	public WebAppDescriptor configure() {
		return new WebAppDescriptor.Builder()
				.initParam(WebComponent.RESOURCE_CONFIG_CLASS,
						AppConfig.class.getName())
				.initParam(ClassNamesResourceConfig.PROPERTY_CLASSNAMES,
						UserInfo.class.getName()).build();
	}

	@Test
	public void testUserFetchesSuccess() throws JSONException,
			URISyntaxException {

		JSONObject json = resource().path(
				LITERAL_URI_USER_INFO_SERVICE + "id/12").get(JSONObject.class);

		assertEquals("12", json.get("id"));
		assertEquals("Tim", json.get("firstName"));
		assertEquals("Tester", json.get("lastName"));
		assertEquals("1970-01-16T07:56:49.871+01:00", json.get("birthday"));
	}

	@Test(expected = UniformInterfaceException.class)
	public void testUserNotFound() {

		resource().path(LITERAL_URI_USER_INFO_SERVICE + " id/666").get(
				JSONObject.class);
	}

	@Test
	public void testUserAgeFetchesSuccessStringXML() {
		String expected = "<User><Age>12</Age></User>";
		String result = resource().path(
				LITERAL_URI_USER_INFO_SERVICE + "age/12").get(String.class);
		assertEquals(expected, result);
	}
}
