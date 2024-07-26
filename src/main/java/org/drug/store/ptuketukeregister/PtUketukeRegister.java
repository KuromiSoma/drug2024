
package org.drug.store.ptuketukeregister;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class PtUketukeRegister {
	private String ptName;
	private Timestamp birthdayDt;
	private int insuranceNo;
	private String insuranceCd;
	private String insuranceCd2;
	private int fuyoFlg;
	private int genderFlg;
    private Timestamp expDt;
    private String receiptDate;
	private int[] mdNo;
}