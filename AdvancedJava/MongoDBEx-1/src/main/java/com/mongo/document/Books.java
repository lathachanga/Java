package com.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Books {
	@Id
    private String mid;
	@Getter
	@Setter
    private Integer id;
	@Getter
	@Setter
    private String name;
	@Getter
	@Setter
    private double cost;
}
