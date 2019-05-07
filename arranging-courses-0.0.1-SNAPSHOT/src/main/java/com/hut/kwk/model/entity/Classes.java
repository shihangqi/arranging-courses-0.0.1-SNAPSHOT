package com.hut.kwk.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Classes implements Cloneable, Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.class_name
     *
     * @mbg.generated
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.class_number
     *
     * @mbg.generated
     */
    private String classNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.day_limit
     *
     * @mbg.generated
     */
    private Integer dayLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.statu
     *
     * @mbg.generated
     */
    private Integer statu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.mark
     *
     * @mbg.generated
     */
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table classes
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes(Integer id, String className, String classNumber, Integer dayLimit, Integer statu, String mark) {
        this.id = id;
        this.className = className;
        this.classNumber = classNumber;
        this.dayLimit = dayLimit;
        this.statu = statu;
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.id
     *
     * @return the value of classes.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.id
     *
     * @param id the value for classes.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.class_name
     *
     * @return the value of classes.class_name
     *
     * @mbg.generated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes withClassName(String className) {
        this.setClassName(className);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.class_name
     *
     * @param className the value for classes.class_name
     *
     * @mbg.generated
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.class_number
     *
     * @return the value of classes.class_number
     *
     * @mbg.generated
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes withClassNumber(String classNumber) {
        this.setClassNumber(classNumber);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.class_number
     *
     * @param classNumber the value for classes.class_number
     *
     * @mbg.generated
     */
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.day_limit
     *
     * @return the value of classes.day_limit
     *
     * @mbg.generated
     */
    public Integer getDayLimit() {
        return dayLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes withDayLimit(Integer dayLimit) {
        this.setDayLimit(dayLimit);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.day_limit
     *
     * @param dayLimit the value for classes.day_limit
     *
     * @mbg.generated
     */
    public void setDayLimit(Integer dayLimit) {
        this.dayLimit = dayLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.statu
     *
     * @return the value of classes.statu
     *
     * @mbg.generated
     */
    public Integer getStatu() {
        return statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes withStatu(Integer statu) {
        this.setStatu(statu);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.statu
     *
     * @param statu the value for classes.statu
     *
     * @mbg.generated
     */
    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.mark
     *
     * @return the value of classes.mark
     *
     * @mbg.generated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    public Classes withMark(String mark) {
        this.setMark(mark);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.mark
     *
     * @param mark the value for classes.mark
     *
     * @mbg.generated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
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
        Classes other = (Classes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getClassNumber() == null ? other.getClassNumber() == null : this.getClassNumber().equals(other.getClassNumber()))
            && (this.getDayLimit() == null ? other.getDayLimit() == null : this.getDayLimit().equals(other.getDayLimit()))
            && (this.getStatu() == null ? other.getStatu() == null : this.getStatu().equals(other.getStatu()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getClassNumber() == null) ? 0 : getClassNumber().hashCode());
        result = prime * result + ((getDayLimit() == null) ? 0 : getDayLimit().hashCode());
        result = prime * result + ((getStatu() == null) ? 0 : getStatu().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
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
        sb.append(", className=").append(className);
        sb.append(", classNumber=").append(classNumber);
        sb.append(", dayLimit=").append(dayLimit);
        sb.append(", statu=").append(statu);
        sb.append(", mark=").append(mark);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    @Override
    public Classes clone() throws CloneNotSupportedException {
        return (Classes) super.clone();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table classes
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        className("class_name", "className", "VARCHAR", false),
        classNumber("class_number", "classNumber", "VARCHAR", false),
        dayLimit("day_limit", "dayLimit", "INTEGER", false),
        statu("statu", "statu", "INTEGER", false),
        mark("mark", "mark", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
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
         * This method corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table classes
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
         * This method corresponds to the database table classes
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