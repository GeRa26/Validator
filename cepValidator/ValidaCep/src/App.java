import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        Validator("^[0-9]{5}-[0-9]{3}$", "50710-001");
        //test cep^^
        Validator("0?[0-9]{2}[0-9]{4,5}[-]*[0-9]{4}", "08199516009");
        //test telephone ^^ 
        Validator("[A-Z]{1}[a-z]*", "Geraldo");
        //test name^^ 
        Validator("[+||-]?[0-9]{1,}[,||.]?[0-9]*", "15,01");
        //test fracionary numbers^^  
        Validator("^[a-z0-9+_.-]+@[a-z]+[.][a-z]{2,3}+[.]*[a-z]*", "geraldo@outlook.com.br");
        //test email^^
    }

    public static void Validator(String expressionRule, String expression) {
        Pattern Regra = Pattern.compile(expressionRule);
        Matcher matcher = Regra.matcher(expression);
        if(matcher.matches()){
            System.out.println("{VALID}");  
        }else{
            System.out.println("{NOT VALID}");
        }       
    }
}
