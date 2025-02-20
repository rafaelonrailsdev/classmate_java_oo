package com.senai.encapsulation.example.bank_account;

public class User {
    private String name;
    private String indetifier;
    private String birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndetifier() {
        return indetifier;
    }

    public void setIndetifier(String indetifier) {
        this.indetifier = indetifier;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", indetifier='" + indetifier + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
