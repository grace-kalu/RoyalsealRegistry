package com.codeWithMerald;

import java.util.Date;

public class Student extends User {
    public Student(int id, String name, String email, type userCategory, Date registeredDate) {
        super(id, name, email, userCategory, registeredDate);
    }
}
