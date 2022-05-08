/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlttth.model;

import java.util.Date;

/**
 *
 * @author daoho
 */
public class Course {
    String CourseID, CourseName, DateStudy, TimeStudy;
    Date DateStart, DateEnd;
    int Price;

    public Course(String CourseID, String CourseName, String DateStudy, String TimeStudy, Date DateStart, Date DateEnd, int Price) {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.DateStudy = DateStudy;
        this.TimeStudy = TimeStudy;
        this.DateStart = DateStart;
        this.DateEnd = DateEnd;
        this.Price = Price;
    }

    public Course() {
    }
    // get
    public String getCourseID() {
        return CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getDateStudy() {
        return DateStudy;
    }

    public String getTimeStudy() {
        return TimeStudy;
    }

    public Date getDateStart() {
        return DateStart;
    }

    public Date getDateEnd() {
        return DateEnd;
    }

    public int getPrice() {
        return Price;
    }

    //set
    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void setDateStudy(String DateStudy) {
        this.DateStudy = DateStudy;
    }

    public void setTimeStudy(String TimeStudy) {
        this.TimeStudy = TimeStudy;
    }

    public void setDateStart(Date DateStart) {
        this.DateStart = DateStart;
    }

    public void setDateEnd(Date DateEnd) {
        this.DateEnd = DateEnd;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
    
}
