package Looper3;

public class SuperLoopers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 40, a= 2;
    boolean flag = false;
    while(a <= num / 2) {
    	if (num % a == 0) {
    		flag = true;
    		break;
    	}
    }
    if (!flag)
    System.out.println(num + " is a prime number.");
    else
    	System.out.println(num + " is not a prime number.");
	}

}

