/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messagingService;
    
    public MessagingService() {
        this.messagingService = new ArrayList<>();
    }
    
    public void add(Message message) {
        String messages = message.getContent();
        int length = messages.length();
        if (length <= 280) {
        this.messagingService.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        ArrayList<Message> list = new ArrayList<>();
        for (Message file: messagingService) {
            list.add(file);
        }
        return list;
    }
}
