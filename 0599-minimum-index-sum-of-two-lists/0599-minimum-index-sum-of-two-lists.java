class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> pos = new HashMap<>();
        for(int i=0;i<list1.length;i++) pos.put(list1[i],i);
        int best=Integer.MAX_VALUE;
        List<String> ans=new ArrayList<>();
        for(int j=0;j<list2.length;j++){
            if(pos.containsKey(list2[j])){
                int sum=pos.get(list2[j])+j;
                if(sum<best){
                    best=sum;
                    ans.clear();
                    ans.add(list2[j]);
                } else if(sum==best){
                    ans.add(list2[j]);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}
