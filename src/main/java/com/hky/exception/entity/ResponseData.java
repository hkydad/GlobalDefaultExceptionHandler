package com.hky.exception.entity;

public class ResponseData {


    private int code;
    private String values;
    private Object object;



    public ResponseData(int code, String values, Object object) {

        this.values=values;
        this.code=code;
        this.object=object;

    }
    public ResponseData() {


    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public int getCode() {
        return code;
    }

}
