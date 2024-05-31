class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumGas = 0;
        for(int g: gas){
            sumGas += g;
        }

        int sumCost = 0;
        for(int c: cost){
            sumCost += c;
        }

        if(sumCost > sumGas){
            return -1;
        }

        int currentGas =0;
        int startingIndex =0;

        for(int i=0;i<gas.length; i++){
            currentGas += gas[i] - cost[i];

            if(currentGas<0){
                currentGas = 0;
                startingIndex = i+1;
            }
        }

        return startingIndex;
        
    }
}