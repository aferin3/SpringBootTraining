package com.fidan.springdemo.mvc;

import com.fidan.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName = "";

    @Max(value = 10,message = "must be less than 11")
    @Min(value = 0,message = "must be greater than or equal 0")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value="TOPS", message = "must start with TOPS") //if we dont write value then default value is pass(LUV)
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }



    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}