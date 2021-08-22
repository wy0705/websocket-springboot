package cn.monitor4all.demo.entity;



public class UserData {

    private int did;
    private int age;
    private String gender;

    public UserData() {
    }

    public UserData(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
    public UserData(int did, int age, String gender) {
        this.did = did;
        this.age = age;
        this.gender = gender;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
