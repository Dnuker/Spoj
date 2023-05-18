package tictactoe;

public class Map {

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("1 ").append("2 ").append("3\n")
                .append("4 ").append("5 ").append("6\n")
                .append("7 ").append("8 ").append("9\n");
        return sb.toString();
    }
}