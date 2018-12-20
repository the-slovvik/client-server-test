package pl.slovvik.client;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pl.slovvik.Client;

class ClientTest {

    private static final String HOST = "localhost:8000";

    private Client client;

    @BeforeAll
    void setup() {
        client = new Client(HOST);
    }

    @Test
    @Tag("Test client connection")
    void shouldConnectToServer() {
//        ConnectionResponse client.connect()
    }
}
