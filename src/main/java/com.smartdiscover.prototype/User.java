package com.smartdiscover.prototype;

public class User extends Person {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User() {
        this.setType("USER");
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "Person Object with type : " +str;
    }

}
