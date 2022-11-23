package memopad;

import java.util.Scanner;
// 인덱스를 따로 변수 선언을 하는 방향으로 리팩토링 필요...!!

public class Main {
    public static void main(String[] args) {

        MemoList memolist = new MemoList();

        while(true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("======메모장 메뉴======");
            System.out.println();
            System.out.println("    1. 메모 입력");
            System.out.println("    2. 목록 보기");
            System.out.println("    3. 메모 수정");
            System.out.println("    4. 메모 삭제");
            System.out.println("    5. 종    료");
            System.out.println();
            System.out.println("====================");


            System.out.print("번호를 입력해주세요: ");
            int selectMenu = scanner.nextInt();

            if(selectMenu == 1) {
                System.out.println("메모를 입력합니다.");
                CreateMemo cm = new CreateMemo();
                memolist.add(cm.createMemo());
            } else if(selectMenu == 2) {
                System.out.println("메모 목록을 불러옵니다.");
                memolist.printAllMemo();
            }
            else if(selectMenu == 3) {
                System.out.println("메모를 수정합니다.");
                UpdateMemo update = new UpdateMemo();
                update.memoUpdate(memolist);
            }
            else if(selectMenu == 4) {
                System.out.println("메모를 삭제합니다.");
                DeleteMemo delete = new DeleteMemo();
                delete.deleteMemo(memolist);
            }
            else if(selectMenu == 5)
                break;
            else
                System.out.println("번호를 다시 입력해주세요.");

            System.out.println();
        }
    }
}