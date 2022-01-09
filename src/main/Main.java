package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int number = new Scanner(System.in).nextInt();
        int[] intArray = new int[40];
        int count = 0;
        LinkedList<MemberInt> lsInt = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                for (int k = j+1; k < intArray.length; k++) {
                    MemberInt mi = new MemberInt();
                    mi.setIndex1(i);
                    mi.setIndex2(j);
                    mi.setIndex3(k);
                    mi.setValueInt(Math.abs((intArray[i]+intArray[j]+intArray[k]) - number));
                    lsInt.add(mi);
                    count++;
                }
            }
        }
        System.out.println("Counter: " + count);
        Collections.sort(lsInt, new Comparator<MemberInt>() {
            @Override
            public int compare(MemberInt o1, MemberInt o2) {
                if (o1.getValueInt() > o2.getValueInt()) return 1;
                if (o1.getValueInt() < o2.getValueInt()) return -1;
                return 0;
            }
        });
        System.out.println(lsInt.get(0));
        for (int i = 1; i < count; i++) {
            if (lsInt.get(0).getValueInt() == lsInt.get(i).getValueInt()) {
                System.out.println(lsInt.get(i));
            }
        }
    }
}
