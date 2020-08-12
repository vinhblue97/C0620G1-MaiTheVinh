package access_modifier_static_method_static_property.thuc_hanh.simple;

public class Main {
    public static void main(String args[]) {

        A obj = new A();

        System.out.println(obj.data);//Compile Time Error

        obj.msg();//Compile Time Error

    }
}
