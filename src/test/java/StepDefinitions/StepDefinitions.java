package StepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

import POM.HomePage;
import BasePackage.BaseClass;

public class StepDefinitions extends BaseClass {
	
	BaseClass bClass=new BaseClass();
	HomePage test1=new HomePage();
	 
	@Given("Launch URL")
	public void launch_url() throws IOException, InterruptedException {
	bClass.launchBrowser();
	   
	}
	@When("Get the title value")
	public void get_the_title_value() {
		test1.getTitle(); 
	}
	@Then("validate the title of the homepage")
	public void validate_the_title_of_the_homepage(DataTable dtable) throws IOException {
		List<List<String>> list = dtable.asLists(String.class);
		   
	    for (List<String> data : list) {
	    boolean titleValue=test1.verifyTitle(data.get(0));
	    if(titleValue == true) {
	    	System.out.println("The title of the home page is verified successfully");
	    	
	    }
	    } 
	}
	





}
