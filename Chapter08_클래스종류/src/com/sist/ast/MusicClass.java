package com.sist.ast;
// 기능은 동일 => 구현이 다른 경우 => 선언 
public abstract class MusicClass {
   private static Music[] musics=new Music[50];
   public abstract void musicAllData();
   // 추상메소드 
   // 목록 출력 
   public void musicPrint()
   {
	   System.out.println("뮤직 목록 출력");
   }
   // 검색 
   public void musicFind(String title)
   {
	   System.out.println(title+"로 검색 완료");
   }
}
