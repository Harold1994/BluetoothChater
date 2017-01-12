package xdu.edu.cn.bluetoothchater;

/**
 * Created by Harold on 2017/1/11.
 */

public class ChatMessage {

    static public final int MSG_SENDER_ME = 0;
    static public final int MSG_SENDER_OTHER = 1;

    public int messageSender;
    public String messageContent;
}
