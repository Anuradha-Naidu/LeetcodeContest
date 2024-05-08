// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution{
    
    public boolean canAttendMeetings(int[][] intervals){
        
        if(intervals.length == null || intervals.length == 0){
            return true;
        }
        
        Arrays.sort(intervals, new Comparator<int[]>()){
            public int compare(int[]a, int[]b){
                return a[0]-b[0];
            }
        }
        
        int[] prev = intervals[0];
        for(int i=1; i<intervals.length;i++){
            
            int []curr = intervals[i];
            if(prev[1] > curr[0]){
                return false;
                
            prev = curr;
            }
        
        return true;
        }
        
    }
}

if list interval is given :

 public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return true;
        }

        intervals.sort(Comparator.comparingInt(i -> i.start));

        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (prev.end > curr.start) {
                return false;
            }
            prev = curr;
        }

        return true;
    }
}
