package RabbitMq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class Producer {
    private final static String QUEUE_NAME = "test_rabbit_hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();


        for (int i = 0; i<1000000; i++){
            String message = "bu bir test mesajıdır." + LocalTime.now().toString();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("[X] Sent Message: " + message);
        }

//        channel.close();
//        connection.close();
    }
}
