public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver instance
    }

    @AfterMethod
    public void tearDown() {
        // Quit WebDriver instance
    }
}

public class LoginPage extends BaseTest {
    // Page objects and methods for login page
}

public class ProductPage extends BaseTest {
    // Page objects and methods for product page
}

public class TestSuite extends BaseTest {
    @Test
    public void testLogin() {
        // Test login functionality
    }

    @Test
    public void testProductSearch() {
        // Test product search functionality
    }

    // Other test methods
}