class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas=0;
        int carCurrentGas = 0;
        int start = 0;

        for(int i=0;i<n;i++){
            totalGas += (gas[i]-cost[i]);
            carCurrentGas += (gas[i]-cost[i]);

            if(carCurrentGas < 0){
                carCurrentGas = 0;
                start = i+1;
            }
        }
        return totalGas<0 ? -1: start;
    }
}