class Solution {
    public int solution(int[] A) {
        int goingEast = 0;
        int passing_cars = 0;
        if(A.length <= 1){
            return 0;
        }
        for (int i = 0; i < A.length; ++i){
            if(A[i] == 0 ) {
                ++goingEast;
            }
            else{
                passing_cars+=goingEast;
                if (passing_cars > 1000000000){
                    return -1;
                }
            }
        }


        return passing_cars;

    }
}