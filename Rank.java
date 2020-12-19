package swpu;

public class Rank {
	public static void rankscore(Student [] arr,int n){
		 //数学
		 if(n==1) {
		 for (int i = 0; i < arr.length-1; i++) {
		  int index = i;
		  int j;
		  // 找出最小值得元素下标
		  for (j = i + 1; j < arr.length; j++) {
		   if (arr[j].math > arr[index].math) {
		   index = j;
		   }
		  }
		  int tmp = arr[index].math;
		  arr[index].math = arr[i].math;
		  arr[i].math = tmp;
		  }
		 }
		 //英语
		 if(n==2) {
		 for (int i = 0; i < arr.length-1; i++) {
		  int index = i;
		  int j;
		  // 找出最小值得元素下标
		  for (j = i + 1; j < arr.length; j++) {
		   if (arr[j].english > arr[index].english) {
		   index = j;
		   }
		  }
		  int tmp = arr[index].english;
		  arr[index].english = arr[i].english;
		  arr[i].english = tmp;
		  }
		 }
		 //计算机
		 if(n==3) {
		 for (int i = 0; i < arr.length-1; i++) {
		  int index = i;
		  int j;
		  // 找出最小值得元素下标
		  for (j = i + 1; j < arr.length; j++) {
		   if (arr[j].computer > arr[index].computer) {
		   index = j;
		   }
		  }
		  int tmp = arr[index].computer;
		  arr[index].computer = arr[i].computer;
		  arr[i].computer = tmp;
		  }
		 }
	}
}
