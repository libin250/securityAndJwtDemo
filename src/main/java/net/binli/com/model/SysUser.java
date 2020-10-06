package net.binli.com.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author:bin.li
 * @date:2020/9/29 16:16
 * @description:系统用户
 */
@Entity
@Table(name = "sys_user", schema = "security_jwt", catalog = "")
public class SysUser {

    private String id;
    private String userName;
    private String passWord;
    private String roleId;
    private Byte status;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "pass_word")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "role_id")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(id, sysUser.id) &&
                Objects.equals(userName, sysUser.userName) &&
                Objects.equals(passWord, sysUser.passWord) &&
                Objects.equals(roleId, sysUser.roleId) &&
                Objects.equals(status, sysUser.status) &&
                Objects.equals(createTime, sysUser.createTime) &&
                Objects.equals(updateTime, sysUser.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, passWord, roleId, status, createTime, updateTime);
    }
}
