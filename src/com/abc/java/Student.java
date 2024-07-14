package com.abc.java;
import java.util.Collections;
import java.util.List;
import java.util.Date;

public final class Student {
    private final int id;
    private final String name;
    private final String department;
    private final List<String> subjects;
    private final Date dateOfJoining;

    public Student(int id, String name, String department, List<String> subjects, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.subjects = Collections.unmodifiableList(subjects); // Makes the list immutable
        this.dateOfJoining = new Date(dateOfJoining.getTime()); // Defensive copy for immutability
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Date getDateOfJoining() {
        return new Date(dateOfJoining.getTime()); // Defensive copy for immutability
    }

    // No setters to maintain immutability
}
