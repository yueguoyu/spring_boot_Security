package com.ygy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sysrole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysRole.id
     *
     * @mbggenerated Tue Dec 05 19:31:30 CST 2017
     */
    @Id
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sysRole.name
     *
     * @mbggenerated Tue Dec 05 19:31:30 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysRole.id
     *
     * @return the value of sysRole.id
     *
     * @mbggenerated Tue Dec 05 19:31:30 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysRole.id
     *
     * @param id the value for sysRole.id
     *
     * @mbggenerated Tue Dec 05 19:31:30 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sysRole.name
     *
     * @return the value of sysRole.name
     *
     * @mbggenerated Tue Dec 05 19:31:30 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sysRole.name
     *
     * @param name the value for sysRole.name
     *
     * @mbggenerated Tue Dec 05 19:31:30 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }
}