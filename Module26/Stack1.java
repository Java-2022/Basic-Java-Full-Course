
package encapsulation;

public class Stack1 {
	private int content[] = new int[10];
	private int index=0;
	private boolean empty() {
		return (index==0)?true:false;
	}
 private boolean full() {
	 return (index>9)?true:false;
 }
 boolean push(int i) {
	 if(!full())
	 {
		 content[index++]=i;
		 return true;
	 }
	 else
		 return false;
 }
 int pop() {
	if(!empty())
		return content[--index];
	else
		return -1;
	}
 
}