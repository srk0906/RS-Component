package StepDefinitions;

import java.io.IOException;

import Page.ProductSearch;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	ProductSearch act = new ProductSearch();
	@Given("user load the webpage")
	public void user_load_the_webpage() throws InvalidFormatException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	   act.goToHomePage();
	}

	@When("Search product Photoelectric Sensor in the search box")
	public void search_product_photoelectric_sensor_in_the_search_box() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    act.SearchPhotoElectricSensor();
	}

	@Then("Select the first product")
	public void select_the_first_product(){
	    // Write code here that turns the phrase above into concrete actions
	   act.ClickFirstProductAndSaveTitle();
	}

	@Then("verify the product title")
	public void verify_the_product_title() {
	    // Write code here that turns the phrase above into concrete actions
	    act.VerifyProductTitle();
	}

	@Then("Verify the Product description")
	public void verify_the_product_description() {
	    // Write code here that turns the phrase above into concrete actions
	    act.VerifyProductName();
	}

	@Then("Right click the 3D model image")
	public void right_click_the_3d_model_image() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    act.RightClickOnProductImage();
	}

	@Then("Click on left to display the left side image of the product")
	public void click_on_left_to_display_the_left_side_image_of_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    act.ClickViews();
	    act.ClickLeft();
	}


}
