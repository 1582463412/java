package swpu;

public class Student {
	public String number;
	 public String name;
	 public String major;
	 
	 public int math;
	 public int computer;
	 public int english;
	 public int total;
	 //对象数组初始化,使用构造方法
	 public Student(String newname,String nmajor,String newnumber,int nmath,int ncom,int ne){
	 number = newnumber;
	 major =nmajor;
	 name = newname;
	 math = nmath;
	 computer = ncom;
	 english = ne; 
	 } 
	 public String getMajor() {
	 return major;
	 }
	 public void setMajor(String major) {
	 this.major = major;
	 }
	 public int getEnglish() {
	 return english;
	 }
	 public void setEnglish(int english) {
	 this.english = english;
	 }
	 public String getNumber() {
	 return number;
	 }
	 public void setNumber(String number) {
	 this.number = number;
	 }
	 public String getName() {
	 return name;
	 }
	 public void setName(String name) {
	 this.name = name;
	 }
	 public int getMath() {
	 return math;
	 }
	 public void setMath(int math) {
	 this.math = math;
	 }
	 public int getComputer() {
	 return computer;
	 }
	 public void setComputer(int computer) {
	 this.computer = computer;
	 }
}
