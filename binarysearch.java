public class binarysearch{
    public static void main(String[] args){
        int[] arr={9,8,5,7};
        //System.out.println(search(arr,0));
        System.out.println(ascordec(arr));
    }
    public static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] < target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        //checking the array is in ascending order or decending order

    }
    public static boolean ascordec(int[] arr){
        int start=0;
        int end=arr.length-1;
        boolean asc=false;
        if(arr[start]<arr[end]){
            return asc=true;
        }
        else{
            return asc=false;
        }
    }
}