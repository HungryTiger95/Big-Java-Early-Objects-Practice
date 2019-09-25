package exercise_08;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
        Total total = new Total();
        ThreadGroup tg = new ThreadGroup("Word Count");

        for(final String arg : args)
        {
            WordCount wc = new WordCount(arg, total);
            Thread wct = new Thread(tg, wc);
            wct.start();
        }
    }
}
