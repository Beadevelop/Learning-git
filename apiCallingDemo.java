package mavendemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class apiCallingDemo {

	public static void main(String[] args) {
		
		// Build Request.......................
		
				RestAssured
				.given()
				.log()
				.all()
		
		
		.baseUri("https://mockapi.bfmio.com/post/")
		
		.basePath("io_master_day")

		.body("{\n" + "    \"dimensions\": [\n" + "        \"hour\"\n" + "    ],\n" + "    \"measures\": [\n"
				+ "        \"revenue\",\n" + "        \"requests\",\n" + "        \"vcr\",\n" + "        \"ctr\",\n"
				+ "        \"impressions\"\n" + "    ],\n" + "    \"conditions\": [\n" + "        {\n"
				+ "            \"dimension\": \"bidCrid\",\n" + "            \"operation\": \"notin\",\n"
				+ "            \"value\": [\n" + "                \"0\"\n" + "            ]\n" + "        }\n"
				+ "    ],\n" + "    \"dateFilter\": {\n" + "        \"startDate\": \"2021-09-06 00:00:00\",\n"
				+ "        \"endDate\": \"2021-09-06 23:59:59\"\n" + "    },\n" + "    \"hourly\": true,\n"
				+ "    \"previous\": false,\n" + "    \"totals\": false,\n" + "    \"limitp\": 40000,\n"
				+ "    \"sortMetric\": \"requests\",\n" + "    \"offset\": \"-4\"\n" + "}")
		
		
				.contentType(ContentType.JSON)
		
	// Hit Response and Get Response......................
		
				.post()
		
	// Validate Response..................................	
				
				.then()
				.log()
				.all()
				.statusCode(200);
	    
	    
		

	}

}
