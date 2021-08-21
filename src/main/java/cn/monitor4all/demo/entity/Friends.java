package cn.monitor4all.demo.entity;


public class Friends {
    private int fid;
    private int uid;
    private int _uid;

    public Friends(int uid, int _uid) {
        this.uid = uid;
        this._uid = _uid;
    }

    public Friends() {
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int get_uid() {
        return _uid;
    }

    public void set_uid(int _uid) {
        this._uid = _uid;
    }
}
