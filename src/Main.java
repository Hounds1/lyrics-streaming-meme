import java.io.IOException;

public class Main {

    private static final String LYRIC = "月明かり1人で歩く\n" +
            "言いたいことも 言えないままで\n" +
            "ホントの気持ち ホントの感情\n" +
            "も知らないまま 時計は進む\n" +
            "\n" +
            "貴方の優しさが遠くで\n" +
            "\n" +
            "ありふれた日常に\n" +
            "君が居たから\n" +
            "何も無い僕もここまで歩けたの\n" +
            "あやふやな 言葉が 夜に舞う\n" +
            "変わらない温度を思い出す\n" +
            "\n" +
            "覚えてる君のその不器用なとこも\n" +
            "つらいってさ言わずに静かに泣いてるのも\n" +
            "あやふやなこの感情 愛しさも\n" +
            "夢の中 いつか 綺麗な記憶になる\n" +
            "\n" +
            "嗚呼 いつしか何もかもが人生\n" +
            "君の色に染まってく題名\n" +
            "これ以上何も求めないよ\n" +
            "変わらぬままで\n" +
            "\n" +
            "だけど時計の針は残酷でさ\n" +
            "世界は僕を急かし続けてる\n" +
            "いやそう言うとこが弱いのかな\n" +
            "って思う度に\n" +
            "\n" +
            "君をただ 抱きしめていた\n" +
            "\n" +
            "ありふれた日常に\n" +
            "君が居たから\n" +
            "何も無い僕もここまで歩けたの\n" +
            "あやふやな 言葉が 夜に舞う\n" +
            "変わらない温度を思い出す\n" +
            "\n" +
            "覚えてる君のその不器用なとこも\n" +
            "つらいってさ言わずに静かに泣いてるのも\n" +
            "あやふやなこの感情 愛しさも\n" +
            "夢の中 いつか綺麗な記憶になる\n" +
            "\n" +
            "いつか遠くで君の声が\n" +
            "そこにあるって思えたんだ\n" +
            "温もりを満たしてくれたの\n" +
            "本当だったよ\n" +
            "\n" +
            "答えのない夜にさ\n" +
            "また問いかけてしまうこうやって\n" +
            "君は綺麗だよそのままで笑っていてよ";

    private static final double[] DELAYS = {};
    private static final long INITIALIZE = (long) 11.5d * 1000;

    public static void main(String[] args) throws IOException {
        try {
            Thread.sleep(INITIALIZE);
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                return;
            }

            throw new RuntimeException();
        }

        Streamer streamer = Streamer.create(LYRIC, DELAYS);
        streamer.stream(System.out);
    }
}