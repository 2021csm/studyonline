package com.example.demo.bean;

public class Subject {
    private String id;
    private String subject_url;
    private String Image_url;
    private String subject_name;

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", subject_url='" + subject_url + '\'' +
                ", Image_url='" + Image_url + '\'' +
                ", subject_name='" + subject_name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject_url() {
        return subject_url;
    }

    public void setSubject_url(String subject_url) {
        this.subject_url = subject_url;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
}
