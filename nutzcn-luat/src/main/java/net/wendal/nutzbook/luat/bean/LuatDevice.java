package net.wendal.nutzbook.luat.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.EL;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import net.wendal.nutzbook.core.bean.BasePojo;
import net.wendal.nutzbook.core.bean.User;

@Table("t_luat_dev")
@TableIndexes({@Index(fields = {"imei", "projectId"}, unique = false)})
public class LuatDevice extends BasePojo {
    private static final long serialVersionUID = 1L;
    @Id(auto = false)
    @Prev(els = @EL("ig(view.tableName)"))
    private long id;
    @Column
    private String imei;
    @Column
    private String iccid;
    @Column
    private String imsi;
    @Column
    private String msisdn;
    @Column
    private long projectId;
    @Column
    private long userId;
    @Column
    private String firmwareName;
    @Column
    private String versionStr;
    @Column
    private int versionInt;
    @Column
    private double lat;
    @Column
    private double lng;
    @Column
    private String province;
    @Column
    private String city;
    @Column
    private String content;
    @Column
    private String tags;
    @Column
    private long lockedTime;
    @Column
    private String lockedReson;

    @One
    private User user;

    @One
    private LuatProject project;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public String getVersionStr() {
        return versionStr;
    }

    public void setVersionStr(String versionStr) {
        this.versionStr = versionStr;
    }

    public int getVersionInt() {
        return versionInt;
    }

    public void setVersionInt(int versionInt) {
        this.versionInt = versionInt;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public long getLockedTime() {
        return lockedTime;
    }

    public void setLockedTime(long lockedTime) {
        this.lockedTime = lockedTime;
    }

    public String getLockedReson() {
        return lockedReson;
    }

    public void setLockedReson(String lockedReson) {
        this.lockedReson = lockedReson;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LuatProject getProject() {
        return project;
    }

    public void setProject(LuatProject project) {
        this.project = project;
    }

}
