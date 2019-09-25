package ar.com.pasoVar;

public class Result {

    private int resultSum;
    private int resultSubtraction;
    private Integer resultSum1;
    private Integer resultSubtraction1;
    private int multiplication;
    private int division;

    public Result(){

    }

    public void setResultSum(int resultSum){
        this.resultSum = resultSum;
    }

    public int getResultSum() {
        return resultSum;

    }

    public void setResultSum1(Integer resultSum1){
        this.resultSum1 = resultSum1;
    }

    public Integer getResultSum1() {
        return resultSum1;
    }

    public void setResultSubtraction(int resultSubtraction){
        this.resultSubtraction = resultSubtraction;

    }

    public int getResultSubtraction() {
        return resultSubtraction;

    }

    public void setResultSubtraction1(Integer resultSubtraction1){
        this.resultSubtraction1 = resultSubtraction1;

    }

    public Integer getResultSubtraction1() {
        return resultSubtraction1;
    }

    public void setMultiplication(int multiplication){
        this.multiplication = multiplication;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setDivision(int division){
        this.division = division;
    }

    public int getDivision(){
        return  division;
    }
}
