package com.mycom.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> list;
    Scanner s;

    WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {
        System.out.println("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);
    }

    public void addWord() {
        Word one = (Word)add();

        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다.\n");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll() {
        System.out.println("------------------------------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + " " + list.get(i).toString());
        }
        System.out.println("------------------------------\n");
    }

    public void listLevel() {
        System.out.println("원하는 난이도(1,2,3) 입력 : ");
        int chooseLevel = s.nextInt();
        System.out.println("------------------------------");
        for(int i = 0; i < list.size(); i++) {
            if(chooseLevel == list.get(i).getLevel()) {
                System.out.println((i + 1) + " " + list.get(i).toString());
            }
        }
        System.out.println("------------------------------\n");
    }

    public void listSearch() {
        System.out.println("원하는 단어 검색 : ");
        String searchWord = s.next();
        System.out.println("------------------------------");
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getWord().contains(searchWord)) {
                System.out.println((i + 1) + " " + list.get(i).toString());
            }
        }
        System.out.println("------------------------------\n");
    }
}
