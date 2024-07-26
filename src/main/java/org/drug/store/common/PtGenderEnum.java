package org.drug.store.common;

public enum PtGenderEnum {
	MALE(0,"男"),
	FEMALE(1,"女");

	final int code;
	final String label;

	private PtGenderEnum (int code , String label) {
		this.code = code;
		this.label = label;
	}

	public int getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}

	public static PtGenderEnum valueOf(int rm ) {
		switch (rm) {
			case 0:
			    return MALE;
		    case 1:
			    return FEMALE;
			default:
			    throw new IllegalArgumentException("argument out of range");
		}
	}
}