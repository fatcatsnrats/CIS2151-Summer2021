
package project3;

import java.util.ArrayList;

public class Player {
    
    
    String name;
    ArrayList<String> listOfFriends;
    ArrayList<String> trustedFriends;
    String [] tools;
    boolean canDig;
    boolean canBuild;
    boolean canChop;
    int toolCounter;

    public boolean canBuild() {
          for (int i = 0;i <= 10; i++ ) {
           System.out.println(tools[i]);
           if (tools[i].equalsIgnoreCase("hammer")) {
               return true;
           } 
       }
       return false;
    }

    public void setCanBuild(boolean canBuild) {
        this.canBuild = canBuild;
    }

    public boolean canChop() {
          for (int i = 0; i <= 10; i++ ) {
           System.out.println(tools[i]);
           if (tools[i].equalsIgnoreCase("axe")) {
               return true;
           } 
       }
       return false;
    }

    public void setCanChop(boolean canChop) {
        this.canChop = canChop;
    }
    
    
    public Player() {
        tools = new String[10];
        listOfFriends = new ArrayList<>();
        trustedFriends = new ArrayList<>();
        
    }

    public boolean isCanDig() {
        return canDig;
    }

    public boolean canDig() {
       for (int i = 0;i <= 10; i++ ) {
           System.out.println(tools[i]);
           if (tools[i].equalsIgnoreCase("shovel")) {
               return true;
           } 
       }
       return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getTrustedFriends() {
        return trustedFriends;
    }

    public void setTrustedFriends(String trustedFriend) {
        trustedFriends.add(trustedFriend);
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListOfFriends() {
        return listOfFriends;
    }

    public void setListOfFriends(String friend) {
        listOfFriends.add(friend);
    }

//    public boolean canDig()
//    {
//        return true;
//    }

    public String[] getTools() {
        return tools;
    }

    public void setTools(String tool) {
        tools[toolCounter] = tool;
        toolCounter++;
    }
    
    
}
