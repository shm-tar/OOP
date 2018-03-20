package com.tasks3.fibonacci;

public class Fibonacci {
	
	public long getNumber(int position) {
		if (position == 1) {
			return 0;
		}
		else if (position == 2) {
			return 1;
		}
		else if (position >= 3) {
			return getNumber(position-1)+getNumber(position-2);
		}
		else {
			return -1;
		}
	}
}
