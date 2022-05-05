class Stack{
	int size;
	int [] Arr;
	int Top1;
	int Top2;
	Stack(int size){
		Top1=-1;
		this.size=size;
		Arr=new int[this.size];
		Top2=size;
	}
	
	
	void push1(int data){
		if(Top1>Top2-1){
			System.out.println("Stack is full");
			
		}else{
			Top1++;
			Arr[Top1]=data;
		}	
	}
	void push2(int data){
		if(Top1>Top2-1){
			System.out.println("Stack is full");
			
		}else{
			Top2--;
			Arr[Top2]=data;
		}	
	}
	void pop1(){
		if(Top1==-1){
			System.out.println("Stack is empty");
			
		}else{
			int ele=Arr[Top1];
			Top1--;
			System.out.println("Popped element from stack1 is "+ele);
		}	
	}
	void pop2(){
		if(Top2==size){
			System.out.println("Stack is empty");
			
		}else{
			int ele=Arr[Top2];
			Top2--;
			System.out.println("Popped element from stack2 is "+ele);
		}	
	}
	
	public static void main(String [] args){
		
		Stack s=new Stack(10);
		  s.push1(5);
          s.push2(10);
          s.push2(15);
          s.push1(11);
          s.push2(7);
		  s.push2(40);
		  s.pop1();
		  s.pop2();
	}
}