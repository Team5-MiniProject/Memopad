package memopad;

import java.util.Scanner;

public class CreateMemo {

    public Memo createMemo(){

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 :");
        String name = sc.next();

        System.out.println("반갑습니다 " + name + "님, 비밀번호를 설정 해 주세요.");
        int psw = sc.nextInt();

        System.out.println(name + "님, 비밀번호가 " + psw + "로 설정됩니다. 메모 내용을 입력해 주세요.");
        sc.nextLine(); // 개행 한 줄 생략 용도
        String content = sc.next();
        System.out.println("메모 내용 : " + content);

        System.out.println("메모 등록이 완료되었습니다.");
        return new Memo(name, psw, content);
    }
}
