package Steps;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	  static  RequestSpecification httpreq;
	  static Response resp;
	  static String reqBody;
	  static String id;
	@Given("Set The  BaseURI By Using RestAssured class")
	public void set_the_base_uri_by_using_rest_assured_class() {
	    
		RestAssured.baseURI="http://localhost:3000/employees";
	}

	@Given("Get Req Specification object to add req header req body select http req")
	public void get_req_specification_object_to_add_req_header_req_body_select_http_req() {
	    
		     httpreq=RestAssured.given();
	}

	@Given("Content Type req header")
	public void content_type_req_header() {
	   
		  httpreq.header("Content-Type","application/json");
	}

	@Given("Add req Body")
	public void add_req_body() {
	    
	    JSONObject json=new JSONObject();
	    json.put("fname","jackson");
	    json.put("lname","denil");
	    json.put("mobileNo","907890345");
	    json.put("address","USA");
	    json.put("emailId","jackson@gmail.com");
	    
	    reqBody=json.toString();
	    System.out.println(reqBody);
	    httpreq.body(reqBody);
	    
	}

	@When("User Select Http post req")
	public void user_select_http_post_req() {
	    
		 resp=httpreq.post();
	}

	@Then("Cpature Status Code")
	public void cpature_status_code() {
	    
		 System.out.println(resp.getStatusCode());
	}

	@Then("Capture StatusLine")
	public void capture_status_line() {
	    
		System.out.println(resp.getStatusLine());
	}

	@Then("Capture ResponseTime")
	public void capture_response_time() {
	    
	   System.out.println(resp.getTime());
	}

	@Then("Capture ResponseHeader")
	public void capture_response_header() {
	    
		Headers allheader=resp.getHeaders();
		
		for(Header abc:allheader)
		{
			System.out.println(abc.getName()+"::"+abc.getValue());
		}
	}

	@Then("Capture ResponseBody")
	public void capture_response_body() {
	  
		 String body=resp.getBody().asString();
		 System.out.println(body);
	}

	@Then("Capture Response Id")
	public void capture_response_id() {
	    
		id=resp.getBody().jsonPath().getString("id");
	}
	
	@When("User Select Http get req")
	public void user_select_http_get_req() {
	    
		resp=httpreq.get(id);
	}
	
	@Given("Add req Body for patch req")
	public void add_req_body_for_patch_req() {
	   
		 JSONObject json=new JSONObject();
		    json.put("fname","Mooris");
		    json.put("lname","Yadav");
		    
		    
		    reqBody=json.toString();
		    System.out.println(reqBody);
		    httpreq.body(reqBody);
	}

	@When("User Select Http patch req")
	public void user_select_http_patch_req() {
	    
		resp=httpreq.patch(id);
	}
	
	@When("User Select Http delete req")
	public void user_select_http_delete_req() {
	   
		resp=httpreq.delete(id);
	}
}
