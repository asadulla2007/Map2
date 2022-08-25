package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here


        HashMap<Integer ,Integer> map=new HashMap<>();

        map .put(1,1);
        map.put(10,1);
        map.put(11,11);
        map .put(111,3);
        map.put(101,1);

        int res = 0;

        for (Map.Entry<Integer,Integer>i:map.entrySet()){
            if (i.getValue()%2==1) {

            }
            res+=i.getValue();
        }
        System.out.println(res);






















    }
}
