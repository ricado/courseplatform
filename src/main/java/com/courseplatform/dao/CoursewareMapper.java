package com.courseplatform.dao;

import com.courseplatform.bean.Courseware;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Component
public interface CoursewareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courseware
     *
     * @mbggenerated Fri Dec 09 21:40:34 CST 2016
     */
    @Delete({
        "delete from courseware",
        "where course_id = #{courseId,jdbcType=VARCHAR}",
          "and teacher_account = #{teacherAccount,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("courseId") String courseId, @Param("teacherAccount") String teacherAccount);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courseware
     *
     * @mbggenerated Fri Dec 09 21:40:34 CST 2016
     */
    @Insert({
        "insert into courseware (course_id, teacher_account, ",
        "courseware)",
        "values (#{courseId,jdbcType=VARCHAR}, #{teacherAccount,jdbcType=VARCHAR}, ",
        "#{courseware,jdbcType=VARCHAR})"
    })
    int insert(Courseware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courseware
     *
     * @mbggenerated Fri Dec 09 21:40:34 CST 2016
     */
    @Select({
        "select",
        "course_id, teacher_account, courseware",
        "from courseware",
        "where course_id = #{courseId,jdbcType=VARCHAR}",
          "and teacher_account = #{teacherAccount,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="teacher_account", property="teacherAccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="courseware", property="courseware", jdbcType=JdbcType.VARCHAR)
    })
    Courseware selectByPrimaryKey(@Param("courseId") String courseId, @Param("teacherAccount") String teacherAccount);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courseware
     *
     * @mbggenerated Fri Dec 09 21:40:34 CST 2016
     */
    @Select({
        "select",
        "course_id, teacher_account, courseware",
        "from courseware"
    })
    @Results({
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="teacher_account", property="teacherAccount", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="courseware", property="courseware", jdbcType=JdbcType.VARCHAR)
    })
    List<Courseware> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courseware
     *
     * @mbggenerated Fri Dec 09 21:40:34 CST 2016
     */
    @Update({
        "update courseware",
        "set courseware = #{courseware,jdbcType=VARCHAR}",
        "where course_id = #{courseId,jdbcType=VARCHAR}",
          "and teacher_account = #{teacherAccount,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Courseware record);
}