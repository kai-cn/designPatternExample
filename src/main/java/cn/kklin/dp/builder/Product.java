package cn.kklin.dp.builder;


import java.util.ArrayList;
import java.util.List;

//��Ʒ�࣬�ɶ��������ɡ�
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n��Ʒ ����----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
