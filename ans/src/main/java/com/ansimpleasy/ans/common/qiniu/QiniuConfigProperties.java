package com.ansimpleasy.ans.common.qiniu;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author LiuCan
 * @date 2019/12/13 14:47
 */
@ConfigurationProperties(prefix = "qiniu")
public class QiniuConfigProperties {

    String accesskey;

    String secretkey;

    String bucket;

    String cdns;

    public String getAccesskey() {
        return accesskey;
    }

    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey;
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getCdns() {
        return cdns;
    }

    public void setCdns(String cdns) {
        this.cdns = cdns;
    }

}