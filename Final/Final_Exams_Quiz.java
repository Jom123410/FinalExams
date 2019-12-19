import java.util.Scanner;
/**Name:Joseph Oduro Manu
Furpose: This is a Java program that gives the user a final exam test that contains 20 questions
 and displays the final score after the test has been completed*/


public class Final_Exams_Quiz

{
// The set of questions to be answered  
   public static void main(String [] args){
   
      String q1 = "Which of these Git client commands creates a copy of the repository and a working directory in the client’s workspace.\n"
               +   "(a) update\n (b) checkout\n (c) clone\n (d) import\n";
               
      String q2 =  " In Git, if you want to make your local repository reflect changes that have been madein a remote (tracked) repository, you should run the pull command.\n"
                +  "(a) True\n (b) False\n";
                
      String q3 = "In Git, which error would you get if you try to push master-branch changes to a remote repository,and someone else pushed changes to that same branch while you were making your changes?\n"
                + "(a) Rejected\n (b) 404\n (c) 500\n (d) Access denied\n (e) 400 Bad request\n";
   
      String q4 = "If you want to make radical changes to your team’s project and don’t want to impact the rest of the team, you should implement your changes in …\n"
                +  "(a) … a tag.\n (b) … the trunk.\n (c) … the root.\n (d) … a branch.\n";
   
      String q5 = "Imagine that you just joined a development team that uses Git for version control and collaboration.To start contributing to the project, what Git operation would you most likely invoke first?\n"
                +  "(A) checkout\n (b) clone\n (c) export \n (d) revert\n (e) update\n";
                
      String q6 = "The Git clone command does which of the following?\n"
                +  "(a). Creates a working directory\n (b) Makes a local copy of the repository\n (c) Commits a new branch\n(d). a and b\n";
   
      String q7 = "Which Git command changes where the HEAD pointer points and modifies the contents of the working directory?\n"
                + "(a) checkout\n (b). merge\n (c) mv\n (d). pull\n";
                
      String q8 = "Which one of the following is not part of the data structure of a Git repository?"
                + "(a) Body element\n (b) Branch pointer\n (c) Commit object\n (d) HEAD pointer\n";
                
      String q9 = "What is the intermediate code created by the Java compiler?"
                +   "(a) Pseudocode\n (b) Bytecode\n (c) Sourcecode\n (d) Megacode\n";
                
      String q10 = "All Java programs end with what suffix?"
                 + "(a) .com\n (b) .net\n (c) .java\n (d) edu\n";
                 
      String q11 = "What characters contain program blocks?"
                 +  "(a) []\n (b) {}\n (c)()\n (d) “”\n";
                 
      String q12 = "What Punctuation symbols must be at the end of all Java program statements?"
                 +  "(a) comma , (b) colon:\n(c) full stop .(d) semicolon\n";
        
      String q13 = "This type of expression has a value of either true or false.\n"
                 + "(a) binary expression\n (b) decision expression\n (c) unconditional expression\n (d) boolean expression\n";
   
      String q14 = "This is an empty statement that does nothing.\n"
                 + "(a) missing statement\n (b) virtual statement\n (c) null statement\n (d) conditional statement\n";
   
      String q15 = "You can use this method to display formatted output in a console window\n"
                 + "(a) Format.out.println\n (b) Console.format\n (c) System.out.print\n (d) System.out.formatted\n";
   
      
      String q16 = "What is each repetition of a loop known as?\n"
                 + "(a) cycle\n (b) revolution\n (c) orbit\n (d) iteration\n";
   
      
      String q17 = "This type of loop always executes at least once.\n"
                 +  "(a) while\n (b) do-while\n (c) for\n (d) any of these\n";
   
      
      String q18 = "To open a file for writing, you use the following class.\n"
                 +  "(a) PrintWriter\n (b) FileOpen\n (c) OutputFile\n (d) FileReader\n";
   
      
      String q19 = "This type of method does not return a value.\n"
                 +  "(a) null\n (b) void\n (c) empty\n (d) anonymous\n";
   
      
      String q20 = "This statement causes a method to end and sends a value back to the statement that called the method.\n"
                 +   "(a) end\n (b) send\n (c) exit\n (d) return\n";
                 
              // the answers to the questions   
      Question [] questions = {
               new Question(q1, "c"),     
               new Question(q2, "a"),
               new Question(q3, "a"),
               new Question(q4, "d"),
               new Question(q5, "b"),
               new Question(q6, "d"),
               new Question(q7, "a"),
               new Question(q8, "a"),
               new Question(q9, "b"),
               new Question(q10, "c"),
               new Question(q11, "b"),
               new Question(q12, "d"),
               new Question(q13, "d"),
               new Question(q14, "c"),
               new Question(q15, "c"),
               new Question(q16, "d"),
               new Question(q17, "b"),
               new Question(q18, "a"),
               new Question(q19, "b"),
               new Question(q20, "d")
         };
      takeTest(questions);
        
   }            
 

   public static void takeTest(Question [] questions){
      int score = 0;
      Scanner keyboardInput = new Scanner(System.in);
     // Asking for  the user input 
      for(int i = 0; i < questions.length; i++) {
         System.out.println(questions[i].prompt);
         String answer = keyboardInput.nextLine();
         if(answer.equals(questions[i].answer)) {
            score++;
         }        
      
      }// Displaying the score after the test
      System.out.println("You got " + score + "/" + questions.length);
   }  
}         
       
      



