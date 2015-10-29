public class A {

static class Solution {
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X){
                nX += 1;
                System.out.println("A"+i+"="+A[i]+"-X-"+nX);
            }if (A[i] == Y){
                nY += 1;
                System.out.println("A"+i+"="+A[i]+"-Y-"+nY);
            }if (nX !=0 && nY != 0 && nX == nY){
                result = i;
                System.out.println("nX:"+nX+";nY:"+nY+";result:"+result);
            }
        }
        return result;
    }
}
	
	public A(){
		System.out.print("A");
	}
	
	{
		System.out.print("block");
	}
	
	static {
		System.out.print("static");
	}

    public static final void main(String[] args) {
    	A a = new A();
        int[] b = {6,42,11,7,1,42};
        A.Solution s = new Solution();
        System.out.println();
        System.out.println("final result="+s.solution(42,0,b));
    }
}
