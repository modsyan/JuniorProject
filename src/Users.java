import java.util.LinkedList;
import java.util.Scanner;

public class Users {

    LinkedList<User> users = new LinkedList<User>();
    Scanner scan = new Scanner(System.in);



    public void Rigster() {
        User newUser = new User();
        newUser.creatUser();
        users.add(newUser);
    }

    public void RemoveUser() {
        System.out.println("Enter User Name of User You want to delete");
        String name = scan.next();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name)) {
                System.out.println("Removed Success");
                users.remove(i);
            } else {
                System.out.println("Not Found");
                return;
            }
        }
    }

    public void Search() {

        System.out.println("Enter UserName: ");
        String name = scan.next();

        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getUsername().equals(name))
            {
                System.out.println("Founded!....");
                users.get(i).print_all_details();
            }
            else {
                System.out.println("Not Found");
            }
        }
    }

    public void ShowAll() {
        System.out.print("\n#----Show All Users----#\n");
        for (int i = 0; i < users.size(); i++)
        {
            users.get(i).print_all_details();
            System.out.println();
        }
        System.out.print("\n#----------------------#\n");
    }

}
