package cn.monitor4all.demo.entity;



public class Message {

    private int mid;
    private int fid;
    private String content;
    private long timestamps;
    private String renamee;

    public Message() {
    }

    public Message(int fid, String content, long timestamps, String renamee) {
        this.fid = fid;
        this.content = content;
        this.timestamps = timestamps;
        this.renamee = renamee;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public String getRenamee() {
        return renamee;
    }

    public void setRenamee(String renamee) {
        this.renamee = renamee;
    }
}
