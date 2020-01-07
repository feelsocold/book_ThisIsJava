package CHAPTER15_COLLECTIONFRAMEWORK.example05_StackQueue;

import java.util.LinkedList;
import java.util.Queue;

// Queue를 이용한 메시지 큐
public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQ = new LinkedList<Message>();
		
		messageQ.offer(new Message("sendMail", "휴일"));
		messageQ.offer(new Message("sendSMS", "검정치마"));
		messageQ.offer(new Message("sendKaKao", "퍼플"));
		
		while(!messageQ.isEmpty()) {
			Message m = messageQ.poll();
			switch(m.command) {
				case "sendMail" : System.out.println(m.to + "에게 메일을 보냅니다.");
					break;
				case "sendSMS" : System.out.println(m.to + "에게 문자를 보냅니다.");
					break;
				case "sendKaKao" : System.out.println(m.to + "에게 카카오톡 메시지를 보냅니다.");
					break;
				
			}
				
		}
		
	}

}
