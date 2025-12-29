package TwoPointer;

import java.util.Arrays;

public class Apartment {
    public static void main(String[] args) {
        int applicant[]=new int[]{60,45,80,60};
        int apartment[]=new int[]{30,60,75};
        int diff=5;
        Arrays.sort(applicant);
        Arrays.sort(apartment);
        int count=0;
        int i=0;
        int j=0;
        while(i!=applicant.length && j!=apartment.length){
            if(applicant[i]>=(apartment[j]-diff) && applicant[i]<=(apartment[j]+diff)){
                count++;
                i++;
                j++;
            }
            else if(applicant[i]<(apartment[j]-5)){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(count);
    }
}
