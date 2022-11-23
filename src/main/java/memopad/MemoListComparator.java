package memopad;

import java.util.Comparator;

public class MemoListComparator implements Comparator<Memo> {

    @Override
    public int compare(Memo o1, Memo o2) {
        return String.valueOf(o1.getMemoDate()).compareTo(o2.getMemoDate());
    }
}