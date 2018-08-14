package ru.job4j.rali;

public class arrayExample {
    public static void main(String[] args) {

        user[] users = new user[5];

        users[0] = new user("fill");
        users[1] = new user("olga");
        users[2] = new user("sasha");
        users[3] = new user("colin");
        users[4] = new user("jack");

        user user = arrayExample.findByName(users, "olga");
        System.out.println(user);
    }

    public static user findByName(user[] users, String name) {
        user result = null;

        for(user user : users ) {
            if(name.equals(user.name)) {
                result = user;
                break;
            }
        }
        return result;
    }
}
