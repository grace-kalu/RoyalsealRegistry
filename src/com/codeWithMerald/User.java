package com.codeWithMerald;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

enum type{
    student,
    tutor,
    admin

}
public abstract class User {
    private int id;
    private String name;
    private String email;
    private type userCategory;
    private Date RegisteredDate;
    public static Map<String, User> allUsers = new HashMap<>();

    public User(int id, String name, String email, type userCategory, Date registeredDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userCategory = userCategory;
        RegisteredDate = registeredDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public type getUserCategory() {
        return userCategory;
    }

    public Date getRegisteredDate() {
        return RegisteredDate;
    }

    public static User CreateUser(String email, User user){
        allUsers.put(email, user);
        return null;
    }
    public static User DeleteUser(String email){
        if(!allUsers.containsKey(email)){
            System.out.println("User does not exist");
        } else{
            allUsers.remove(email);
            System.out.println("User successfully deleted");
        }
        return null;
    }
    public static User EditUser(String email, User user){
        if (!allUsers.containsKey(email)){
            System.out.println("User does not exist");
        } else {
            allUsers.replace(email, user);
            System.out.println("User successfully updated");
        }
        return null;
    }
    public static User SearchUser(String email){
        if(allUsers.containsKey(email)){
            System.out.println(allUsers.get(email).getName() +" is a user");
        } else {
            System.out.println("User does not exist");
        }
        return null;
    }
    public static boolean LoginUser(String email){
        if(!allUsers.containsKey(email)){
            System.out.println("User not found");
            return false;
        } else {
            System.out.println("Welcome "+ allUsers.get(email).getName());
            return true;
        }
    }
    public static void ListUsers(){
        System.out.println("There are"+ allUsers.size() + "registered Users of the Academy");
        Iterator<Map.Entry<String, User>> iterator = allUsers.entrySet().iterator();
        System.out.println("\tS/N \t\tName \t\t\t User Category");

        while (iterator.hasNext()){
            Map.Entry<String, User> entry = iterator.next();
            System.out.println("\t" + entry.getValue().getId() + " \t\t" + entry.getValue().getName().toUpperCase() + "\t\t\t" + entry.getValue().getUserCategory().toString().toUpperCase());
        }
    }
}
