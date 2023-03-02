//package com.example.springmvcexample2.router;
//
//import com.example.springmvcexample2.service.EmployeeService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.function.RouterFunction;
//import org.springframework.web.servlet.function.ServerResponse;
//
//import static org.springframework.web.servlet.function.RequestPredicates.GET;
//import static org.springframework.web.servlet.function.RouterFunctions.route;
//
//@Configuration
//@RequiredArgsConstructor
//public class EmployeeRouter {
//
//    private final EmployeeService employeeService;
//
//    @Bean
//    public RouterFunction<ServerResponse> employeeGetRouter() {
//        return
//                route(
//                        GET("employee/{id}"),
//
//                        request -> ServerResponse
//                        .ok().body(employeeService.findById(Long.valueOf(request.pathVariable("id")))));
//
//    }
//
//    @Bean
//    public RouterFunction<ServerResponse> employeeGetAllRouter() {
//        return
//                route(GET("employee"), request -> ServerResponse.ok().body(employeeService.findAll()));
//    }
//}
