public class largeststring{
    public static void main(String []args){
        String str[]={"Shashank","Kanahiya","Kishu"};
        String largest=str[0];
        for (String str1 : str) {
            if (largest.compareToIgnoreCase(str1) < 0) {
                largest = str1;
            }
        }
        System.out.println(largest);
    }
}