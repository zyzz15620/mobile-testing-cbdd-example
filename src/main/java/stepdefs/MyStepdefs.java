package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Map;
import java.util.Set;

public class MyStepdefs {
    WelcomePage welcomePage = new WelcomePage();
    DefaultDeliveryLocation defaultDeliveryLocation = new DefaultDeliveryLocation();
    HomePage homePage = new HomePage();
    CategoriesPage categoriesPage = new CategoriesPage();
    SpecificCategoryPage specificCategoryPage = new SpecificCategoryPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    PaymentPage paymentPage = new PaymentPage();
    ProfilePage profilePage = new ProfilePage();

    @Given("the user has launched the eCart App")
    public void theUserHasLaunchedTheECartApp() {
    }

    @Then("the welcome screen should be displayed with all the following elements:")
    public void theWelcomeScreenShouldBeDisplayedWithAllTheFollowingElements(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Skip button":
                    Assert.assertTrue(welcomePage.skipButtonIsDisplayed());
                    break;
                case "Next button":
                    Assert.assertTrue(welcomePage.nextButtonIsDisplayed());
                    break;
                case "Look for things around you text":
                    Assert.assertTrue(welcomePage.lookForThingsAroundYouTextIsDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @When("the user navigates to the Get Started screen by clicking next")
    public void theUserNavigatesToTheGetStartedScreenByClickingNext() {
        welcomePage.clickNextButton();
        welcomePage.clickNextButton();
        welcomePage.clickNextButton();
    }

    @Then("the Default Delivery Location screen should display the following elements:")
    public void theDefaultDeliveryLocationScreenShouldDisplayTheFollowingElements(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Search Pin textbox":
                    Assert.assertTrue(defaultDeliveryLocation.searchBoxIsDisplayed());
                    break;
                case "Search Button":
                    Assert.assertTrue(defaultDeliveryLocation.searchButtonIsDisplayed());
                    break;
                case "Location display":
                    Assert.assertTrue(defaultDeliveryLocation.locationDisplayIsDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @And("the location display should show the following pins:")
    public void theLocationDisplayShouldShowTheFollowingPins(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "All":
                    Assert.assertTrue(defaultDeliveryLocation.allLocationIsDisplayed());
                    break;
                case "370405":
                    Assert.assertTrue(defaultDeliveryLocation.pinCode370405IsDisplayed());
                    break;
                case "841301":
                    Assert.assertTrue(defaultDeliveryLocation.pinCode841301IsDisplayed());
                    break;
                case "800001":
                    Assert.assertTrue(defaultDeliveryLocation.pinCode800001IsDisplayed());
                    break;
                case "370465":
                    Assert.assertTrue(defaultDeliveryLocation.pinCode370465IsDisplayed());
                    break;
                case "370001":
                    Assert.assertTrue(defaultDeliveryLocation.pinCode370001IsDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @And("the user clicks on the Category menu item")
    public void theUserClicksOnTheCategoryMenuItem() {
        homePage.clickCategoryTab();
    }


    @Then("the Category screen should display the following categories:")
    public void theCategoryScreenShouldDisplayTheFollowingCategories(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Coffee Product":
                    Assert.assertTrue(categoriesPage.coffeeProductIsDisplayed());
                    break;
                case "Fast Food":
                    Assert.assertTrue(categoriesPage.fastFoodIsDisplayed());
                    break;
                case "Home Supplies":
                    Assert.assertTrue(categoriesPage.homeSuppliesIsDisplayed());
                    break;
                case "Beverages":
                    Assert.assertTrue(categoriesPage.beveragesIsDisplayed());
                    break;
                case "Baby Needs":
                    Assert.assertTrue(categoriesPage.babyNeedsIsDisplayed());
                    break;
                case "Vegetables":
                    Assert.assertTrue(categoriesPage.vegetablesIsDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @And("the user scroll to Fresh Veg category")
    public void theUserScrollToFreshVegCategory() {
        homePage.pageIsLoaded();
        homePage.swipeToFreshVeg();
    }

    @Then("the Fresh Veg category in HomePage should display {int} products")
    public void theFreshVegCategoryInHomePageShouldDisplayFreshVeg(int arg0) {
        Assert.assertEquals(homePage.freshVegCount(), arg0);
    }

    @And("the user click on View All Fresh Veg")
    public void theUserClickOnViewAllFreshVeg() {
        homePage.clickFreshVegViewAll();
    }

    @Then("the Fresh Veg Page should display {int} products")
    public void theFreshVegPageShouldDisplayProducts(int arg0) {
        Assert.assertEquals(specificCategoryPage.countProduct(2), arg0);
    }

    @And("the user scroll to Coffee category")
    public void theUserScrollToCoffeeCategory() {
        homePage.swipeToCoffe();
    }

    @And("the user click on View All Coffee")
    public void theUserClickOnViewAllCoffee() {
        homePage.clickCoffeeViewAll();
    }

    @And("the user scroll to product that contains = {string}")
    public void theUserScrollToProductThatContains(String arg0) {
        specificCategoryPage.swipeToProductContains(arg0);
    }

    @And("the user click on product that contains = {string}")
    public void theUserClickOnProductThatContains(String arg0) {
        specificCategoryPage.clickOnProductContains(arg0);
    }

    @Then("the product screen should display with following Name and Price")
    public void theProductScreenShouldDisplayWithFollowingNameAndPrice(DataTable table) {
        Map<String, String> data = table.asMap(String.class, String.class);
        Assert.assertEquals(productPage.getProductName(), data.get("Product Name"));
        Assert.assertEquals(productPage.getProductPrice(), data.get("Product Price"));
    }

    @And("the product screen should display with following buttons")
    public void theProductScreenShouldDisplayWithFollowingButtons(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Add to Cart":
                    Assert.assertTrue(productPage.isAddToCartButtonDisplayed());
                    break;
                case "Go to Cart":
                    Assert.assertTrue(productPage.isGoToCartButtonDisplayed());
                    break;
                case "Similar Products":
                    Assert.assertTrue(productPage.isSimilarProductDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @And("the user clicks on the category = {string}")
    public void theUserClicksOnTheCategory(String arg0) {
        switch (arg0) {
            case "Coffee Product":
                categoriesPage.clickCoffeeProduct();
                break;
            case "Fast Food":
                categoriesPage.clickFastFood();
                break;
            case "Home Supplies":
                categoriesPage.clickHomeSupplies();
                break;
            case "Beverages":
                categoriesPage.clickBeverages();
                break;
            case "Baby Needs":
                categoriesPage.clickBabyNeeds();
                break;
            case "Vegetables":
                categoriesPage.clickVegetables();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + arg0);
        }
    }

    @And("the user clicks Add to Cart the product that contains = {string}")
    public void theUserClicksAddToCartTheProductThatContains(String arg0) {
        specificCategoryPage.addToCartProductContains(arg0);
    }

    @And("the user clicks Add Quantity for the product that contains = {string}")
    public void theUserClicksAddQuantityForTheProductThatContains(String arg0) {
        specificCategoryPage.addQuantityProductContains(arg0);
    }

    @And("the user clicks Cart icon on top screen")
    public void theUserClicksCartIconOnTopScreen() {
        specificCategoryPage.clickCartButton();
    }

    @And("the user select {string} location")
    public void theUserSelectLocation(String arg0) {
        switch (arg0) {
            case "all":
                defaultDeliveryLocation.clickAllLocation();
                break;
            case "370405":
                defaultDeliveryLocation.clickPinCode370405();
                break;
            case "841301":
                defaultDeliveryLocation.clickPinCode841301();
                break;
            case "800001":
                defaultDeliveryLocation.clickPinCode800001();
                break;
            case "370465":
                defaultDeliveryLocation.clickPinCode370465();
                break;
            case "370001":
                defaultDeliveryLocation.clickPinCode370001();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + arg0);
        }
    }

    @And("the cart should display following buttons:")
    public void theCartShouldDisplayFollowingButtons(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Delete":
                    Assert.assertTrue(cartPage.deleteButtonIsDisplayed());
                    break;
                case "Save for later":
                    Assert.assertTrue(cartPage.saveForLaterButtonIsDisplayed());
                    break;
                case "Use Promo Code":
                    Assert.assertTrue(cartPage.usePromoCodeButtonIsDisplayed());
                    break;
                case "Continue":
                    Assert.assertTrue(cartPage.continueButtonIsDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @Then("the cart should display the following details:")
    public void theCartShouldDisplayTheFollowingDetails(DataTable table) {
        Map<String, String> data = table.asMap(String.class, String.class);
        Assert.assertEquals(cartPage.getProductName(), data.get("Product Name"));
        Assert.assertEquals(cartPage.getProductPrice(), data.get("Product Price"));
        Assert.assertEquals(cartPage.getProductMeasurement(), data.get("Product Measurement"));
        Assert.assertEquals(cartPage.getTotalPrice(), data.get("Product TotalPrice"));
        Assert.assertEquals(cartPage.getProductQuantity(), data.get("Product Quantity"));
    }

    @And("the user clicks Continue on cart page")
    public void theUserClickContinueOnCartPage() {
        cartPage.clickContinueButton();
    }

    @And("the user clicks Login in login page")
    public void theUserClickLoginInLoginPage() {
        loginPage.clickLoginButton();
    }

    @And("the user clicks Continue with address")
    public void theUserClickContinueWithAddress() {
        cartPage.clickContinueButtonWithAddress();
    }

    @Then("the Payment page should display the following details:")
    public void thePaymentPageShouldDisplayTheFollowingDetails(DataTable table) {
        Map<String, String> data = table.asMap(String.class, String.class);
        Assert.assertEquals(paymentPage.getProductName(), data.get("Name"));
        Assert.assertEquals(paymentPage.getPinCode(), data.get("Pin Code"));
        Assert.assertEquals(paymentPage.getTime(), data.get("Time"));
        Assert.assertEquals(paymentPage.getGrandTotal(), data.get("Grand Total"));
        Assert.assertEquals(paymentPage.getSubTotal(), data.get("Subtotal"));
        Assert.assertEquals(paymentPage.getDeliveryCharge(), data.get("Delivery"));
        Assert.assertEquals(paymentPage.getSavedAmount(), data.get("Saved"));
        Assert.assertEquals(paymentPage.getTotalPrice(), data.get("Total"));
    }

    @And("the user clicks on the Profile tab")
    public void theUserClicksOnTheProfileTab() {
        homePage.clickProfileTab();
    }

    @And("the user clicks on Welcome Guest")
    public void theUserClicksOnWelcomeGuest() {
        profilePage.clickWelcomeGuest();
    }


    @Then("the Login page should display following:")
    public void theLoginPageShouldDisplayFollowing(DataTable dataTable) {
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Mobile Textbox":
                    Assert.assertTrue(loginPage.mobileFieldIsDisplayed());
                    break;
                case "Password Textbox":
                    Assert.assertTrue(loginPage.passwordFieldIsDisplayed());
                    break;
                case "Login Button":
                    Assert.assertTrue(loginPage.loginButtonIsDisplayed());
                    break;
                case "Signup Button":
                    Assert.assertTrue(loginPage.signUpButtonIsDisplayed());
                    break;
                case "Forgot password":
                    Assert.assertTrue(loginPage.forgotPasswordButtonIsDisplayed());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);
            }
        }
    }

    @Then("the Profile screen after login should display following items:")
    public void theProfileScreenAfterLoginShouldDisplayFollowingItems(DataTable dataTable) {
        Set<String> settings = profilePage.getProfileSettings();
        for (String element : dataTable.asList()) {
            switch (element) {
                case "Home":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Cart":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Notifications":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Your Orders":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Wallet History":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Transaction History":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Change Password ?":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Manage Addresses":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Refer & Earn":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Contact Us":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "About Us":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Rate Us":
                    Assert.assertTrue(settings.contains(element));
                    System.out.println(settings);
                    break;
                case "Share App":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "FAQ":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Terms & Conditions":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Privacy Policy":
                    Assert.assertTrue(settings.contains(element));
                    break;
                case "Logout":
                    Assert.assertTrue(settings.contains(element));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + element);

            }
        }
    }
}