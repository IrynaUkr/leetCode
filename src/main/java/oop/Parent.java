package oop;

public class Parent {
    public String name;
    public String createNameAlias(){
       return name.toUpperCase()+" alias";
    }
    private String password;



    private void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
