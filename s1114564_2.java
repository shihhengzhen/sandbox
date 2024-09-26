package proj_1;
import java.util.Scanner;
//import java.util.HashSet;

class CPersonData{
	public String nameString;
	public String degree;
	private String p_id;
	private int salary;	
	
	public void firstLine() {
		System.out.println("姓名       職別       月薪資");
		System.out.println("~~~~~~     ~~~~~~     0");
	}
	public void data(String nameString, String degree, String p_id, String salary) {
		
	}
}

class CPersonAccount{
	private CPersonData personArr[];
	
}

public class s1114564_2 {
	public static void main(String[] args) {
		System.out.println("請選擇作業(i=輸入資料 s=依月薪資排序 d=顯示資料 q=離開");
		//Scanner scanner = new Scanner();
		CPersonData cp = new CPersonData();
		cp.firstLine();
	}
}	
	
//設計一個無含參數的建構子，
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//HashSet<Integer> hset = new HashSet<>();//contains remove containsAll
//public static void triangle(int a, int b, int c) throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {//if throw new NotTriangle();
//class NotTriangle extends Exception {public NotTriangle() {super("不構成三角形");
