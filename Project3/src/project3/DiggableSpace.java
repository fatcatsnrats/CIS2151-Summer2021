package project3;

public class DiggableSpace extends Space implements isDiggable {

    @Override
    public boolean dig(Player player) {
        if (player.canDig()) {
            setDescription("you dug a hole in this space");
            return true;
        }
        return false;

    }

}
