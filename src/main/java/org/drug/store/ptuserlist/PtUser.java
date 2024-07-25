package org.drug.store.ptuserlist;

import lombok.Data;

@Data
public class PtUser {
    private int ptNo;
    private String ptName;
    private String birthdayDt;
	private int insuranceNo;
	private String insuranceCd;
	private String insuranceCd2;
    private int fuyoFlg;
    private String expDt;
}