package module28;

import java.lang.reflect.Executable;

public class StackFullExecption extends Exception{
int size;

public StackFullExecption(int s)
{
	size=s;
}


public String toString()
{
		return "Stack is Full! Maximum size is "+size;
}

}
