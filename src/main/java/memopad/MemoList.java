package memopad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoList {

    private List<Memo> memoList;

    public MemoList(){
        memoList = new ArrayList<Memo>();
    }

    public void add(Memo memo){
        memoList.add(memo);
    }

    public Memo getIndex(int idx){
        return memoList.get(idx);
    }

    public Memo remove(int idx){
        return memoList.remove(idx);
    }

    public void printAllMemo(){
        Collections.sort(memoList, new MemoListComparator().reversed());
        for(Memo memos : memoList) {
            System.out.println(memos);
        }
        System.out.println();
    }

}