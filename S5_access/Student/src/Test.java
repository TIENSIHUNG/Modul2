public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        System.out.println("stu1 's name "+stu1.getName());
        System.out.println("stu1 's class "+stu1.getClasses());

        stu2.setName("HUNG");
        stu2.setClasses("super vip");
        System.out.println("stu2's name "+stu2.getName());
        System.out.println("stu2's class "+stu2.getClasses());
    }
}
