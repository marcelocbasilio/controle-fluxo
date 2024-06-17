public class ParametrosInvalidosException extends Exception {

    @Override
    public String getMessage() {
        return "O parâmetro dois deve ser maior que o parâmetro um.";
    }
}
