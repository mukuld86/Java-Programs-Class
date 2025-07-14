class AvgNum<T extends Number>{
    T[] n;
    AvgNum(T[] t){
        n=t;
    }
    double average(){
        double sum=0.0;
        for(int i=0; i<n.length; i++){
            sum+=n[i].doubleValue();
        }
        return sum/n.length;
    }
}

class Test4{
    public static void main(String[] args) {
        Integer i[]={21,66,8,34,15,5,9,8,7};
        AvgNum<Integer> iob=new AvgNum<Integer>(i);
        System.out.println("Integer array average: "+iob.average());

Double j[]={2.1,6.6,3.8, 3.4, 11.5, 5.69, 6.98, 8.36, 7.36};
        AvgNum<Double> dob=new AvgNum<Double>(j);
        System.out.println("Double array average: "+dob.average());

    }
}