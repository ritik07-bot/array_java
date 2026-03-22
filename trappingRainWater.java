public class trappingRainWater {
    public static void trapping(int height[]){
        int n=height.length;
        
        //Auxillary array
        int leftmax[]=new int[n];//left max boundary
        leftmax[0]=height[0];
       
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
 
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        //right max boundary
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappingWater=0;
        
        //calculate trapping water
        for(int i=0;i<n;i++){
           int waterlevel=Math.min(leftmax[i],rightmax[i]);//minmum height which store water
           trappingWater+=waterlevel-height[i];//formula=(min(lbd,rbd)-heght of that box)*width
        }
        System.out.println("total trapping water is: "+trappingWater);
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        trapping(arr);
    }
}
