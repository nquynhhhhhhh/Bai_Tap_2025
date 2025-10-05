package JavaOOP2.Person;

public class Infomation {
    public static void main(String[]args) {
        //Khởi tạo class
        Person thongtin = new Person("Quỳnh", 22, "Nữ", "HCM", "070xxxxyyy");
        thongtin.getName();
        thongtin.getAge();
        thongtin.getGender();
        thongtin.getAddress();
        thongtin.getPhone();

        // Gọi lại thông tin
        System.out.println("Họ tên: " + thongtin.getName());
        System.out.println("Tuổi: " + thongtin.getAge());
        System.out.println("Giới tính: " + thongtin.getGender());
        System.out.println("Địa chỉ: " + thongtin.getAddress());
        System.out.println("SĐT: " + thongtin.getPhone());

    }








}
