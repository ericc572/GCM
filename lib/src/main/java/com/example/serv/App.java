package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDLCsHvbkhz1oVi4r-Th4T5aS3Nw1IGDDY";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bHH7Z6e04GcgJwerqIeI1y4UlwWnxfBQAO6_qD17wKkFvsjSFzoG7xPTfqQoQZ-SIPzhaWaD7cd0FChyEB-Ir9VtOJbeNd4x0LoXYgNv_zGS2AvCkRqsi8e3Mn0ylVmD3im3enp");

        c.createData("Working!!", "Test message");

        return c;
    }
}

