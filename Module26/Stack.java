

package encapsulation;

public class Stack {
	int content[] = new int[10];
	int index=0;
	boolean empty() {
		return (index==0)?true:false;
	}
 boolean full() {
	 return (index>9)?true:false;
 }
 void push(int i) {
	 content[index++]=i;
 }
 int pop() {
	 return content[--index];
 }
	}
