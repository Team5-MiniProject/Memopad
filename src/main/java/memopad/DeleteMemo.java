package memopad;

import java.util.Scanner;

public class DeleteMemo {

    public void deleteMemo(MemoList memolist){
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제 글 번호를 입력하세요: ");
        int idx = sc.nextInt();

        if(memolist.getIndex(idx)==null){ //get 써야함
            System.out.println("메모가 존재하지 않습니다.");
        }else{
            System.out.println("비밀번호를 입력하세요: ");
            int psw = sc.nextInt();
            Memo memo = memolist.getIndex(idx);
            if(psw == memo.getPsw()){
                memolist.remove(idx);
                System.out.println("메모가 삭제되었습니다.");
            } else System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}