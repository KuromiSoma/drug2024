package org.drug.store.ptuketukeregister;

import lombok.Data;

@Data
public class PtUketukeRegisterForm {
	private String ptName;                    //患者名
	private String birthdayDtYear;            //生年月日_年
	private String birthdayDtMonth;           //生年月日_月
	private String birthdayDtDay;             //生年月日_日
	private int insuranceNo;                 //保険番号
	private String insuranceCd;              //保険記号
	private String insuranceCd2;             //保険記号2
	private int fuyoFlg;                    //扶養
	private int genderFlg;                  //性別
	private String expDtYear;               //有効期限_年
	private String expDtMonth;              //有効期限_月
	private String expDtDay;                //有効期限_日
	private String receiptDtYear;            //受付日_年
	private String receiptDtMonth;           //受付日_月
	private String receiptDtDay;             //受付日_日
	private int[] mdNo;                     //薬番号
}