package com.teiphu.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.data.annotation.Persistent;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @Author Teiphu
 * @Date 2019.03.08 下午 3:41
 **/
@JsonInclude(Include.NON_NULL)
public class UserDo implements Serializable {

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<AnswerDo> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<AnswerDo> answers) {
        this.answers = answers;
    }

    public enum Role {
        admin, normal
    }

    private Role role;

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String sex;
    private Timestamp birthday;
    private String job;
    private String signature;
    private String address;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private Timestamp gmtLogout;
    private Integer status;
    private Integer delete;
    /*用户关注问题后收到的答案列表*/
    private Set<AnswerDo> answers;

    public UserDo() {
    }

    public UserDo(String email, String phone, String password) {
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public UserDo(String userName, String password, String email, String phone, String sex, Timestamp birthday,
                  String job, String signature) {
        this.username = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.birthday = birthday;
        this.job = job;
        this.signature = signature;
    }

    public UserDo(Integer id, String userName, String password, String email, String phone, String sex,
                  Timestamp birthday, String job, String signature) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.birthday = birthday;
        this.job = job;
        this.signature = signature;
    }

    public UserDo(Integer userId) {
        this.id = userId;
    }

    public UserDo(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Timestamp getGmtLogout() {
        return gmtLogout;
    }

    public void setGmtLogout(Timestamp gmtLogout) {
        this.gmtLogout = gmtLogout;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}
