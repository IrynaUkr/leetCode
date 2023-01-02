package oop;

public class Child extends Parent{
    String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        Child kitten = new Child();
        String nameAlias = kitten.createNameAlias();
       
    }

}
