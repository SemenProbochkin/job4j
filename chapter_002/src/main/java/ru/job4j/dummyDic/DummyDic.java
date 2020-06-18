package ru.job4j.dummyDic;

public class DummyDic {
    public String engToRus(String eng){

        return eng;
    }

    public static void main(String[] agrs){
        DummyDic dummyDic = new DummyDic();

        String say = dummyDic.engToRus("Name");
        System.out.println("Неизвестнное слово " + say);
    }
}
