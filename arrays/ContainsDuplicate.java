class Solution {
    public boolean containsDuplicate(int[] nums) {

        int cont=0;
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    cont++;
                }
            }
            if(cont>1){
                return true;
            }
            cont=0;
        }
        return false;
    }
}

//Respuesta correcta class Solution {
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
        if (set.contains(n)) return true;
        set.add(n);
    }
    return false;
}
}

// Complejidad: O(n)
//Guardo valores en un HashSet y detecto si se repiten.
