package org.drug.store.common;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.util.StringUtils;

public class DrugCommonUtil {
	private static DateTimeFormatter DATEFORMAT_DATETIME = DateTimeFormatter.ofPattern("yyyyMMDDHHmmss");
	private static DateTimeFormatter DATEFORMAT_DATE = DateTimeFormatter.ofPattern("yyyyMMdd");

	   /**
     * 日時文字列(YYYYMMDDHHMISS)をTimestamp値に変換
     *
     * @param srcString
     * @return 日時yyyyMMddHHmmssのTimestamp値
     */

	public static Timestamp dateTimeStringToTimestamp(String srcString) {
		if(isEmpty(srcString)) {
			return null;
		}try {
			LocalDateTime dateTime = LocalDateTime.parse(srcString, DATEFORMAT_DATETIME);
			return Timestamp.valueOf(dateTime);
		}catch(DateTimeParseException e){
			return dateStringToTimestamp(srcString);
		}
	}

	 /**
     * 日付文字列(YYYYMMDD)をTimestamp値に変換
     *
     * @param srcString
     * @return 日時yyyyMMddのTimestamp値
     */
	public static Timestamp dateStringToTimestamp(String srcString) {
		if(isEmpty(srcString)) {
			return null;
		}try {
			LocalDate date = LocalDate.parse(srcString, DATEFORMAT_DATE);
			return Timestamp.valueOf(date.atTime(LocalTime.MIN));
		}catch(DateTimeParseException e) {
			return null;
		}
	}

	 /**
     * 拡張null判定。null、空文字に加えて文字列"null"もtrueと判定する.
     *
     * @param val
     *            判定文字列
     * @return 判定結果
     */

	public static boolean isEmpty(String val) {
		if(StringUtils.isEmpty(val)||StringUtils.pathEquals(val, "null")) {
			return true;
		}
		return false;
	}

}