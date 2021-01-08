package util;

import java.awt.*;

public class ColorUtil {
    public static Color blueColor = Color.decode("#30475e");
    public static Color grayColor = Color.decode("#222831");
    public static Color backgroundColor = Color.decode("#dddddd");
    public static Color warningColor = Color.decode("#f05454");

    public static Color getByPercentage(int per) {
        if (per > 100)
            per = 100;
        int r = 51;
        int g = 255;
        int b = 51;
        float rate = per / 100f;
        r = (int) ((255 - 51) * rate + 51);
        g = 255 - r + 51;
        Color color = new Color(r, g, b);
        return color;
    }
}
