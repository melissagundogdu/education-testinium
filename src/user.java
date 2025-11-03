import java.util.Scanner;

public class user {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your userame: ");
        String username = sc.nextLine();

        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        //burada admin ve username i "admin".equalsIgnoreCase(username) && ... gibi, yapmak daha doğru olur.
        //daha güvenlidir.
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Successfully logged in");
        }
        else  {
            System.out.println("Invalid username or password");}

        sc.close();
    }
}