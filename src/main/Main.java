package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность масссива:");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Введите число:");
        int number = new Scanner(System.in).nextInt();
        int[] intArray = new int[num];
        LinkedList<MemberIndex> lsInt = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            MemberIndex memberIndex = new MemberIndex();
            memberIndex.setIndex(i);
            memberIndex.setVal(intArray[i]);
            lsInt.add(memberIndex);
        }
        System.out.println(lsInt);
        Collections.sort(lsInt, new Comparator<MemberIndex>() {
            @Override
            public int compare(MemberIndex o1, MemberIndex o2) {
                if (o1.getVal() > o2.getVal()) return 1;
                if (o1.getVal() < o2.getVal()) return -1;
                return 0;
            }
        });
        System.out.println(lsInt);
        int countMember = 0;
        for (int i = 0; i < lsInt.size(); i++) {
            if (lsInt.get(i).getVal() < number) {
                countMember++;
            } else {
                break;
            }
        }
        System.out.println("Count members: " + countMember);
        LinkedList<MemberInt> llInt = new LinkedList<>();
        if (countMember <= 2) {
            System.out.println("Indexes: " + lsInt.get(0).getIndex() + ", " + lsInt.get(1).getIndex()
                + ", " + lsInt.get(2).getIndex());
        } else {
            for (int i = 0; i < countMember; i++) {
                for (int j = i + 1; j < countMember; j++) {
                    for (int k = j + 1; k < countMember; k++) {
                        MemberInt memberInt = new MemberInt();
                        memberInt.setIndex1(lsInt.get(i).getIndex());
                        memberInt.setIndex2(lsInt.get(j).getIndex());
                        memberInt.setIndex3(lsInt.get(k).getIndex());
                        memberInt.setValueInt(Math.abs(lsInt.get(i).getVal() + lsInt.get(j).getVal()
                            + lsInt.get(k).getVal() - number));
                        llInt.add(memberInt);
                    }
                }
            }
            Collections.sort(llInt, new Comparator<MemberInt>() {
                @Override
                public int compare(MemberInt o1, MemberInt o2) {
                    if (o1.getValueInt() > o2.getValueInt()) return 1;
                    if (o1.getValueInt() < o2.getValueInt()) return -1;
                    return 0;
                }
            });
            System.out.println(llInt.get(0));
            for (int i = 1; i < countMember; i++) {
                if (llInt.get(0).getValueInt() == llInt.get(i).getValueInt()) {
                    System.out.println(llInt.get(i));
                }
            }
        }
    }
}
