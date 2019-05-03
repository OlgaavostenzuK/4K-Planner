package calendar.ui.main;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLDocumentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label calendarNameLbl;

    @FXML
    private Label monthLabel;

    @FXML
    private JFXComboBox<?> selectedYear;

    @FXML
    private JFXListView<?> monthSelect;

    @FXML
    private VBox centerAreaYear;

    @FXML
    private ScrollPane scrollPaneYear;

    @FXML
    private HBox weekdayHeaderYear;

    @FXML
    private GridPane calendarGridYear;

    @FXML
    private VBox centerArea;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private HBox weekdayHeader;

    @FXML
    private GridPane calendarGrid;

    @FXML
    private VBox centerAreaWeek;

    @FXML
    private ScrollPane scrollPaneWeek;

    @FXML
    private HBox weekdayHeaderWeek;

    @FXML
    private GridPane calendarGridWeek;

    @FXML
    private VBox centerAreaDay;

    @FXML
    private ScrollPane scrollPaneDay;

    @FXML
    private HBox dayHeader;

    @FXML
    private GridPane calendarGridDay;

    @FXML
    private VBox colorRootPane;

    @FXML
    private TextField nameCategory1;

    @FXML
    private JFXColorPicker colorCategory1;

    @FXML
    private JFXCheckBox CheckBoxCategory1;

    @FXML
    private TextField nameCategory2;

    @FXML
    private JFXColorPicker colorCategory2;

    @FXML
    private JFXCheckBox CheckBoxCategory2;

    @FXML
    private TextField nameCategory3;

    @FXML
    private JFXColorPicker colorCategory3;

    @FXML
    private JFXCheckBox CheckBoxCategory3;

    @FXML
    private TextField nameCategory4;

    @FXML
    private JFXColorPicker colorCategory4;

    @FXML
    private JFXCheckBox CheckBoxCategory4;

    @FXML
    private TextField nameCategory5;

    @FXML
    private JFXColorPicker colorCategory5;

    @FXML
    private JFXCheckBox CheckBoxCategory5;

    @FXML
    private JFXCheckBox selectAllCheckBox;

    @FXML
    void deleteAllEvents(MouseEvent event) {

    }

    @FXML
    void handleCheckBoxAction(ActionEvent event) {

    }

    @FXML
    void manageCalendars(MouseEvent event) {

    }

    @FXML
    void newCalendar(MouseEvent event) {

    }

    @FXML
    void selectAllCheckBoxes(ActionEvent event) {

    }

    @FXML
    void updateColors(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert rootPane != null : "fx:id=\"rootPane\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert calendarNameLbl != null : "fx:id=\"calendarNameLbl\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert monthLabel != null : "fx:id=\"monthLabel\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert selectedYear != null : "fx:id=\"selectedYear\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert monthSelect != null : "fx:id=\"monthSelect\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert centerAreaYear != null : "fx:id=\"centerAreaYear\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert scrollPaneYear != null : "fx:id=\"scrollPaneYear\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert weekdayHeaderYear != null : "fx:id=\"weekdayHeaderYear\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert calendarGridYear != null : "fx:id=\"calendarGridYear\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert centerArea != null : "fx:id=\"centerArea\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert scrollPane != null : "fx:id=\"scrollPane\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert weekdayHeader != null : "fx:id=\"weekdayHeader\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert calendarGrid != null : "fx:id=\"calendarGrid\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert centerAreaWeek != null : "fx:id=\"centerAreaWeek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert scrollPaneWeek != null : "fx:id=\"scrollPaneWeek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert weekdayHeaderWeek != null : "fx:id=\"weekdayHeaderWeek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert calendarGridWeek != null : "fx:id=\"calendarGridWeek\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert centerAreaDay != null : "fx:id=\"centerAreaDay\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert scrollPaneDay != null : "fx:id=\"scrollPaneDay\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert dayHeader != null : "fx:id=\"dayHeader\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert calendarGridDay != null : "fx:id=\"calendarGridDay\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert colorRootPane != null : "fx:id=\"colorRootPane\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert nameCategory1 != null : "fx:id=\"nameCategory1\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert colorCategory1 != null : "fx:id=\"colorCategory1\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert CheckBoxCategory1 != null : "fx:id=\"CheckBoxCategory1\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert nameCategory2 != null : "fx:id=\"nameCategory2\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert colorCategory2 != null : "fx:id=\"colorCategory2\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert CheckBoxCategory2 != null : "fx:id=\"CheckBoxCategory2\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert nameCategory3 != null : "fx:id=\"nameCategory3\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert colorCategory3 != null : "fx:id=\"colorCategory3\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert CheckBoxCategory3 != null : "fx:id=\"CheckBoxCategory3\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert nameCategory4 != null : "fx:id=\"nameCategory4\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert colorCategory4 != null : "fx:id=\"colorCategory4\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert CheckBoxCategory4 != null : "fx:id=\"CheckBoxCategory4\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert nameCategory5 != null : "fx:id=\"nameCategory5\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert colorCategory5 != null : "fx:id=\"colorCategory5\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert CheckBoxCategory5 != null : "fx:id=\"CheckBoxCategory5\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert selectAllCheckBox != null : "fx:id=\"selectAllCheckBox\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
}