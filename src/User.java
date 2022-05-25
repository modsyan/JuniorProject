public class useraccount {
    String username;
    int age;
    int height;
    String location;

public useraccount(String username, int age, int height,String location){
this.username=username;
this.age=age;
this.height=height;
this.location=location;
}

public void setusername(String username){
this.username=username;
}

public String getusername(){

    return username;
}

public void setage (int age){

    this.age=age;

}
public int getage(){

    return age;
}

public void setheight(int height){

this.height=height;
}

public int getheight(){
    return height;
}
public void setlocation(String location){
    this.location=location;
}

public void print_all_details(){

    System.out.println("username = " + username);
    System.out.println("age = " + age);
    System.out.println("height = " + height );
    System.out.println("location = "+ location);
}

}