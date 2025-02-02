class Solution {
    double calc(double b, int e){
        if(e == 0) return 1;
        else if(e == 1) return b;
        double sol = calc(b,e/2);
        if(e % 2 == 0)
            return sol * sol;
        else return b * sol * sol;
    }
    double power(double b, int e) {
        if(e < 0) return 1.0/calc(b,e);
        return calc(b,e);
    }
}
