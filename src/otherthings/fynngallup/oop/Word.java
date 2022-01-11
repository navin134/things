package otherthings.fynngallup.oop;

public class Word {
    private String paragraph;
    private String sep;
    private String[] exclusions;
  
  
    public Word() {
        this(" ");
   
    }

    public Word(String sep) {
        this.sep = sep;
        this.paragraph = "Default paragraph";
        String[] placeHolder = {
        "", " ", "[", "]", "{", "}",
        "#", "%","^", "*", "+", "=",
        "_", "€", "|", "~", "<", ">",
        "£", "¥", "•", ".", ",", "?",
        "!", "'", "-", "/", ":", ";",
        "(", ")", "$", "&", "@", "\\"};
        this.exclusions = placeHolder;
        
    }
     
   
  
    public String sep(){
        return this.sep;
     
    }
   
    public void sep(String sep) {
        this.sep = sep;
  
    }
  
    public String paragraph() {
        return this.paragraph;
     
    }
  
    public void paragraph(String paragraph) {
        this.paragraph = paragraph;
     
    }
  
    public String[] exclusions() {
        return this.exclusions;
     
    }
  
    public void exclusions(String[] exclusions) {
        this.exclusions = exclusions;
  
    }
  
    public int WordCount() {
        int wordCount = 1;
        for(int i = 0; i < this.paragraph.length()-1; i++) {
            String check = paragraph.substring(i, i+1);
            String after = paragraph.substring(i+1, i+2);
            if((check.equals(this.sep)) && (excluChecker(after))) {
                wordCount++;
                
            }
        }

        return wordCount;
    }
  
    private boolean excluChecker(String str) {
        boolean returnBool = true;
        for(int i=0; i<exclusions.length; i++) {
            if(str == exclusions[i]) {
                returnBool = false;
                
            }
        }
        
        return returnBool;
    }
   
  }
  
  