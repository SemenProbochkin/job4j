package ru.job4j.loop;

public class Board {
      public String paint(int width, int height) {
       StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
              for ( int y = 1; y <= height; y++) {
        for (int x= 1; x <= width; x++ ) {

                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((x+y)%2==0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        System.out.println(screen.toString());
        return screen.toString();

    }
        }
