package Codes.datas;

import Codes.Interfaces.Lawyer;

public class NormalHuman {

//	변호사가 누구인지 변수로 저장.
	Lawyer myLawyer = null; // 아직 선임된 변호사는 없다.

//	내 변호사 선임 (세팅) 기능 - 메소드

	public void setMyLawyer(Lawyer l) {
		this.myLawyer = l;
	}

//	법적 문제에 처하는 함수.

	public void getProblem() {

//		변호 능력이 없다.

//		내 변호사가 있다면? -> 변호사에게 대신 방어 맡기자.
		if (this.myLawyer != null) {
			this.myLawyer.defense();
		} else {
			System.out.println("재판에서 졌습니다.");
		}

	}

}
