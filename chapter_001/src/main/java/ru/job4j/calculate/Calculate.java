package ru.job4j.calculate;
/** 
Выводит сообщение строку на экран
*/
public class Calculate {
    /**
    @param args - args.
    @return string on the screen.
    */
    public static void main (String[] args) {
        System.out.println("Hellow World");
    }
    
    /**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/
public String echo(String name) {
    return "Echo, echo, echo : " + name;
  }
}