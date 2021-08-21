package cn.monitor4all.demo.entity;

public class Courseware {
    private int wid;
    private String pdfpath;
    private String pfpath;
    private String timecode;
    private String mupath;
    private String timestart;

    public Courseware(String pdfpath, String pfpath, String timecode, String mupath, String timestart) {
        this.pdfpath = pdfpath;
        this.pfpath = pfpath;
        this.timecode = timecode;
        this.mupath = mupath;
        this.timestart = timestart;
    }

    public Courseware() {
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getPdfpath() {
        return pdfpath;
    }

    public void setPdfpath(String pdfpath) {
        this.pdfpath = pdfpath;
    }

    public String getPfpath() {
        return pfpath;
    }

    public void setPfpath(String pfpath) {
        this.pfpath = pfpath;
    }

    public String getTimecode() {
        return timecode;
    }

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    public String getMupath() {
        return mupath;
    }

    public void setMupath(String mupath) {
        this.mupath = mupath;
    }

    public String getTimestart() {
        return timestart;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }
}
