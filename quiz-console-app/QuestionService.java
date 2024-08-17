import java.util.Scanner;

public class QuestionService {
    Question[] questions =new Question[2];
    String[] selections=new String[2];

    
    public QuestionService() {
       questions[0]=new Question(1, "Size of int", "2", "1", "3", "4", "4");
       questions[1]=new Question(2, "Size of double", "2", "1", "3", "4", "2");
    }


    public void playQuiz(){
        int n=0;
        for(Question q:questions){
            System.out.println("Question no.:"+q.getId());
            System.out.println("Question:"+q.getQuestion());
            System.out.println("Question no.:"+q.getOpt1());
            System.out.println("Question no.:"+q.getOpt2());
            System.out.println("Question no.:"+q.getOpt3());
            System.out.println("Question no.:"+q.getOpt4());
            Scanner sc=new Scanner(System.in);
            selections[n]=sc.nextLine();
            n++;

        }
        
    }

    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            String actualAnswer=questions[i].getAnswer();
            String userAnswer=selections[i];
            if(userAnswer.equals(actualAnswer)){
                score++;
            }

        }
        System.out.println("Score:"+score);
    }
}
