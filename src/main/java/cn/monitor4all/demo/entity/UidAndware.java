package cn.monitor4all.demo.entity;

public class UidAndware {
    private int uwid;
    private int uid;
    private int wid;

    public UidAndware(int uid, int wid) {
        this.uid = uid;
        this.wid = wid;
    }

    public UidAndware() {
    }

    public int getUwid() {
        return uwid;
    }

    public void setUwid(int uwid) {
        this.uwid = uwid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }
}
