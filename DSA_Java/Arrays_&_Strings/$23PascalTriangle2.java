import java.util.* ;

class $23PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> resultList = new ArrayList<>();
        long val = 1;
        for(int j=0 ; j <= rowIndex ; j++)
        {
            resultList.add((int)val);
            val = val * (rowIndex - j)/(j+1);
        }
        
        return resultList;
    }
}