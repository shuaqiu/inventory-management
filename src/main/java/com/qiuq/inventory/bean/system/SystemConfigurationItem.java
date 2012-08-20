package com.qiuq.inventory.bean.system;

/**
 * 系統配置的選項
 * 
 * @author qiushaohua
 * 
 */
public enum SystemConfigurationItem {
    // 企業設置
    /**
     * 單位名稱
     */
    UNIT_NAME("sDWName"),

    /**
     * 單位地址
     */
    UNIT_ADDRESS("sDWAdd"),

    /**
     * 單位聯繫電話
     */
    UNIT_TEL("sDWTel"),

    /**
     * 單位傳真號碼
     */
    UNIT_FAX("sDWFax"),

    ;

    String key;

    private SystemConfigurationItem(String key) {
        this.key = key;
    }

    /**
     * 用在SystemConfiguration 的name 字段, 檢索對應的配置項
     * 
     * @Author qiushaohua @ Aug 12, 2012
     * @return
     */
    public String getKey() {
        return key;
    }
}
