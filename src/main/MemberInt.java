package main;

public class MemberInt {
    private int index1;
    private int index2;
    private int index3;
    private int valueInt;

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public int getIndex3() {
        return index3;
    }

    public void setIndex3(int index3) {
        this.index3 = index3;
    }

    public int getValueInt() {
        return valueInt;
    }

    public void setValueInt(int valueInt) {
        this.valueInt = valueInt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "index1=" + index1 +
                ", index2=" + index2 +
                ", index3=" + index3 +
                ", valueInt=" + valueInt +
                '}';
    }
}
