package JavaOOP1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien("Quỳnh", "Nữ", 23, "Tester");
        nhanvien1.ListEmployee();

        NhanVien nhanvien2 = new NhanVien("Thoa", "Nữ", 24, "Tester");
        nhanvien2.ListEmployee();

        NhanVien nhanvien3 = new NhanVien("Hùng", "Nam", 23, "Developer");
        nhanvien3.ListEmployee();

        NhanVien nhanvien4 = new NhanVien("Hùng", "Nam", 24, "Engineer");
        nhanvien4.ListEmployee();
    }
}
