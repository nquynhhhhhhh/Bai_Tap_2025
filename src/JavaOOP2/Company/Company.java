package JavaOOP2.Company;

import JavaOOP2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person congty = new Person("Quỳnh", 22, "Nữ");
        System.out.println("Họ tên: " + congty.getName());
        System.out.println("Tuổi: " + congty.getAge());
        System.out.println("Giới tính: " + congty.getGender());

    }

}
