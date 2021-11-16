package Codes;

import Codes.Interfaces.Lawyer;
import Codes.datas.NormalHuman;
import Codes.datas.SmartHuman;

public class MainDrive {

	public static void main(String[] args) {

		NormalHuman nh1 = new NormalHuman();

		SmartHuman sh1 = new SmartHuman();

//		sh1은 변호사 활동 가능 (역할 O)

//		nh1은 sh1을 변호사로써 선임 (set)
		nh1.setMyLawyer(sh1);

		nh1.getProblem();

		NormalHuman nh2 = new NormalHuman();

		nh2.setMyLawyer(new Lawyer() {

			@Override
			public void defense() {

				System.out.println("평범한 내가 직접 변호합니다.");
				System.out.println("재판이 무승부로 되었습니다.");

			}
		});

		nh2.getProblem();
	}

}