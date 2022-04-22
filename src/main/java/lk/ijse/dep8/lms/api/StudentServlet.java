package lk.ijse.dep8.lms.api;

import jakarta.json.*;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import lk.ijse.dep8.lms.api.utill.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
if (request.getContentType()== null || !request.getContentType().toLowerCase().startsWith("application/json")){
    response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
    return;



}
//        BufferedReader reader = request.getReader();
//        StringBuilder sb = new StringBuilder();
//        reader.lines().forEach(line -> sb.append(line+"\n"));
//        System.out.println(sb.toString());
        Jsonb jsonb = JsonbBuilder.create();
        List<Customer>customerList=jsonb.fromJson(request.getReader(),
                new ArrayList<Customer>(){}.getClass().getGenericSuperclass());

        customerList.forEach(System.out::println);

        List<Customer>anotherCustomerList= new ArrayList<>();
        anotherCustomerList.add(new Customer("C001","Nuwan","Galle"));
        anotherCustomerList.add(new Customer("C001","Nuwan","Galle"));
        anotherCustomerList.add(new Customer("C001","Nuwan","Galle"));
        anotherCustomerList.add(new Customer("C001","Nuwan","Galle"));
        anotherCustomerList.add(new Customer("C001","Nuwan","Galle"));

//        JsonReader jsonReader = Json.createReader(request.getReader());
////        JsonObject jsonObject = jsonReader.readObject();
//        JsonArray array = jsonReader.readArray();
//        for (int i = 0; i < array.size(); i++) {
//            JsonObject elm1 = array.getJsonObject(i);
//            System.out.println(elm1.getString("NIC"));
//            System.out.println(elm1.getString("name"));
        }
//        System.out.println(jsonObject.getString("name"));
//        System.out.println(jsonObject.getString("NIC"));
//        System.out.println(jsonObject.getString("email"));


//        response.setContentType("Application/json");
//        JsonWriter jsonWriter = Json.createWriter(response.getWriter());
//        JsonObjectBuilder objectBuilder=Json.createObjectBuilder();
//        objectBuilder.add("id","C005");
//        objectBuilder.add("name","Ruwan");
//        JsonObject object=objectBuilder.build();
//        jsonWriter.writeObject(object);


//        response.setContentType("Application/json");
//        JsonWriter jsonWriter = Json.createWriter(response.getWriter());
//        JsonArrayBuilder arrayBuilder=Json.createArrayBuilder();
//        arrayBuilder.add(10);
//        arrayBuilder.add(false);
//        arrayBuilder.add(Json.createArrayBuilder().add(10).add(20).build());
//        arrayBuilder.add(Json.createObjectBuilder().add("id","C001")
//       .add("name","Amila").build());
//        JsonArray jsonArray=arrayBuilder.build();
//        jsonWriter.writeArray(jsonArray);
//    }

}
