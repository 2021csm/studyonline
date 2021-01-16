package com.example.demo.bean;

public class Course {
    private String course_id;
    private String course_url;
    private String course_origin;
    private String course_name;
    private String course_subject;
    private Integer course_click;
    private Integer course_status;
    private String course_code;

    @Override
    public String toString() {
        return "Course{" +
                "course_id='" + course_id + '\'' +
                ", course_url='" + course_url + '\'' +
                ", course_origin='" + course_origin + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_subject='" + course_subject + '\'' +
                ", course_click=" + course_click +
                ", course_status=" + course_status +
                ", course_code='" + course_code + '\'' +
                '}';
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void setCourse_subject(String course_subject) {
        this.course_subject = course_subject;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_id() {
        return course_id;
    }

    public String getCourse_subject() {
        return course_subject;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_url(String course_url) {
        this.course_url = course_url;
    }

    public Course() {
    }

    public Course(String cousre_subject, String course_name, String course_url) {
        this.course_url = course_url;
        this.course_name = course_name;
        this.course_subject = cousre_subject;
    }

    public void setCourse_origin(String course_origin) {
        this.course_origin = course_origin;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCousre_subject(String cousre_subject) {
        this.course_subject = cousre_subject;
    }

    public void setCourse_click(Integer course_click) {
        this.course_click = course_click;
    }

    public void setCourse_status(Integer course_status) {
        this.course_status = course_status;
    }

    public String getCourse_url() {
        return course_url;
    }

    public String getCourse_origin() {
        return course_origin;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCousre_subject() {
        return course_subject;
    }

    public Integer getCourse_click() {
        return course_click;
    }

    public Integer getCourse_status() {
        return course_status;
    }
}
