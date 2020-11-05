
package optimized.bubble.sort;

/**
 *
 * @author asim
 */
public class OptimizedBubbleSort {
    
    public void bubbleSort(int []arr)
    {
        int temp,lsp=0;
        boolean swapped=false;
        int size=arr.length-1;
        
        for (int i = 0; i < size; i++) {
            
            for (int j = 0; j < size-i; j++) {
                
                if (arr[j]>arr[j+1]) 
                {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
    }
    public void printArray(int []arr)
    {
        for (int i : arr) 
        {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        
        int arr[]={6,8,0,10,7,9,3,1,2};
        OptimizedBubbleSort obj=new OptimizedBubbleSort();
        
        obj.bubbleSort(arr);
        obj.printArray(arr);
        
    }
    
}
