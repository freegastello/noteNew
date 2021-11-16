package com.glushkoproduction.note.dto;

public class RequestForFormDTO {
    private String num;
    private String year;
    private String name;

    public RequestForFormDTO() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RequestForFormDTO{" +
                "num='" + num + '\'' +
                ", year='" + year + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
