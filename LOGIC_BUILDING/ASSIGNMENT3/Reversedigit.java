//. Write a program to reverse the digits of the number 1234. The output should be 4321

class Reversedigit{
	public static void main(String args[]){
	
		int num, reverse=0;
		
		for(num=9654;num!=0;num=num/10)
		{
			int reminder=num%10;
			reverse=reverse*10+reminder;
		}
		System.out.println(reverse);
	}
}

// 4 3 2 1