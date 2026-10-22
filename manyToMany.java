import java.util.*;

class User{
    List<Group> g = new ArrayList<>();
    private String users;

    public User(String user){
        this.users = user;
    }
    public void addGroup(Group gp){
        g.add(gp);
    }
}

class Group{
    List<User> gg = new ArrayList<>();
    private String groupName;

    public Group(String name){
        this.groupName = name;
    }
    public void addUser(User gp){
        gg.add(gp);
    }
}

public class manyToMany {
    public static void main(String[] args) {
        User a1 = new User("Vamshi");
        Group g1 = new Group("Whatsaap");
        g1.addUser(a1);
        a1.addGroup(g1);
    }
}
