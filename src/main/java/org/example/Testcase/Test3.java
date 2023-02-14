package org.example.Testcase;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        int count = 0;
        int countList = 0;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("o2");
        arrayList.add("k1");
        arrayList.add("b4");
        arrayList.add("de");
        arrayList.add("o123");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("hom");
        arrayList2.add("nay");
        arrayList2.add("la");
        arrayList2.add("thu");
        arrayList2.add("ba");

        do {
            getResult(arrayList.get(countList) , arrayList2.get(countList));
            countList++;
            count++;
        }while (count < arrayList.size());

    }

    public static void getResult(String s1,String s2){
        System.out.println(s1 + s2);
    }
}
