package prob5;

public class MyStack {
	
	private String[] stack;
	private int top = -1;
	public MyStack(int i) {
		stack = new String[i];
	}

	// 공간이 있는지 확인해야 함 있으면 넣고 없으면 공간을 만들고 넣어야함
	public void push(String push) {
		if(stack.length-1 <= top) {
			//공간이 없어서 공간을 만들어 줘야한다
			//공간을 두배인 배열을 만든다.
			//원래있는 배열에 인덱스들을 새로만든 배열에 옵긴다
			//그리고 값을 넣는다
			String[] newStack = new String[stack.length*2];
			for(int i = 0; i < stack.length ;i++) {
				newStack[i] = stack[i];
			}
		}
		else {
			stack[++top] = push;
		}
	}

	// 있는지 없는지 확인 있으면 꺼내고 없으면 stackis empty 출력
	public String pop() throws MyStackException {
		if(isEmpty()) {
			//비어있다
			throw new MyStackException("stack is empty");
		}else {
			//탑에있는값을 출력
			return stack[top--];
		}
		
	}
	// 비어 있는지 없는지 확인하기 있으면 true 없으면 false
	public boolean isEmpty() {
		return top < 0;
	}


}