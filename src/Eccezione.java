public class Eccezione {
    public void divisionBy0(int numerator, int denominator) {
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Impossibile dividere per 0");
            }
            int division = numerator / denominator;
            System.out.println(division);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
