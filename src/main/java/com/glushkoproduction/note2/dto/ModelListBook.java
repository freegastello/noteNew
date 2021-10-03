package com.glushkoproduction.note2.dto;

public class ModelListBook {
    private String id;
    private String createDate;
    private String createTime;
    private String lastSaveDate;
    private String lastSaveTime;
    private String name;
    private String year;
    private int deleted;

    public ModelListBook() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "ModelListBook{" +
                "id='" + id + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastSaveDate='" + lastSaveDate + '\'' +
                ", lastSaveTime='" + lastSaveTime + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
