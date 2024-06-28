class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ansList.add(generateRows(i));
        }
        return ansList;
    }

    static List<Integer> generateRows(int row){
        List<Integer> ansRow = new ArrayList<>();
        int ans=1;
        ansRow.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
}
