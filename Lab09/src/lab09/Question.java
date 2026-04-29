package lab09;

public class Question {
    private String text ;
    private String answer ;

    public Question() {
        text = null;
        answer = null;
    }

    
    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer.toLowerCase();
    }

    public boolean checkAnswer(String StudentAnswer){
        StudentAnswer = StudentAnswer.toLowerCase();
        return answer.equals(StudentAnswer);
        // or
        // return answer.equals(StudentAnswer.toLowerCase());
    }
    
    public void display(){
        System.out.println("Q ) "+getText());
    }
    
}
