package JavaTutorial;

public class ex {

		    public static void func(int a, int b) {
		        int ans = 1;
		        for(int i = 0; i < b; i++) {
		            ans *= a;
		        } 
		        System.out.print(ans);
		    }

		    public static void main(String arg[]) {
		        func(2, 5);
		    }
		}
/*
When the program runs, the main method is executed first.
main calls func(2, 5), so a is 2 and b is 5.
In func, ans starts at 1.
The for loop runs 5 times:
First iteration: ans = 1 * 2 = 2
Second iteration: ans = 2 * 2 = 4
Third iteration: ans = 4 * 2 = 8
Fourth iteration: ans = 8 * 2 = 16
Fifth iteration: ans = 16 * 2 = 32
After the loop, ans is 32, which is 2^5.
System.out.print(ans); prints 32 to the console.
*/