package com.jujianfei.algs4;

/*********************************************************
 * 文件名称： SQLUtil.java
 * 系统名称： 区块链系统 V1.0
 * 模块名称： com.jujianfei.algs4
 * 功能说明： TODO jujf26056
 * 开发人员： jujf26056
 * 开发时间： 2018/10/26 9:25
 * 修改记录： 程序版本 修改日期 修改人员 修改单号 修改说明
 *********************************************************/
public class SQLUtil {
    public static void main(String[] args) {
        String sql = "UPDATE FORFEITING_FORM SET FORM_ID = FORM_ID,FORM_STATUS = ?,MODIFY_DATE = ? WHERE FORM_ID = ?";
        String paramStr = "03(String), 2018-10-26 00:00:00.026(Timestamp), 33bcd46ef3eef-4b4d-aa0a-4e57ace8ebf1(String)";
        String[] params = paramStr.split(",");
        for (String param : params) {
            if (param.contains("Timestamp")) {
                param = "sysdate";
            } else {
                param = "'" + param.substring(0, param.indexOf("(")).trim() + "'";
            }
            sql = sql.replaceFirst("\\?", param);
        }
        System.out.println(sql);
    }
}
