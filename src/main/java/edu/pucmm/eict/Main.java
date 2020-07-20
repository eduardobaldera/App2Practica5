package edu.pucmm.eict;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(javalinConfig -> {
        }).start(7200);

        app.get("/", ctx -> ctx.result("Aplicacion2 en el puerto 7200"));
    }
}
