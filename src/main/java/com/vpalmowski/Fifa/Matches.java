package com.vpalmowski.Fifa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("matches")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Matches {
    @Id
    private String _id;
    private int match;
    private String team;
    private String opponent;
    private String ps1;
    private String ops1;
    private String pcs;
    private String goals;
    private String goalsop;
    private String date;
    private String hour;
    private String category;
}
