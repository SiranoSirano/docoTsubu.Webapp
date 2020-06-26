package model;

import java.util.List;

//つぶやきの投稿に関する処理を行うモデル

public class PostMutterLogic {
	public void execute(Mutter mutter,List<Mutter> mutterList) {
		//ArrayListにインスタンスを格納
		//第一引数で格納位置（インデックス）を、第二引数で格納するインスタンスを挿入していく
		mutterList.add(0,mutter); //先頭に追加
	}


}
