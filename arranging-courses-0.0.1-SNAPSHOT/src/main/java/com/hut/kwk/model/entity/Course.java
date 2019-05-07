package com.hut.kwk.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Course implements Cloneable, Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_time
     *
     * @mbg.generated
     */
    private Integer courseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.statu
     *
     * @mbg.generated
     */
    private Integer statu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.mark
     *
     * @mbg.generated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course(Integer id, String courseName, Integer courseTime, Integer statu, String mark) {
        this.id = id;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.statu = statu;
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_name
     *
     * @return the value of course.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course withCourseName(String courseName) {
        this.setCourseName(courseName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_name
     *
     * @param courseName the value for course.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_time
     *
     * @return the value of course.course_time
     *
     * @mbg.generated
     */
    public Integer getCourseTime() {
        return courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course withCourseTime(Integer courseTime) {
        this.setCourseTime(courseTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_time
     *
     * @param courseTime the value for course.course_time
     *
     * @mbg.generated
     */
    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.statu
     *
     * @return the value of course.statu
     *
     * @mbg.generated
     */
    public Integer getStatu() {
        return statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course withStatu(Integer statu) {
        this.setStatu(statu);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.statu
     *
     * @param statu the value for course.statu
     *
     * @mbg.generated
     */
    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.mark
     *
     * @return the value of course.mark
     *
     * @mbg.generated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public Course withMark(String mark) {
        this.setMark(mark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.mark
     *
     * @param mark the value for course.mark
     *
     * @mbg.generated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getCourseTime() == null ? other.getCourseTime() == null : this.getCourseTime().equals(other.getCourseTime()))
            && (this.getStatu() == null ? other.getStatu() == null : this.getStatu().equals(other.getStatu()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getCourseTime() == null) ? 0 : getCourseTime().hashCode());
        result = prime * result + ((getStatu() == null) ? 0 : getStatu().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseTime=").append(courseTime);
        sb.append(", statu=").append(statu);
        sb.append(", mark=").append(mark);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    @Override
    public Course clone() throws CloneNotSupportedException {
        return (Course) super.clone();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table course
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        courseName("course_name", "courseName", "VARCHAR", false),
        courseTime("course_time", "courseTime", "INTEGER", false),
        statu("statu", "statu", "INTEGER", false),
        mark("mark", "mark", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table course
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}