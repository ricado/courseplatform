package com.courseplatform.dao;

import com.courseplatform.bean.Course;
import com.courseplatform.bean.StudentCourse;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_course
     *
     * @mbggenerated Fri Dec 09 17:24:58 CST 2016
     */
    @Delete({
            "delete from student_course",
            "where course_id = #{courseId,jdbcType=VARCHAR}",
            "and teacher_account = #{teacherAccount,jdbcType=VARCHAR}",
            "and student_account = #{studentAccount,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("courseId") String courseId, @Param("teacherAccount") String teacherAccount, @Param("studentAccount") String studentAccount);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_course
     *
     * @mbggenerated Fri Dec 09 17:24:58 CST 2016
     */
    @Insert({
            "insert into student_course (course_id, teacher_account, ",
            "student_account)",
            "values (#{courseId,jdbcType=VARCHAR}, #{teacherAccount,jdbcType=VARCHAR}, ",
            "#{studentAccount,jdbcType=VARCHAR})"
    })
    int insert(StudentCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_course
     *
     * @mbggenerated Fri Dec 09 17:24:58 CST 2016
     */
    @Select({
            "select",
            "course_id, teacher_account, student_account",
            "from student_course"
    })
    @Results({
            @Result(column = "course_id", property = "courseId", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "teacher_account", property = "teacherAccount", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "student_account", property = "studentAccount", jdbcType = JdbcType.VARCHAR, id = true)
    })
    List<StudentCourse> selectAll();

    /**
     * 查找学生的所有课程
     *
     * @param studentAccount
     * @return
     */
    List<Course> selectCoursesByStudent(@Param("studentAccount") String studentAccount);

    Course selectCourseByStudentAndCourseId(@Param("courseId") String courseId, @Param("studentAccount") String studentAccount);

}