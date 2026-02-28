// class Solution {
//     public int singleNumber(int[] arr) {
//         int n = arr.length;
        
//         for (int i = 0; i < n; i++) {
//             boolean foundDuplicate = false;
            
//             for (int j = 0; j < n; j++) {
//                 if (i != j && arr[i] == arr[j]) {
//                     foundDuplicate = true;
//                     break;
//                 }
//             }
            
//             if (!foundDuplicate) {
//                 return arr[i];
//             }
//         }
        
//         return -1;
//     }
// }

class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum=sum^arr[i];
        }
        return sum;
    }
}    