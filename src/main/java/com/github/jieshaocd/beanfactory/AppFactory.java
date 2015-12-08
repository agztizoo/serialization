/**
 * AppFactory.java
 */
package com.github.jieshaocd.beanfactory;

import java.util.Date;

/**
 * @author jieshao
 * @date Nov 12, 2015
 */
public class AppFactory {

    public static App createInstance() {
        App app = new App();
        app.setId(1);
        app.setName("搜狐应用中心");
        app.setDescription("搜狐应用中心是搜狐推出的移动应用商店，涵盖了数10万款安卓软件、游戏等丰富资源，界面简洁、操作方便，速度飞快。依托搜狐开发者联盟的强大支持及强大的内容运营团队，每天不断有新鲜作品与大家见面，将优秀软件、游戏及时、迅速、安全、方便的展示在你面前！ 功能特点： 新鲜应用首发，独家尝鲜 贴心有趣专题，只此一家 海量软件资源，应有尽有 云端压缩数据，节省流量 持断点续传，享受极速体验 双重数据审核，永久免费 用户测试反馈交流群：94219539");
        app.setSize(1686055);
        app.setPublisher("北京搜狐新时代信息技术有限公司");
        app.setTpApk("http://m.baidu.com/api?action=redirect&token=tcl&from=1001836t&type=app&dltype=new&tj=soft_3954492_667566_%E6%90%9C%E7%8B%90%E5%BA%94%E7%94%A8%E4%B8%AD%E5%BF%83&blink=cda9687474703a2f2f616e616c79746963732e3136332e636f6d2f6e7465735f64776c643f70726f643d33676d61726b65742669643d333038363731352670663d322663673d4341384d5447474e334a3238267369676e3d65636136633963396564326433646164373639306631366636633636363731302675726c3d6874747025334125324625324666696c652e6d2e3136332e636f6d253246617070253246667265652532463230313330382532463037253246636f6d2e736f68752e73746f72655f34322e61706bd752&crversion=1");
        app.setTpIcon("http://cdn00.baidu-img.cn/timg?vsapp&size=b800_800&quality=100&imgtype=3&sec=1389865421&di=b4808e813341775dbe3d1ea5e0f68cd9&src=http%3A%2F%2Fc.hiphotos.bdimg.com%2Fwisegame%2Fpic%2Fitem%2Fd37eca8065380cd7eee0100aa044ad345882815f.jpg");
        app.setTpScreenshot("http://cdn00.baidu-img.cn/timg?vsapp&size=b800_800&quality=100&imgtype=3&sec=1389865421&di=08b7eb678a85b55b62891c2489208498&src=http%3A%2F%2Fc.hiphotos.bdimg.com%2Fwisegame%2Fpic%2Fitem%2Fb42a6059252dd42a40efb34c023b5bb5c8eab877.jpg,http://cdn00.baidu-img.cn/timg?vsapp&size=b800_800&quality=100&imgtype=3&sec=1389865421&di=8af9973bbd6533a49cf2c1653df62d67&src=http%3A%2F%2Fd.hiphotos.bdimg.com%2Fwisegame%2Fpic%2Fitem%2F462dd42a2834349b69e0dc62c8ea15ce37d3be77.jpg,http://cdn00.baidu-img.cn/timg?vsapp&size=b800_800&quality=100&imgtype=3&sec=1389865421&di=08a5746da8a1988b165d10efbdd7aed4&src=http%3A%2F%2Fe.hiphotos.bdimg.com%2Fwisegame%2Fpic%2Fitem%2Ff22397dda144ad34da413560d1a20cf430ad855f.jpg,http://cdn00.baidu-img.cn/timg?vsapp&size=b800_800&quality=100&imgtype=3&sec=1389865421&di=88bffd9952008acc03f6bfc69032bd90&src=http%3A%2F%2Ff.hiphotos.bdimg.com%2Fwisegame%2Fpic%2Fitem%2Fb72a2834349b033b306e4e3d14ce36d3d439bd77.jpg");
        app.setStatus(0);
        app.setPackageName("com.sohu.store");
        app.setVersionCode("42");
        app.setVersionName("2.3.2");
        app.setAddTime(new Date());
        app.setUpdateTime(new Date());
        app.setDownloadCount(62942L);
        app.setReadCount(0L);
        app.setRank(0L);
        app.setReadCount(4L);
        app.setRealReadCount(5L);
        app.setRecommendCount(0L);
        app.setAppType(0);
        app.setPayType("0");
        app.setPrice(0.0f);
        app.setPercent("0");
        app.setChargeType(0);
        app.setOffshelfManual(Boolean.FALSE);
        Provider provider = new Provider();
        provider.setId(1);
        provider.setName("百度");
        app.setProvider(provider);
        return app;
    }

}
