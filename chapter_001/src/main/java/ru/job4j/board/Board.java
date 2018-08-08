package ru.job4j.board;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();

        String ln = System.lineSeparator();

        for (int i = 0; i <= height; i++) { // отвечает за высоту доски

            for (int j = 0; j <= width; j++) {

                if (width % 2 == 0 || height % 2 == 0) {

                    screen.append("X");

                } else {

                    screen.append(" ");
                }
            }
            //добавляем перевод на новую строку
            screen.append(ln);
        }
        return screen.toString();
    }
}
