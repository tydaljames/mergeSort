public class kLists {

    public double[] mergeKLists(double[][] outerArray){
        if(outerArray.length < 1){
            System.out.println("Nothing to sort");
            double[] array = {};
            return array;
        }
        if(outerArray.length == 1){
            System.out.println("Array sorted.");
            return outerArray[0];
        }

        double[] array = outerArray[0];
            for(int i=1;i<outerArray.length;i++) {
                array = mergeSort(outerArray, array, outerArray[i]);
            }
        return array;
    }

public double[] mergeSort(double[][] outerArray, double[] lArray, double[] rArray){
    double[] array = new double[lArray.length+rArray.length];
    int l=0;
    int r=0;
    int k=0;

    while(l<lArray.length && r<rArray.length && k<array.length){
        if(lArray[l]<=rArray[r]){
            array[k] = lArray[l];
            l+=1;
        }
        else{
            array[k] = rArray[r];
            r+=1;
        }
        k+=1;

    }
    while(l<lArray.length && k<array.length){
        array[k] = lArray[l];
        l+=1;
        k+=1;
    }
    while(r<rArray.length && k<array.length){
        array[k] = rArray[r];
        r+=1;
        k+=1;
    }
    return array;
}


    public void printArr(double[][] array){
        String s = "Array:\n";
        for (int i=0;i<array.length;i++) {
            s += "\r\n";
            for (int j=0;j<array[i].length;j++) {
                    s += (array[i][j]);
                s += " ";
            }
        }
            System.out.println(s);
    }

    public void printArr(double[] array){
        String s = "Array:\n[";
        for (int i=0;i<array.length;i++) {
            s += (array[i]);
            if(i<array.length-1) {
                s += ", ";
            }
        }
        s+="]";
        System.out.println(s);
    }




public static void main(String[] args){
    kLists k = new kLists();
/*    double[][] outerArray = {{1.1,4.4,5.5},
                            {1.1,3.3,4.4},
                            {2.2,6.6}};*/

    double[][] outerArray =  {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};

    k.printArr(outerArray);
    k.printArr(k.mergeKLists(outerArray));


}

}
