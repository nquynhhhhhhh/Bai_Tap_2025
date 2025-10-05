package JavaOOP3.common;

public class BaseTest{


    public static void createDriver() {
        System.out.println("Project Name: " + Constants.PROJECT_NAME);
        System.out.println("Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());
    }

    public static void createDriver(String browser) {
        System.out.println("Browser: " + browser);
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless());
    }

    //Cách 1: thể hiện tính đa hình => truyền giá trị dynamic
    public static void closeDriver(String browser) { //truyền browser
        System.out.println("Closed browser: " + browser);
    }
    //Cách 2: hàm kh truyền giá trị thì lấy từ vị trí chung, giá trị cứng
    public static void closeDriver() { //truyền browser
        System.out.println("Closed browser: " + Constants.getBrowser());
    }

    public static void main(String[] args) {
        createDriver();
        closeDriver();
    }


}
