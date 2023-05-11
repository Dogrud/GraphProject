package business;

import java.util.ArrayList;

public class Service {
    public static void main(String[] args) {
        String text = "Gallery unveils interactive tree, A Christmas tree that can receive text messages has been unveiled at London's Tate Britain art gallery. "
                + "The spruce has an antenna which can receive Bluetooth texts sent by visitors to the Tate. "
                + "The messages will be \"unwrapped\" by sculptor Richard Wentworth, who is responsible for decorating the tree with broken plates and light bulbs. "
                + "It is the 17th year that the gallery has invited an artist to dress their Christmas tree. Artists who have decorated the Tate tree in previous years include Tracey "
                + "Emin in 2002. The plain green Norway spruce is displayed in the gallery's foyer. Its light bulb adornments are dimmed, ordinary domestic ones joined together with string. "
                + "The plates decorating the branches will be auctioned off for the children's charity ArtWorks. Wentworth worked as an assistant to sculptor Henry Moore in the late 1960s. "
                + "His reputation as a sculptor grew in the 1980s, while he has been one of the most influential teachers during the last two decades. Wentworth is also known for his photography "
                + "of mundane, everyday subjects such as a cigarette packet jammed under the wonky leg of a table.";
        
        ArrayList<String> texts = ayristir(text); 
        
        NodeManager nodeManager = new NodeManager();
        
        String metin1 = "ali the eve, in  gel sonra  gir.";
        
        String metin = nodeManager.Punctuation(metin1);
        ArrayList<String> wordsArray = nodeManager.Tokenization(metin);
        ArrayList<String> words = nodeManager.StopWord(wordsArray);
        System.out.println(metin);
        
        
        for(String str : words){
            System.out.println(str);
        }
        
    }
    
    
    public static ArrayList<String> ayristir(String text){
        ArrayList<String> texts = new ArrayList<>();
        String[] array = text.split("\\.");
   
        for(String str : array){
            texts.add(str.trim());
        }
        return texts;
    }
    
    public static double textPointCalculate(String text){ 
        double point = 0;
        
        
        return point;
    }
    
    
    
    
    
    
}








