module ru.sobinda.java4homeworksjavacore42 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sobinda.java4homeworksjavacore42 to javafx.fxml;
    exports ru.sobinda.java4homeworksjavacore42;
}