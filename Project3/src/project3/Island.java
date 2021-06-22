package project3;

import java.util.ArrayList;
import java.util.Random;

public class Island {

    ArrayList<ArrayList<Space>> grid;

    public Island() {
        grid = new ArrayList<ArrayList<Space>>();
        Random random = new Random();

        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            grid.add(new ArrayList<Space>());
            for (int columnIndex = 0; columnIndex < 12; columnIndex++) {
                grid.get(rowIndex).add(
                        new Space("Random space: "
                                + Integer.toString(random.nextInt(1000))));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int rowIndex = 0; rowIndex < grid.size(); rowIndex++) {
            for (int columnIndex = 0; columnIndex < grid.get(rowIndex).size(); columnIndex++) {
                builder.append("Row: ");
                builder.append(rowIndex);
                builder.append(" Column: ");
                builder.append(columnIndex);
                builder.append(": ");
                builder.append(grid.get(rowIndex).get(columnIndex).getDescription());
                builder.append("\n");
            }
        }

        return builder.toString();

    }
}
