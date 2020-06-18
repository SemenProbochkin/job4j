
package ru.job4j.jukebox;


public class Jukebox {
    public void music( int position){

        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        if (position == 2) {
        System.out.println("Спокойной ночи");
        }
        if (position != 1 && position !=2)
        System.out.println("Песня не найдена");
    }
    public static void main(String[] args){
        Jukebox jukebox = new Jukebox();
        jukebox.music(2);
        jukebox.music(8);
        jukebox.music(1);
    }
}
