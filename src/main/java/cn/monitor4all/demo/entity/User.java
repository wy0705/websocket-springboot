package cn.monitor4all.demo.entity;





public class User {

    private int uid;
    private String name;
    private int did;
    private String password;

    public User() {
    }

    public User(String name, int did, String password) {
        this.name = name;
        this.did = did;
        this.password = password;
    }

    public User(String name,String password) {
        this.name = name;
        this.password = password;
    }
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
