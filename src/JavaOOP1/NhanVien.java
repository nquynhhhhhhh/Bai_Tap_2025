package JavaOOP1;

public class NhanVien {
    public String name;
    public String gender;
    public int age;
    public String position;

    // hàm xây dựng (constructor)
    public NhanVien(String name, String gender, int age, String position) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
    }

    // hàm hiển thị thông tin
    public void ListEmployee() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Tuổi: " + age);
        System.out.println("Vị trí: " + position);
        System.out.println(); // thêm dòng trống để dễ nhìn
    }
}

