package com.contactbook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact person1 = new Contact("Su Su","0923456","susu456@gmail.com");
        Contact person2 = new Contact("Minami","0921314","minami314@gmail.com");
        Contact person3 = new Contact("Makoto","0922334","makoto334@gmail.com");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }

}