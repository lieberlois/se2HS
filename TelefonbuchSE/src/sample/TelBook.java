package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class TelBook {
    private final ObservableList<TelNumber> oTelNumbers = FXCollections.observableList(new ArrayList<>());

    public TelBook(){
        addNumber(new TelNumber("Test", "Beta", "1234"));
    }

    public void addNumber(TelNumber telNumber){
        oTelNumbers.add(telNumber);
    }

    public ObservableList<TelNumber> getNumbers(){
        return oTelNumbers;
    }




}
