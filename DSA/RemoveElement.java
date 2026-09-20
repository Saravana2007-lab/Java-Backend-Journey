class remove{
    public static int removeElement(int[] nums, int val){
       int k = 0; 
        for (int i = 0; i < nums.length; i++) {
          if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

class RemoveElement{
public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        remove r = new remove();
        int newLength = r.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
}
}