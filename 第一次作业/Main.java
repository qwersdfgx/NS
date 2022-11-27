public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public int[]twoSum(int[]nums,int target){
        int n= nums.length;
        for(int i=1;i<n;++i){
            for(int j=i+1;j<n;++j){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
        }
        public boolean isPalindrome(int x){
        if(x<0)
            return false;
        int a=0;
            int b=x;
            do{
                a=a*10+b%10;
                b=b/10;
            }while(b>0);
            if(a==x)
                return true;
            else
                return false;

        }
        }
