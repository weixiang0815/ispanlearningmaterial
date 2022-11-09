package ch12._01_enum._03;

public enum CarEnum {
	BMW("bmw"), TOYOTA("tOYOTA"), FIAT("FiAt"), AUDI("AUDI");
	private String carType;
	private CarEnum(String carType) {
		this.carType = carType;
	}
	public String toString() {
		// 將第一個字母大寫，其餘字母小寫
		return carType.substring(0, 1).toUpperCase() + 
				carType.substring(1).toLowerCase(); 
	}
}

