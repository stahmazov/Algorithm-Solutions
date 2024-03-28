import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        lists.add(innerList);

        for (int i=1; i<numRows; i++){
            lists.add(new ArrayList<>(i));
            lists.get(i).add(1);
            for (int j=0; j<i+1; j++){
                if (j==i-1){
                    lists.get(i).add(1);
                    break;
                }
                lists.get(i).add(lists.get(i-1).get(j)+lists.get(i-1).get(j+1));
            }
        }
        return lists;
    }
}
