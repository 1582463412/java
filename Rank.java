package swpu;

public class Rank {
	public static void rankscore(Student [] arr,int n){
		 //��ѧ
		 if(n==1) {
		 for (int i = 0; i < arr.length-1; i++) {
		  int index = i;
		  int j;
		  // �ҳ���Сֵ��Ԫ���±�
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
		 //Ӣ��
		 if(n==2) {
		 for (int i = 0; i < arr.length-1; i++) {
		  int index = i;
		  int j;
		  // �ҳ���Сֵ��Ԫ���±�
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
		 //�����
		 if(n==3) {
		 for (int i = 0; i < arr.length-1; i++) {
		  int index = i;
		  int j;
		  // �ҳ���Сֵ��Ԫ���±�
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
