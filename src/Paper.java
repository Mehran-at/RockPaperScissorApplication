public class Paper implements Move {
    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public boolean defeats(Move move) {
        return "Rock".equalsIgnoreCase(move.getName());
    }
}
