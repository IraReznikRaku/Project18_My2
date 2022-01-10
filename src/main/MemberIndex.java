package main;

import java.util.Objects;

public class MemberIndex {
    private int index;
    private int val;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "MemberIndex{" +
                "index=" + index +
                ", val=" + val +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberIndex that = (MemberIndex) o;
        return index == that.index && val == that.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, val);
    }
}
