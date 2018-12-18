public class Scissor implements Move {

    @Override
    public String getName() {
        return "Scissor";
    }

    @Override
    public boolean defeats(Move move) {
        return "Paper".equalsIgnoreCase(move.getName());
    }
}
