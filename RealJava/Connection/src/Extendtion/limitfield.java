
package Extendtion;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class limitfield extends PlainDocument{
       private int limit;
       public limitfield(int limitation){
           this.limit=limitation;
       }
       public void insert(int offset,String str,AttributeSet set) throws BadLocationException{
           if(str==null){
               return;
           }
           else if((getLength()+str.length())<=limit){
               str=str.toUpperCase();
               super.insertString(offset, str, set);
           }
       }
}
