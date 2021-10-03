package com.glushkoproduction.note2.dto;

public class ModelListNote {
    private String id;
    private String createDate;
    private String createTime;
    private String lastSaveDate;
    private String lastSaveTime;
    private String heading;
    private String recording;
    private int deleted;


    public ModelListNote() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastSaveDate() {
        return lastSaveDate;
    }

    public void setLastSaveDate(String lastSaveDate) {
        this.lastSaveDate = lastSaveDate;
    }

    public String getLastSaveTime() {
        return lastSaveTime;
    }

    public void setLastSaveTime(String lastSaveTime) {
        this.lastSaveTime = lastSaveTime;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "ModelListNote{" +
                "id='" + id + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastSaveDate='" + lastSaveDate + '\'' +
                ", lastSaveTime='" + lastSaveTime + '\'' +
                ", heading='" + heading + '\'' +
                ", recording='" + recording + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
