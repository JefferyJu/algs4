package com.jujianfei.algs4;

/**
 * 拼接SQL
 * @author jeffery
 * @date 2018-10-29 09:07
 */
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
