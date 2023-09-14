package com.mycom.word;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager() {
        wordCRUD = new WordCRUD(s);
    }

    public int selectMenu() {
        System.out.println("*** 영단어 마스터 ***\n" +
                "********************\n" +
                "1. 모든 단어 보기\n" +
                "2. 수준별 단어 보기\n" +
                "3. 단어 검색\n" +
                "4. 단어 추가\n" +
                "5. 단어 수정\n" +
                "6. 단어 삭제\n" +
                "7. 파일 저장\n" +
                "0. 나가기\n" +
                "********************\n" +
                "=> 원하는 메뉴는? ");

        return s.nextInt();
    }
    public void start() {
        wordCRUD.loadFile();
        while (true){
            int menu = selectMenu();
            if (menu == 0) {
                break;
            }
            switch (menu) {
                case 1 -> wordCRUD.listAll();
                case 2 -> wordCRUD.listLevel();
                case 3 -> wordCRUD.listSearch();
                case 4 -> wordCRUD.addWord();
                case 5 -> wordCRUD.updateWord();
                case 6 -> wordCRUD.deleteWord();
                case 7 -> wordCRUD.saveFile();
                default -> System.out.println("없는 번호 입니다! 다시 입력해주세요!\n");
            }

        }
    }
}
