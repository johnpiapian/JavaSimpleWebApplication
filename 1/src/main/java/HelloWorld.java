import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8000);
        app.get("/", ctx -> ctx.result("<h1><center>This is a test!</center></h1>"));
    }
}