package mood.analyser;

/**
 * Hello world!
 */
public final class MoodAnalyserApp {
    public String msg;
    public MoodAnalyserApp(){
        this.msg=null;
    }
    public MoodAnalyserApp(String msg){
        this.msg=msg;
    }
    public String analyseMood()throws NullPointerException{
        if(this.msg==null){
            throw new NullPointerException();
        }
        if(this.msg.equals("I am in Sad Mood")){
            return "Sad";
        }
        else if(this.msg.equals("Im in any Mood")){
            return "Happy";
        }
        else{
            return "Happy";
        }
    }
    public String analyseMood(String msg) throws MoodAnalyserException {

        if(msg.length()==0){
            throw new MoodAnalyserException("Enter a valid String");
        }
        if(msg.equals("I am in Sad Mood")){
            return "Sad";
        }
        else if(msg.equals("Im in any Mood")){
            return "Happy";
        }
        else{
            return "Happy";
        }
    }
}
