package com.github.jieshaocd.beanfactory;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

public class App implements Serializable {
    private static final long serialVersionUID = 10002L;

    private Integer id;
    private String name;
    private String description;
    private Integer size;
    private String publisher;
    private String apk;
    private String icon;
    private String bannerIcon;
    private String screenshot;
    private Integer status;
    private String packageName;
    private String versionCode;
    private String versionName;
    private Date addTime;
    private Date updateTime;
    private Long downloadCount;
    private Long realDownloadCount;
    private Long rank;
    private Long readCount;
    private Long realReadCount;
    private Long recommendCount;
    private Integer appType;
    private String payType;
    private Float price;
    private String percent;
    private Integer chargeType;
    private String tpApk;
    private String tpIcon;
    private String tpScreenshot;
    private String upScreenshot;
    private String upIcon;
    private String upApk;
    private Boolean offshelfManual;
    private String recommendName; // 推广名
    private String editorRecommend; // 编辑推荐-short descirption

    // The avg star field, this field is in stars_statistics table
    private Integer level;
    private Provider provider;
    private String sujectComments; // 专题中的点评
    private String category; // 第一个所属分类
    //下架描述
    private String offshelfDesc;
    //场景ID
    private Integer sceneId;
    private String apkMd5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getApk() {
        return apk;
    }

    public void setApk(String apk) {
        this.apk = apk;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBannerIcon() {
        return bannerIcon;
    }

    public void setBannerIcon(String bannerIcon) {
        this.bannerIcon = bannerIcon;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Long getRealDownloadCount() {
        return realDownloadCount;
    }

    public void setRealDownloadCount(Long realDownloadCount) {
        this.realDownloadCount = realDownloadCount;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getReadCount() {
        return readCount;
    }

    public void setReadCount(Long readCount) {
        this.readCount = readCount;
    }

    public Long getRealReadCount() {
        return realReadCount;
    }

    public void setRealReadCount(Long realReadCount) {
        this.realReadCount = realReadCount;
    }

    public Long getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public String getTpApk() {
        return tpApk;
    }

    public void setTpApk(String tpApk) {
        this.tpApk = tpApk;
    }

    public String getTpIcon() {
        return tpIcon;
    }

    public void setTpIcon(String tpIcon) {
        this.tpIcon = tpIcon;
    }

    public String getTpScreenshot() {
        return tpScreenshot;
    }

    public void setTpScreenshot(String tpScreenshot) {
        this.tpScreenshot = tpScreenshot;
    }

    public String getUpScreenshot() {
        return upScreenshot;
    }

    public void setUpScreenshot(String upScreenshot) {
        this.upScreenshot = upScreenshot;
    }

    public String getUpIcon() {
        return upIcon;
    }

    public void setUpIcon(String upIcon) {
        this.upIcon = upIcon;
    }

    public String getUpApk() {
        return upApk;
    }

    public void setUpApk(String upApk) {
        this.upApk = upApk;
    }

    public Boolean getOffshelfManual() {
        return offshelfManual;
    }

    public void setOffshelfManual(Boolean offshelfManual) {
        this.offshelfManual = offshelfManual;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }

    public String getEditorRecommend() {
        return editorRecommend;
    }

    public void setEditorRecommend(String editorRecommend) {
        this.editorRecommend = editorRecommend;
    }

    public String getSujectComments() {
        return sujectComments;
    }

    public void setSujectComments(String sujectComments) {
        this.sujectComments = sujectComments;
    }

	public String getOffshelfDesc() {
		return offshelfDesc;
	}

	public void setOffshelfDesc(String offshelfDesc) {
		this.offshelfDesc = offshelfDesc;
	}

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }
    public String getApkMd5() {
        return apkMd5;
    }

    public void setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", getId()).append("name", getName())
                .append("package_name", getPackageName()).append("provider", getProvider().getName()).toString();
    }

}