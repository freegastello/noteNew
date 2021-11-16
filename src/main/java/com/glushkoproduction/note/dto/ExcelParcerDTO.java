package com.glushkoproduction.note.dto;

public class ExcelParcerDTO {
    private int num;
    private String result;
    private float sum;

    public ExcelParcerDTO() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "ExcelParcerDTO{" +
                "num=" + num +
                ", result='" + result + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }

}
