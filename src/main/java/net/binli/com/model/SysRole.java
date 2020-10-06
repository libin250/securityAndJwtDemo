package net.binli.com.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Author:bin.li
 * @date:2020/9/29 16:16
 * @description:角色
 */
@Entity
@Table(name = "sys_role", schema = "security_jwt", catalog = "")
public class SysRole {
    private String id;
    private String roleName;
    private Byte status;

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
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRole sysRole = (SysRole) o;
        return Objects.equals(id, sysRole.id) &&
                Objects.equals(roleName, sysRole.roleName) &&
                Objects.equals(status, sysRole.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName, status);
    }
}
