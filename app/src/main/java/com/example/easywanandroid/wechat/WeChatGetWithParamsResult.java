package com.example.easywanandroid.wechat;

import java.util.List;

public class WeChatGetWithParamsResult {
    @Override
    public String toString() {
        return "WeChatGetWithParamsResult{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12840,"link":"https://mp.weixin.qq.com/s/o2_2DeAIcJGYSvm2WlhUxg","niceDate":"2020-04-13 00:00","niceShareDate":"2020-04-13 10:12","origin":"","prefix":"","projectLink":"","publishTime":1586707200000,"selfVisible":0,"shareDate":1586743964000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google 更新系列：是时候丢掉 onActivityResult 了 ！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12839,"link":"https://mp.weixin.qq.com/s/UqMe80FCJJpczkuZTix-Hg","niceDate":"2020-04-12 00:00","niceShareDate":"2020-04-13 10:12","origin":"","prefix":"","projectLink":"","publishTime":1586620800000,"selfVisible":0,"shareDate":1586743944000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列：搞了个酷酷的效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12838,"link":"https://mp.weixin.qq.com/s/Zqg9l0C9UgcmAxAqvOtGmQ","niceDate":"2020-04-11 00:00","niceShareDate":"2020-04-13 10:12","origin":"","prefix":"","projectLink":"","publishTime":1586534400000,"selfVisible":0,"shareDate":1586743926000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google又更新了：实战 MergeAdapter","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12837,"link":"https://mp.weixin.qq.com/s/SkXgevDiQF9T4kyoL4_qVg","niceDate":"2020-04-09 00:00","niceShareDate":"2020-04-13 10:11","origin":"","prefix":"","projectLink":"","publishTime":1586361600000,"selfVisible":0,"shareDate":1586743910000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"那个男人再发力，原来我以前学的 Lambda 都是假的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12836,"link":"https://mp.weixin.qq.com/s/MOWdbI5IREjQP1Px-WJY1Q","niceDate":"2020-04-08 00:00","niceShareDate":"2020-04-13 10:11","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586743892000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个至今仍有很多人写错的技术点！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12835,"link":"https://mp.weixin.qq.com/s/EioJ8ogsCxQEFm44mKFiOQ","niceDate":"2020-04-05 00:00","niceShareDate":"2020-04-13 10:11","origin":"","prefix":"","projectLink":"","publishTime":1586016000000,"selfVisible":0,"shareDate":1586743871000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"App 黑白化实现探索2， 发现了一种更方便的方案，我被锤了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12834,"link":"https://mp.weixin.qq.com/s/8fTWLYaPhi0to47EUmFd7A","niceDate":"2020-04-04 00:00","niceShareDate":"2020-04-13 10:08","origin":"","prefix":"","projectLink":"","publishTime":1585929600000,"selfVisible":0,"shareDate":1586743725000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"App 黑白化实现探索，有一行代码实现的方案吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12833,"link":"https://mp.weixin.qq.com/s/VOcfOW24OYaAG4-ju0Mx0g","niceDate":"2020-04-03 00:00","niceShareDate":"2020-04-13 10:08","origin":"","prefix":"","projectLink":"","publishTime":1585843200000,"selfVisible":0,"shareDate":1586743708000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"特效系列，仿instagram文字排版特效","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12832,"link":"https://mp.weixin.qq.com/s/uENpxB7Ns_x-5E2pTHwFdQ","niceDate":"2020-04-02 00:00","niceShareDate":"2020-04-13 10:08","origin":"","prefix":"","projectLink":"","publishTime":1585756800000,"selfVisible":0,"shareDate":1586743692000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"\u200b吹爆系列：深入探索 Android 包体积优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12831,"link":"https://mp.weixin.qq.com/s/7FE0a9UI5sB538pA6kxpQA","niceDate":"2020-03-31 00:00","niceShareDate":"2020-04-13 10:06","origin":"","prefix":"","projectLink":"","publishTime":1585584000000,"selfVisible":0,"shareDate":1586743615000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android &ldquo;易错&rdquo; 知识来了!","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12625,"link":"https://mp.weixin.qq.com/s/F0VJyCpOG_CR0edNdbAqPQ","niceDate":"2020-03-27 00:00","niceShareDate":"2020-03-27 13:15","origin":"","prefix":"","projectLink":"","publishTime":1585238400000,"selfVisible":0,"shareDate":1585286106000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"善于将系统源码为己用，会&ldquo;抄&rdquo;也是技能！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12624,"link":"https://mp.weixin.qq.com/s/Kc1826MQ3ReMkoIWlsQGVw","niceDate":"2020-03-25 00:00","niceShareDate":"2020-03-27 13:14","origin":"","prefix":"","projectLink":"","publishTime":1585065600000,"selfVisible":0,"shareDate":1585286067000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"MVC / MVP / MVVM 到底该如何选？有对错吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12623,"link":"https://mp.weixin.qq.com/s/GpVSc6jSiG9JqMh07awc5A","niceDate":"2020-03-23 00:00","niceShareDate":"2020-03-27 13:13","origin":"","prefix":"","projectLink":"","publishTime":1584892800000,"selfVisible":0,"shareDate":1585286026000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"分享 2 个 &ldquo;容易误解&rdquo; 的Android 知识点","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12622,"link":"https://mp.weixin.qq.com/s/PhZ9iHl-4s7VXKF-G_s9Xw","niceDate":"2020-03-22 00:00","niceShareDate":"2020-03-27 13:13","origin":"","prefix":"","projectLink":"","publishTime":1584806400000,"selfVisible":0,"shareDate":1585286005000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"我搞了个&ldquo;牛逼&rdquo;的功能！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12621,"link":"https://mp.weixin.qq.com/s/9uVAN3i5o0pCsOFpgRZ9Jg","niceDate":"2020-03-20 00:00","niceShareDate":"2020-03-27 13:13","origin":"","prefix":"","projectLink":"","publishTime":1584633600000,"selfVisible":0,"shareDate":1585285986000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 10 适配攻略，你适配了吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12620,"link":"https://mp.weixin.qq.com/s/uvyx4LwHaMOYQw9WYBvpvg","niceDate":"2020-03-19 00:00","niceShareDate":"2020-03-27 13:12","origin":"","prefix":"","projectLink":"","publishTime":1584547200000,"selfVisible":0,"shareDate":1585285967000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google 的 Flutter Clock 大赛优秀项目推荐","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12619,"link":"https://mp.weixin.qq.com/s/cpJWYAcvqtlG5qRIbFOQKg","niceDate":"2020-03-18 00:00","niceShareDate":"2020-03-27 13:12","origin":"","prefix":"","projectLink":"","publishTime":1584460800000,"selfVisible":0,"shareDate":1585285948000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"吹爆系列：深入探索Android稳定性优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12618,"link":"https://mp.weixin.qq.com/s/ZdlLn_ayHz4ByIKdqhXqTA","niceDate":"2020-03-16 00:00","niceShareDate":"2020-03-27 13:12","origin":"","prefix":"","projectLink":"","publishTime":1584288000000,"selfVisible":0,"shareDate":1585285928000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"&ldquo;新技术&rdquo; 又又来了？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12358,"link":"https://mp.weixin.qq.com/s/KQZStDBfhCg_M2a-YKNQdw","niceDate":"2020-03-12 00:00","niceShareDate":"2020-03-12 14:33","origin":"","prefix":"","projectLink":"","publishTime":1583942400000,"selfVisible":0,"shareDate":1583994793000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 模仿微信读书文字左右对齐效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12357,"link":"https://mp.weixin.qq.com/s/4tMR7_sDIthzm0BXtICh-w","niceDate":"2020-03-11 00:00","niceShareDate":"2020-03-12 14:32","origin":"","prefix":"","projectLink":"","publishTime":1583856000000,"selfVisible":0,"shareDate":1583994775000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google Fuchsia 进入测试阶段，对 Flutter 有啥影响？","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":46,"size":20,"total":907}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "curPage=" + curPage +
                    ", offset=" + offset +
                    ", over=" + over +
                    ", pageCount=" + pageCount +
                    ", size=" + size +
                    ", total=" + total +
                    ", datas=" + datas +
                    '}';
        }

        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12840,"link":"https://mp.weixin.qq.com/s/o2_2DeAIcJGYSvm2WlhUxg","niceDate":"2020-04-13 00:00","niceShareDate":"2020-04-13 10:12","origin":"","prefix":"","projectLink":"","publishTime":1586707200000,"selfVisible":0,"shareDate":1586743964000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google 更新系列：是时候丢掉 onActivityResult 了 ！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12839,"link":"https://mp.weixin.qq.com/s/UqMe80FCJJpczkuZTix-Hg","niceDate":"2020-04-12 00:00","niceShareDate":"2020-04-13 10:12","origin":"","prefix":"","projectLink":"","publishTime":1586620800000,"selfVisible":0,"shareDate":1586743944000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"这交互炸了系列：搞了个酷酷的效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12838,"link":"https://mp.weixin.qq.com/s/Zqg9l0C9UgcmAxAqvOtGmQ","niceDate":"2020-04-11 00:00","niceShareDate":"2020-04-13 10:12","origin":"","prefix":"","projectLink":"","publishTime":1586534400000,"selfVisible":0,"shareDate":1586743926000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google又更新了：实战 MergeAdapter","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12837,"link":"https://mp.weixin.qq.com/s/SkXgevDiQF9T4kyoL4_qVg","niceDate":"2020-04-09 00:00","niceShareDate":"2020-04-13 10:11","origin":"","prefix":"","projectLink":"","publishTime":1586361600000,"selfVisible":0,"shareDate":1586743910000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"那个男人再发力，原来我以前学的 Lambda 都是假的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12836,"link":"https://mp.weixin.qq.com/s/MOWdbI5IREjQP1Px-WJY1Q","niceDate":"2020-04-08 00:00","niceShareDate":"2020-04-13 10:11","origin":"","prefix":"","projectLink":"","publishTime":1586275200000,"selfVisible":0,"shareDate":1586743892000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个至今仍有很多人写错的技术点！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12835,"link":"https://mp.weixin.qq.com/s/EioJ8ogsCxQEFm44mKFiOQ","niceDate":"2020-04-05 00:00","niceShareDate":"2020-04-13 10:11","origin":"","prefix":"","projectLink":"","publishTime":1586016000000,"selfVisible":0,"shareDate":1586743871000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"App 黑白化实现探索2， 发现了一种更方便的方案，我被锤了！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12834,"link":"https://mp.weixin.qq.com/s/8fTWLYaPhi0to47EUmFd7A","niceDate":"2020-04-04 00:00","niceShareDate":"2020-04-13 10:08","origin":"","prefix":"","projectLink":"","publishTime":1585929600000,"selfVisible":0,"shareDate":1586743725000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"App 黑白化实现探索，有一行代码实现的方案吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12833,"link":"https://mp.weixin.qq.com/s/VOcfOW24OYaAG4-ju0Mx0g","niceDate":"2020-04-03 00:00","niceShareDate":"2020-04-13 10:08","origin":"","prefix":"","projectLink":"","publishTime":1585843200000,"selfVisible":0,"shareDate":1586743708000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"特效系列，仿instagram文字排版特效","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12832,"link":"https://mp.weixin.qq.com/s/uENpxB7Ns_x-5E2pTHwFdQ","niceDate":"2020-04-02 00:00","niceShareDate":"2020-04-13 10:08","origin":"","prefix":"","projectLink":"","publishTime":1585756800000,"selfVisible":0,"shareDate":1586743692000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"\u200b吹爆系列：深入探索 Android 包体积优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12831,"link":"https://mp.weixin.qq.com/s/7FE0a9UI5sB538pA6kxpQA","niceDate":"2020-03-31 00:00","niceShareDate":"2020-04-13 10:06","origin":"","prefix":"","projectLink":"","publishTime":1585584000000,"selfVisible":0,"shareDate":1586743615000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android &ldquo;易错&rdquo; 知识来了!","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12625,"link":"https://mp.weixin.qq.com/s/F0VJyCpOG_CR0edNdbAqPQ","niceDate":"2020-03-27 00:00","niceShareDate":"2020-03-27 13:15","origin":"","prefix":"","projectLink":"","publishTime":1585238400000,"selfVisible":0,"shareDate":1585286106000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"善于将系统源码为己用，会&ldquo;抄&rdquo;也是技能！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12624,"link":"https://mp.weixin.qq.com/s/Kc1826MQ3ReMkoIWlsQGVw","niceDate":"2020-03-25 00:00","niceShareDate":"2020-03-27 13:14","origin":"","prefix":"","projectLink":"","publishTime":1585065600000,"selfVisible":0,"shareDate":1585286067000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"MVC / MVP / MVVM 到底该如何选？有对错吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12623,"link":"https://mp.weixin.qq.com/s/GpVSc6jSiG9JqMh07awc5A","niceDate":"2020-03-23 00:00","niceShareDate":"2020-03-27 13:13","origin":"","prefix":"","projectLink":"","publishTime":1584892800000,"selfVisible":0,"shareDate":1585286026000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"分享 2 个 &ldquo;容易误解&rdquo; 的Android 知识点","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12622,"link":"https://mp.weixin.qq.com/s/PhZ9iHl-4s7VXKF-G_s9Xw","niceDate":"2020-03-22 00:00","niceShareDate":"2020-03-27 13:13","origin":"","prefix":"","projectLink":"","publishTime":1584806400000,"selfVisible":0,"shareDate":1585286005000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"我搞了个&ldquo;牛逼&rdquo;的功能！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12621,"link":"https://mp.weixin.qq.com/s/9uVAN3i5o0pCsOFpgRZ9Jg","niceDate":"2020-03-20 00:00","niceShareDate":"2020-03-27 13:13","origin":"","prefix":"","projectLink":"","publishTime":1584633600000,"selfVisible":0,"shareDate":1585285986000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 10 适配攻略，你适配了吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12620,"link":"https://mp.weixin.qq.com/s/uvyx4LwHaMOYQw9WYBvpvg","niceDate":"2020-03-19 00:00","niceShareDate":"2020-03-27 13:12","origin":"","prefix":"","projectLink":"","publishTime":1584547200000,"selfVisible":0,"shareDate":1585285967000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google 的 Flutter Clock 大赛优秀项目推荐","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12619,"link":"https://mp.weixin.qq.com/s/cpJWYAcvqtlG5qRIbFOQKg","niceDate":"2020-03-18 00:00","niceShareDate":"2020-03-27 13:12","origin":"","prefix":"","projectLink":"","publishTime":1584460800000,"selfVisible":0,"shareDate":1585285948000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"吹爆系列：深入探索Android稳定性优化","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12618,"link":"https://mp.weixin.qq.com/s/ZdlLn_ayHz4ByIKdqhXqTA","niceDate":"2020-03-16 00:00","niceShareDate":"2020-03-27 13:12","origin":"","prefix":"","projectLink":"","publishTime":1584288000000,"selfVisible":0,"shareDate":1585285928000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"&ldquo;新技术&rdquo; 又又来了？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12358,"link":"https://mp.weixin.qq.com/s/KQZStDBfhCg_M2a-YKNQdw","niceDate":"2020-03-12 00:00","niceShareDate":"2020-03-12 14:33","origin":"","prefix":"","projectLink":"","publishTime":1583942400000,"selfVisible":0,"shareDate":1583994793000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 模仿微信读书文字左右对齐效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":12357,"link":"https://mp.weixin.qq.com/s/4tMR7_sDIthzm0BXtICh-w","niceDate":"2020-03-11 00:00","niceShareDate":"2020-03-12 14:32","origin":"","prefix":"","projectLink":"","publishTime":1583856000000,"selfVisible":0,"shareDate":1583994775000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Google Fuchsia 进入测试阶段，对 Flutter 有啥影响？","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 46
         * size : 20
         * total : 907
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author : 鸿洋
             * canEdit : false
             * chapterId : 408
             * chapterName : 鸿洋
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * id : 12840
             * link : https://mp.weixin.qq.com/s/o2_2DeAIcJGYSvm2WlhUxg
             * niceDate : 2020-04-13 00:00
             * niceShareDate : 2020-04-13 10:12
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1586707200000
             * selfVisible : 0
             * shareDate : 1586743964000
             * shareUser :
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/408/1"}]
             * title : Google 更新系列：是时候丢掉 onActivityResult 了 ！
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 公众号
                 * url : /wxarticle/list/408/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
