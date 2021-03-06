package bag;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YoSaukit
 * @date 2019/11/2 20:33
 */
public class No39_40_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        No39_40_CombinationSum combinationSum = new No39_40_CombinationSum();
        System.out.println(combinationSum.combinationSum(candidates,target).toString());
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
//        getResult(result,new ArrayList<>(),candidates,target,0);
        getResult(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public void getResult(List<List<Integer>> result,List<Integer> cur,int[] candidates,int target,int start){
        if (target>0){
            for (int i = start; i < candidates.length&&candidates[i]<=target ; i++) {
                cur.add(candidates[i]);
                getResult(result,cur,candidates,target-candidates[i],i);
                cur.remove(cur.size()-1);
            }
        }else if (target == 0){
            result.add(new ArrayList<>(cur));
        }
    }



}
