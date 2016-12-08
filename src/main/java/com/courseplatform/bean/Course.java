package com.courseplatform.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.util.Date;

@Alias("Course")
public class Course {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_id
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    private Integer courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_name
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    private String courseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.time
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_introduction
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    private String courseIntroduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_syllabus
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    private String courseSyllabus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_id
     *
     * @return the value of course.course_id
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_id
     *
     * @param courseId the value for course.course_id
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_name
     *
     * @return the value of course.course_name
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_name
     *
     * @param courseName the value for course.course_name
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.time
     *
     * @return the value of course.time
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.time
     *
     * @param time the value for course.time
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_introduction
     *
     * @return the value of course.course_introduction
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_introduction
     *
     * @param courseIntroduction the value for course.course_introduction
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction == null ? null : courseIntroduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_syllabus
     *
     * @return the value of course.course_syllabus
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public String getCourseSyllabus() {
        return courseSyllabus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_syllabus
     *
     * @param courseSyllabus the value for course.course_syllabus
     *
     * @mbggenerated Thu Dec 08 11:15:00 CST 2016
     */
    public void setCourseSyllabus(String courseSyllabus) {
        this.courseSyllabus = courseSyllabus == null ? null : courseSyllabus.trim();
    }
}