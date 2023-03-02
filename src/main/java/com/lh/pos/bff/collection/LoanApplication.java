package com.lh.pos.bff.collection;


import com.lh.pos.bff.dom.MESSAGE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loan_application")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanApplication {
    @Id
    private String id;
    private String loanNumber;
    private MESSAGE message;
    private java.util.Date lastUpdatedAt;
}
