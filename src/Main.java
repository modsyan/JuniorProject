import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        // opjects
        Scanner scan = new Scanner(System.in);
        Users users = new Users();


        // welcome msg and starting program
        // login 
        System.out.println("#----WELCOME IN DATING APPLICATION----#\n--Login--\n");
        String username, password;
        System.out.print("UserName: ");
        username = scan.next();
        System.out.print("Password: ");
        password = scan.next();
        
        if (!username.equals("admin") && !password.equals("admin"))
            return;

        int ask = 0;
        do {
            System.out.println(
                "[1] Add User\n[2] Remove User\n[3] Search\n[4] Show All\n[0] Exit"
            );
            ask = scan.nextInt();

            if (ask == 1)
                users.Rigster();
            else if (ask == 2)
                users.RemoveUser();
            else if (ask == 3)
                users.Search();
            else if (ask == 4)
                users.ShowAll();
        } while (ask != 0);
    }
}
