package JavaOOP3.testcase;

import JavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public static void testLogin() {
        createDriver("Cốc cốc"); //tạo brower
        System.out.println("Step 1: Navigate to https://cms.anhtester.com/login");
        System.out.println("Step 2: Enter email");
        System.out.println("Step 3: Enter password");
        System.out.println("Step 4: Click Remember me");
        System.out.println("Step 5: Click login button");
        System.out.println("Step 6: Verify menu Dashboard display");
        closeDriver("Cốc cốc");

        System.out.println("==============");
    }

    public static void addCategory() {
        createDriver();
        System.out.println("Step 1: Verify menu Dashboard display");
        System.out.println("Step 2: Click menu Products");
        System.out.println("Step 3: Click menu Category");
        System.out.println("Step 4: Verify redirect to the Category page");
        System.out.println("Step 5: Click Add neww Category button");
        System.out.println("Step 6: Enter form data to add new Category");
        System.out.println("Step 7: Click Save button");

        closeDriver();
    }

    public static void main(String[] args) {
        testLogin();
        addCategory();
    }

}
