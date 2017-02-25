package dal.entity.user;

import dal.entity.Entity;
import dal.entity.comment.ClassType;
import dal.entity.comment.Gender;

import javax.validation.constraints.Size;

/**
 * Created by wcj on 2017/1/16.
 */
public class UserDO extends Entity{
    private String username;
    /**
     * 用户NICK
     */
    @Size(min = 2, max = 8)
    private String nick;
    /**
     * 密码
     */
    @Size(min = 6, max = 20)
    private String password;
    /**
     * 手机
     */
    @Size(min = 8, max = 16)
    private String phone;

    /**
     * 头像地址
     */
    private String avatar;
    /**
     * 背景
     */
    private String bgImage;
    /**
     * 性别
     */
    private Gender gender;
    /**
     * 个人介绍
     */
    @Size(max = 140)
    private String introduction;
    /**
     * 盐
     */
    private String salt;
    /**
     * 账号分类：官方、普通
     */
    private ClassType classType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBgImage() {
        return bgImage;
    }

    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
}
