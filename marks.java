import java.util.Scanner;
public class marks{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("* Welcome to Shashank Report Card Management System ! *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");

        int n, s;

        System.out.print("Enter the total number of students :-> ");
        n = sc.nextInt();
        System.out.print("Enter the total number of subjects :-> ");
        s = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] sub = new String[s + 1]; // Student sub1 sub2 ....
        sub[0] = "Student";
        String[] name = new String[n]; // name1 name2 name3 ....
        int[][] arr = new int[n][s]; // student1sub1 student2sub2 ...

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of Student :-> ");
            name[i] = sc.nextLine();
        }

        for (int i = 0; i < s; i++) {
            System.out.print("Enter the Subject Name :-> ");
            sub[i + 1] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks for " + name[i] + " : ");
            for (int j = 0; j < s; j++) {
                System.out.print(sub[j + 1] + " -> ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<=s;i++){
            System.out.print(sub[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(name[i]+" ");
            for(int j=0;j<s;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}
}
