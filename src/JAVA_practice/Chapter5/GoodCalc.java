package JAVA_practice.Chapter5;

interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    double avg(int[] a);
}

class GoodCalc implements Calculator{
    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int sub(int a, int b){
        return a-b;
    }
    @Override
    public double avg(int[] a){
        double sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
        return sum/a.length;
    }
}
