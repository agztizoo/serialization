/**
 * AppUtil.java
 */
package com.github.jieshaocd.utils;

import java.text.SimpleDateFormat;

import org.springframework.util.StringUtils;

import com.github.jieshaocd.protobuff.ProtoApp;
import com.github.jieshaocd.protobuff.ProtoApp.App;
import com.github.jieshaocd.protobuff.ProtoApp.App.Builder;
import com.github.jieshaocd.protobuff.ProtoProvider;

/**
 * @author jieshao
 * @date Nov 16, 2015
 */
public class AppUtil {

    public static App copyFrom(com.github.jieshaocd.beanfactory.App other) {
        Builder builder = ProtoApp.App.newBuilder();
        builder.setId(other.getId());
        if (StringUtils.hasText(other.getName())) {
            builder.setName(other.getName());
        }
        if (StringUtils.hasText(other.getDescription())) {
            builder.setDescription(other.getDescription());
        }
        if (other.getSize() != null) {
            builder.setSize(other.getSize());
        }
        if (StringUtils.hasText(other.getPublisher())) {
            builder.setPublisher(other.getPublisher());
        }
        if (StringUtils.hasText(other.getApk())) {
            builder.setApk(other.getApk());
        }
        if (StringUtils.hasText(other.getIcon())) {
            builder.setIcon(other.getIcon());
        }
        if (StringUtils.hasText(other.getBannerIcon())) {
            builder.setBannerIcon(other.getBannerIcon());
        }
        if (StringUtils.hasText(other.getScreenshot())) {
            builder.setScreenshot(other.getScreenshot());
        }
        if (other.getStatus() != null) {
            builder.setStatus(other.getStatus());
        }
        if (StringUtils.hasText(other.getPackageName())) {
            builder.setPackageName(other.getPackageName());
        }
        if (StringUtils.hasText(other.getVersionCode())) {
            builder.setVersionCode(other.getVersionCode());
        }
        if (StringUtils.hasText(other.getVersionName())) {
            builder.setVersionName(other.getVersionName());
        }
        if (other.getAddTime() != null) {
            builder.setAddTime(new SimpleDateFormat("yyyy-MM-dd").format(other.getAddTime()));
        }
        if (other.getUpdateTime() != null) {
            builder.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").format(other.getUpdateTime()));
        }
        if (other.getDownloadCount() != null) {
            builder.setDownloadCount(other.getDownloadCount());
        }
        if (other.getRealDownloadCount() != null) {
            builder.setRealDownloadCount(other.getRealDownloadCount());
        }
        if (other.getRank() != null) {
            builder.setRank(other.getRank());
        }
        if (other.getReadCount() != null) {
            builder.setReadCount(other.getReadCount());
        }
        if (other.getRealReadCount() != null) {
            builder.setRealReadCount(other.getRealReadCount());
        }
        if (other.getRecommendCount() != null) {
            builder.setRecommendCount(other.getRecommendCount());
        }
        if (other.getAppType() != null) {
            builder.setAppType(other.getAppType());
        }
        if (StringUtils.hasText(other.getPayType())) {
            builder.setPayType(other.getPayType());
        }
        if (other.getPrice() != null) {
            builder.setPrice(other.getPrice());
        }
        if (StringUtils.hasText(other.getPercent())) {
            builder.setPercent(other.getPercent());
        }
        if (other.getChargeType() != null) {
            builder.setChargeType(other.getChargeType());
        }
        if (StringUtils.hasText(other.getTpApk())) {
            builder.setTpApk(other.getTpApk());
        }
        if (StringUtils.hasText(other.getTpIcon())) {
            builder.setTpIcon(other.getTpIcon());
        }
        if (StringUtils.hasText(other.getTpScreenshot())) {
            builder.setTpScreenshot(other.getTpScreenshot());
        }
        if (StringUtils.hasText(other.getUpApk())) {
            builder.setUpApk(other.getUpApk());
        }
        if (StringUtils.hasText(other.getUpIcon())) {
            builder.setUpIcon(other.getUpIcon());
        }
        if (StringUtils.hasText(other.getUpScreenshot())) {
            builder.setUpScreenshot(other.getUpScreenshot());
        }
        if (StringUtils.hasText(other.getOffshelfDesc())) {
            builder.setOffshelfDesc(other.getOffshelfDesc());
        }
        if (StringUtils.hasText(other.getRecommendName())) {
            builder.setRecommendName(other.getRecommendName());
        }
        if (StringUtils.hasText(other.getEditorRecommend())) {
            builder.setEditorRecommend(other.getEditorRecommend());
        }
        if (other.getLevel() != null) {
            builder.setLevel(other.getLevel());
        }
        if (StringUtils.hasText(other.getSujectComments())) {
            builder.setSujectComments(other.getSujectComments());
        }
        if (StringUtils.hasText(other.getCategory())) {
            builder.setCategory(other.getCategory());
        }
        if (other.getOffshelfManual() != null) {
            builder.setOffshelfManual(other.getOffshelfManual());
        }
        if (other.getSceneId() != null) {
            builder.setSceneId(other.getSceneId());
        }
        if (StringUtils.hasText(other.getApkMd5())) {
            builder.setApkMd5(other.getApkMd5());
        }
        com.github.jieshaocd.protobuff.ProtoProvider.Provider.Builder providerBuilder =
                ProtoProvider.Provider.newBuilder();
        if (other.getProvider().getId() != null) {
            providerBuilder.setId(other.getProvider().getId());
        }
        if (StringUtils.hasText(other.getProvider().getName())) {
            providerBuilder.setName(other.getProvider().getName());
        }
        builder.setProvider(providerBuilder.build());
        return builder.build();
    }

}
