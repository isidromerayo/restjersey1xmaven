/**
 * 
 */
package org.estilolibre.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

/**
 * @author isidromerayo
 *
 */
public class DummyIT {

	private static final String URL = "http://localhost:9988/restJerseyTest";

	@Test
	public void applicationIsUpAndRESTEmployeeResponse() throws IOException {
		// given
		HttpClient client = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(URL + "/rest/employee");
		// when
		HttpResponse response = client.execute(httpget);

		// then
		assertThat(response.getStatusLine().getStatusCode(),
				equalTo(HttpStatus.SC_OK));

	}
}
