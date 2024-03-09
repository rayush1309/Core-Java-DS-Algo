package array;

public class ProductofArrayExceptself {
    public static void main(String[] args) {
        int []arr= {2,5,7,4};
        int ans[]=product(arr);
        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]+" ");
        }

    }
    public static int[] product(int[] arr) {
        int n=arr.length;
        int[]left=new int[n];
        int[]right=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++) {
            left[i]=left[i-1]*arr[i-1];

        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--) {
            right[i]=right[i+1]*arr[i+1];
        }
        for (int i=0;i<right.length;i++) {
            arr[i]=left[i]*right[i];// ans update in any array here we have taken arr[i]

        }
        return arr;//jisme ans update hua wahi return karna hai


    }

    }

