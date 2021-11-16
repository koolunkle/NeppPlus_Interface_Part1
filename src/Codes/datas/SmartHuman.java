package Codes.datas;

import Codes.Interfaces.Lawyer;

public class SmartHuman implements Lawyer {

	@Override
	public void defense() {
		System.out.println("똑똑한 사람이 변호 합니다.");
		System.out.println("재판에서 이겼습니다.");

	}

}
