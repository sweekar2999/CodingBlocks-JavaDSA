package MoreQuestions;

import java.util.HashSet;
import java.util.Set;

public class Report_Spam_Message {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> packet = new HashSet<>();
        for (String words : bannedWords) {
            packet.add(words);
        }
        int count = 0;
        for (int i = 0; i < message.length; i++) {
            if (packet.contains(message[i])) {
                count++;
            }
            if (count >= 2) {
                return true;  
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        String[] message1 = {"hello", "world", "leetcode"};
        String[] bannedWords1 = {"world", "hello"};
        Report_Spam_Message spamChecker = new Report_Spam_Message();
        System.out.println(spamChecker.reportSpam(message1, bannedWords1)); 
        
        String[] message2 = {"hello", "programming", "fun"};
        String[] bannedWords2 = {"world", "programming", "leetcode"};
        System.out.println(spamChecker.reportSpam(message2, bannedWords2)); 

    }
}
