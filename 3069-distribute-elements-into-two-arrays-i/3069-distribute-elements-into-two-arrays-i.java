class Solution {
    public int[] resultArray(int[] nums) {
        
        int [] arr1 = new int[nums.length];
        int cont1=0;
        int [] arr2 = new int[nums.length];
        int cont2=0;

        arr1[0] = nums[0];

        arr2[0] = nums[1];

        for (int i =2; i<nums.length; i++){
            if (arr1[cont1]>arr2[cont2]){
                arr1[cont1+1] = nums[i];
                cont1 = cont1 +1;


            }else{
                arr2[cont2+1] = nums[i];
                cont2 = cont2 +1;
            }
        }

        int [] resultado = new int[nums.length];

            for(int i = 0; i<=cont1; i++){
                resultado[i] = arr1[i];
            
             }
              for(int i = 0; i<=cont2; i++){
                 resultado[i+cont1+1] = arr2[i];
              }
                
                return resultado;
        
    }
}    