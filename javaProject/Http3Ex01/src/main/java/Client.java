import org.eclipse.jetty.http3.client.HTTP3Client;
import org.eclipse.jetty.quic.client.ClientQuicConfiguration;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class Client {
    public static void main(String[] args) {
        // Instantiate HTTP3Client.
        SslContextFactory.Client sslContextFactory = new SslContextFactory.Client();
        HTTP3Client http3Client = new HTTP3Client(new ClientQuicConfiguration(sslContextFactory, null));

// Configure HTTP3Client, for example:
        http3Client.getHTTP3Configuration().setStreamIdleTimeout(15000);

// Start HTTP3Client.
        try {
            http3Client.start();
        } catch (Exception e) {
            System.out.println("[에러] : " + e.getMessage());
        }
    }
}
