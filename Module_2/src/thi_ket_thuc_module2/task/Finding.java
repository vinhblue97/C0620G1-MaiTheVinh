package thi_ket_thuc_module2.task;

import thi_ket_thuc_module2.models.Telephone;

import java.util.ArrayList;
import java.util.List;

public class Finding {
    List<Telephone> telephoneNumberLists = new ArrayList<>();
    public Finding( List<Telephone> telephoneNumberLists){
        this.telephoneNumberLists = telephoneNumberLists;
    }

    public void find(){
        System.out.println("Enter the number phone or name: ");
    }
}
