
package module28;

public class Stack {
 int content[] = new int[10];
 int index=0;
 boolean empty() {
	 try{
		 if(index==0) throw new StackEmptyExecption();
	 }catch (StackEmptyExecption e) {
		System.out.println(e);
	}
		return (index==0)?true:false;
			}
 boolean full() {
	 try{
		 if(index>9) throw new StackFullExecption(index);
	 }catch (StackFullExecption e) {
		System.out.println(e);
	}
	 return (index>9)?true:false;
 }
 void push(int i) {
	 content[index++]=i;
 }
 int pop() {
	 return content[--index];
 }
	}
