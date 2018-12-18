public class Rock implements Move {
    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean defeats(Move move) {
        return "Scissor".equalsIgnoreCase(move.getName());
    }
}
