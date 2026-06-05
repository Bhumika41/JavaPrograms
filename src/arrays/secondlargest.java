package arrays;

class secondlargest{
    public static void main(String[] args){
        int[] arr = {100,130,150,200,60};
        int lar = arr[0];
        int sec = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > lar){
                sec=lar;
                lar=arr[i];
            } else if(arr[i]>sec && arr[i]!= lar){
                sec=arr[i];
            }
        }
        System.out.println("Second Largest:" + sec);
    }
}