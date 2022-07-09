public class charOccurance {
    public static void main(String[] args) {
        String str = "Hello";
        int arrOfCount[]={}, element[]={}, index = 0,count=0,b[]={},flag=0,sortedIndex[]={},temp=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < b.length; j++) {
                if (str.charAt(i)==b[j]) {
                    flag=1;
                }
            }
            if (flag!=1) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(j)==str.charAt(i)) {
                        count++;
                        
                    }
                }
                // b[index]=str.charAt(i);
                // arrOfCount[index]=count;
                System.out.println(index);
                index++;
            }
            
        }
    //     index=0;
    //     for (int i = 0; i < arrOfCount.length; i++) {
    //         for (int j = i+1; j < arrOfCount.length; j++) {
    //             if (arrOfCount[i]>arrOfCount[j]) {
                   
    //                 temp=sortedIndex[index];
    //                 sortedIndex[index]=j;
    //                 sortedIndex[index+1]=temp;
    //             }
    //         }
    //     }
    //     System.out.println("Element with min occurance is "+b[sortedIndex[0]]);

    }
}
