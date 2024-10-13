module com.example.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworld to javafx.fxml;
    exports com.example.helloworld;
    exports es.ieslosmontecillos.di_t1a1_shanshangfeng;
    opens es.ieslosmontecillos.di_t1a1_shanshangfeng to javafx.fxml;
}