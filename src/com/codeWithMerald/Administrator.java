package com.codeWithMerald;

import java.util.Date;

public class Administrator extends User {
    public Administrator(int id, String name, String email, type userCategory, Date registeredDate) {
        super(id, name, email, userCategory, registeredDate);
    }
}
