//package com.jameszhz.jupiter;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.jameszhz.jupiter.entity.response.Game;
//import org.apache.commons.io.IOUtils;
//import org.json.JSONObject;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/game")
//public class HelloServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Read game information from request body
//        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
//        String name = jsonRequest.getString("name");
//        String developer = jsonRequest.getString("developer");
//        String releaseTime = jsonRequest.getString("release_time");
//        String website = jsonRequest.getString("website");
//        float price = jsonRequest.getFloat("price");
//
//        // Print game information to IDE console
//        System.out.println("Name is: " + name);
//        System.out.println("Developer is: " + developer);
//        System.out.println("Release time is: " + releaseTime);
//        System.out.println("Website is: " + website);
//        System.out.println("Price is: " + price);
//
//        // Return status = ok as response body to the client
//        response.setContentType("application/json");
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("status", "ok");
//        response.getWriter().print(jsonResponse);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        response.setContentType("application/json");
////        JSONObject game = new JSONObject();
////        game.put("name", "World of Warcraft");
////        game.put("developer", "Blizzard Entertainment");
////        game.put("release_time", "Feb 11, 2005");
////        game.put("website", "https://www.worldofwarcraft.com");
////        game.put("price", 49.99);
////
////        // Write game information to response body
////        response.getWriter().print(game);
//
//        response.setContentType("application/json");
//        ObjectMapper mapper = new ObjectMapper();
//        Game.Builder builder = new Game.Builder();
//        builder.setName("NBA 2K");
//        builder.setDeveloper("2K");
//        builder.setReleaseTime("Feb 11, 2005");
//        builder.setWebsite("https://www.worldofwarcraft.com");
//        builder.setPrice(49.99);
//
//
//        Game game = builder.build();
//        response.getWriter().print(mapper.writeValueAsString(game));
//    }
//}
