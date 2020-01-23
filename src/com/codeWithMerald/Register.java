package com.codeWithMerald;

public class Register {
    private String name;
    private String courseTitle;

    public Register(String name, String courseTitle) {
        this.name = name;
        this.courseTitle = courseTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString() {
        return "Register: \t\t" +
                "name='" + name + '\'' + "\t\t" +
                ", courseTitle='" + courseTitle + '\'' +
                '.';
    }
}
