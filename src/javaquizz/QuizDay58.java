package javaquizz;

public class QuizDay58 {

    public static void main(String[] args) {

        String str = "Java";
        str = str.concat("Quiz").toUpperCase().replace("Z", "");
        System.out.println(str.contains("") + "\n" + str);
    }

}
