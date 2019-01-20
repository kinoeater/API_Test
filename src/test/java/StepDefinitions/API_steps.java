package StepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;


public class API_steps {
	
	
	
	@When("^I get a list of blog posts using the API endpoint$")
	public void i_get_a_list_of_blog_posts_using_the_API_endpoint() throws Throwable {
	
	}

    
    
    @Then("^user \"([^\"]*)\" should have \"([^\"]*)\" posts$")
    public void user_should_have_posts(String arg1, String arg2) throws Throwable {
        
    	int int_post_num = Integer.parseInt(arg2);
    	given().
		when().
			get("https://jsonplaceholder.typicode.com/posts?userId="+arg1).  //retrieves the posts with specific user IDs
			then().
			assertThat().body("userId", hasSize(int_post_num));           //takes the total number of posts with userID in the body
    																	   // verified it the pre defined number
    }
    
    @Then("^Each blog post should have a unique ID$")
    public void each_blog_post_should_have_a_unique_id() throws Throwable {
    	
    	int sum=0;
		for(int a=1;a<11;a++) {                //for loop, helps to find to sum the counts of user1's posts, user2's posts....
			
		sum=sum+get_response_size("?userId="+a);
			
		}
		System.out.println("sum is "+sum);
		System.out.println("array sum  is "+get_response_size(""));
				
		Assert.assertEquals(sum, get_response_size(""));  // if JSON array size should be equal to sum of above, than that means each post has unique ID
        
    }
    
    
    //*****Method to help to find the total post count of each user, for example*****
        
     public int get_response_size(String user) {
		
				
		Response response = given().
				when().
				get("https://jsonplaceholder.typicode.com/posts"+user);

        List<String> jsonResponse = response.jsonPath().getList("$");

        System.out.println(jsonResponse.size());
        int total_items=jsonResponse.size();
        return total_items;
		
	}
	
	
	
	
}
