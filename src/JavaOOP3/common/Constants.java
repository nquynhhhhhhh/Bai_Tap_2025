package JavaOOP3.common;

public class Constants {
    //Constants nơi cung cấp giá trị toàn cục static
    //=> có thể gọi class. biến hoặc hàm, ở bất kì class nào khác mà k cần khởi tạo object or kế thừa
    public static String PROJECT_NAME = "Selenium Java";
    //những biến mà có thể dùng trực tiếp k thông qua hàm thì nên viết hoa hết để phân biệt

    public static String browser = "Chrome";
    public static boolean report = true; //Có tạo báo cáo test (ví dụ Allure, ExtentReport…) hay không
    public static boolean headless = false; //false để chạy test có giao diện, true nếu muốn chạy ở chế độ ẩn (dùng cho CI/CD)

    //Cách 2: dùng tính đóng gói => đổi biến từ public thành private
    //biến private nhưng hàm public thì ở package khác vẫn gọi đc hàm
    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }


}
