package Week2.Day5.TH1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInter = new MyList<>();
        listInter.add(1);
        listInter.add(2);
        listInter.add(3);
        listInter.add(4);

        System.out.println("element 4: " + listInter.get(4));
        System.out.println("element 1: " + listInter.get(1));
        System.out.println("element 2: " + listInter.get(2));

        listInter.get(6);
        System.out.println("element 6: " + listInter.get(6));
    }
}
