import java.io.IOException;

public class Streamer {

    private static final int MULTIPLE = 1000;

    private final String lyric;
    private final double[] delays;

    private Streamer(String lyric, double[] delays) {
        this.lyric = lyric;
        this.delays = delays;
    }

    public static Streamer create(final String lyric, final double[] delays) {
        return new Streamer(lyric, delays);
    }

    public void stream(Appendable out) throws IOException {
        for (int i = 0; i < this.lyric.length(); i++) {
            out.append(this.lyric.charAt(i));
            try {

            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    return;
                }

                throw new RuntimeException();
            }
        }
    }
}
