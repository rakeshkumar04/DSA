class Compute {
    public int largest(int arr[], int n)
    {
        int largestNo = arr[0];
        for (int i=0; i<n ; i++){
            if(arr[i]>largestNo){
                largestNo=arr[i];
            }
        }
        return largestNo;
    }
}
