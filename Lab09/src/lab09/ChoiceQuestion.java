package lab09;

public class ChoiceQuestion extends Question {

    private String[] choices;
    int index;

    public ChoiceQuestion() {
        choices = new String[4];
        index = 0;
    }

    public ChoiceQuestion(String text, String answer) {
        super(text, answer);
    }

    public void addChoice(String choice, boolean status) {
        choices[index] = choice;
        index++;
        if (status == true) {
            setAnswer(choice);
        }
    }

    @Override
    public void display() {
        super.display();
        for (int i = 0; i < choices.length; i++) {
            System.out.println("  " + (i + 1) + " ) " + choices[i]);
        }
        System.out.println("===========================");
    }
}
