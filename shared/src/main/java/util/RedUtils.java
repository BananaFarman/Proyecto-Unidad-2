package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RedUtils {
    public static String obtenerIpLocal() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException("No se pudo obtener la IP local", e);
        }
    }
}
