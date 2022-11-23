package memopad;

import java.time.LocalDateTime;
import java.util.Scanner;

public class UpdateMemo {

    public void memoUpdate(MemoList memoList){
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 메모 번호 입력: ");
        int idx = sc.nextInt();

        if(memoList.getIndex(idx)==null){
            System.out.println("메모가 존재하지 않습니다.");
        }else{
            System.out.println("비밀번호를 입력하세요: ");
            int psw = sc.nextInt();
            Memo memo = memoList.getIndex(idx);
            if(psw == memo.getPsw()){
                sc.nextLine();
                System.out.println("수정 내용 입력");
                String content = sc.nextLine();
                memo.setContent(content);
                memo.setMemoDate(memo.getFormatter().format(LocalDateTime.now()));
            }else System.out.println("비밀번호가 틀렸습니다.");
        }

    }
}