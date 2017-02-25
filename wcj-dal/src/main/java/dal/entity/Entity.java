package dal.entity;

import java.util.Date;

/**
 * Created by wcj on 2017/1/16.
 */

public class Entity {
    private Long id;
    private Date gmtCreate;
    private Date gmtModify;
    private IsDeleted isDeleted;

    public enum IsDeleted {
        n,
        y
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public IsDeleted getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(IsDeleted isDeleted) {
        this.isDeleted = isDeleted;
    }
}
